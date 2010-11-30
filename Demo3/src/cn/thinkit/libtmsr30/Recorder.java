/*********************************************
 * ANDROID SOUND PRESSURE METER APPLICATION
 * DESC   : Recording Thread that calculates SPL.  
 * WEBSRC : Recording : http://www.anddev.org/viewtopic.php?p=22820
 * AUTHOR : hashir.mail@gmail.com
 * DATE   : 19 JUNE 2009
 * CHANGES: - Changed the recording logic
 * 			- Added logic to pass recorded buffer to FFT
 * 			- Added logic to calculate SPL.
 *********************************************/

package cn.thinkit.libtmsr30;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Calendar;

import android.media.AudioFormat;
import android.media.AudioRecord;
import android.media.MediaRecorder;
import android.os.Handler;
import android.os.Message;


public class Recorder implements Runnable {
	private int frequency;
	private int channelConfiguration;
	private File fileName;
	private volatile boolean isRecording = false;;
	
	Handler handle;
	private static final int MY_MSG = 1;
	private JNI mVREngine;
	long mVocHandle = 0;
	
	long startTime = 0, endTime = 0;
	
	// Changing the sample resolution changes sample type. byte vs. short.
	private static final int audioEncoding = AudioFormat.ENCODING_PCM_16BIT;

	/**
	 * Handler is passed to pass messages to main screen Recording is done
	 * 8000Hz MONO 16 bit
	 */
	public Recorder(Handler h, JNI j, long voc) {
		super();
		this.setFrequency(8000);
		this.setChannelConfiguration(AudioFormat.CHANNEL_CONFIGURATION_MONO);
		this.handle = h;
		
		mVREngine = j;
		mVocHandle = voc;
		
		Calendar cal = Calendar.getInstance();
		startTime = cal.getTimeInMillis();
		endTime = cal.getTimeInMillis();
	}

	/* Recording THREAD */
	public void run() {
		String strResult;
		
        JNI j = mVREngine;
        short [] pDataBuf;
        pDataBuf = new short[2];
        pDataBuf[0] = 1234;
        pDataBuf[1] = 5678;
        
        j.msrSetVocabularyToDecoder(mVocHandle);
        j.msrStart();
        
		// Wait until we're recording...
		AudioRecord recordInstance = null;
		BufferedOutputStream bufferedStreamInstance = null;
		
		// We're important...
		android.os.Process
				.setThreadPriority(android.os.Process.THREAD_PRIORITY_URGENT_AUDIO);

		// Allocate Recorder and Start Recording...
		int bufferRead = 0;
		int bufferSize = AudioRecord.getMinBufferSize(this.getFrequency(),
			this.getChannelConfiguration(), this.getAudioEncoding());
		// int bufferSize = 8000;

		recordInstance = new AudioRecord(MediaRecorder.AudioSource.MIC, this
				.getFrequency(), this.getChannelConfiguration(), this
				.getAudioEncoding(), bufferSize);

		short[] realBuffer = new short[bufferSize];
		
		recordInstance.startRecording();

		// Re Create file each time to save space.
		if (fileName.exists()) {
			fileName.delete();
		}
		try {
			fileName.createNewFile();
		} catch (IOException e) {
			throw new IllegalStateException("Cannot create file: "
					+ fileName.toString());
		}

		// Open output stream...
		if (this.fileName == null) {
			throw new IllegalStateException("fileName is null");
		}

		try {
			bufferedStreamInstance = new BufferedOutputStream(
					new FileOutputStream(this.fileName));
		} catch (FileNotFoundException e) {
			throw new IllegalStateException("Cannot Open File", e);
		}
		DataOutputStream dataOutputStreamInstance = new DataOutputStream(
				bufferedStreamInstance);
		
		// Continue till STOP button is pressed.
		while (this.isRecording) {
			bufferRead = recordInstance.read(realBuffer, 0, bufferSize);
			
			System.out.println("MSR reads " + bufferRead + " bytes data.");

			if (bufferRead == AudioRecord.ERROR_INVALID_OPERATION) {
				throw new IllegalStateException(
						"read() returned AudioRecord.ERROR_INVALID_OPERATION");
			} else if (bufferRead == AudioRecord.ERROR_BAD_VALUE) {
				throw new IllegalStateException(
						"read() returned AudioRecord.ERROR_BAD_VALUE");
			} else if (bufferRead == AudioRecord.ERROR_INVALID_OPERATION) {
				throw new IllegalStateException(
						"read() returned AudioRecord.ERROR_INVALID_OPERATION");
			}
			try { 
				j.msrSendData(realBuffer, bufferRead);
				
				int idxBuffer;
				for (idxBuffer = 0; idxBuffer < bufferRead; ++idxBuffer) {
					dataOutputStreamInstance.writeShort(realBuffer[idxBuffer]);
				} 
				
				strResult = j.msrRecognize();
				if(strResult.length() > 0)
				{
					if(strResult.equals("STARTPOINT"))
					{
						Calendar cal = Calendar.getInstance();
						startTime = cal.getTimeInMillis();
						endTime = cal.getTimeInMillis();
					}
					else if(strResult.equals("ENDPOINT"))
					{
						Calendar cal = Calendar.getInstance();
						startTime = cal.getTimeInMillis();
					}
					else
					{
						Calendar cal = Calendar.getInstance();  
						endTime = cal.getTimeInMillis();
						
						DecimalFormat df = new DecimalFormat("0000ms");
						
						/*
						Message msg = handle.obtainMessage(MY_MSG,
								"TIME: " + df.format(endTime - startTime) +
								"; RESULT: " + strResult);
								*/
						Message msg = handle.obtainMessage(MY_MSG, strResult);
						handle.sendMessage(msg);
						System.out.println("Get VR results.");
						
						setRecording(false);
					} 
				}
			} catch (IOException e) {
				throw new IllegalStateException(
						"dataOutputStreamInstance.writeShort(curVal)");
			}

		}
		
		j.msrStop();
		
		// STOP BUTTON WAS PRESSED.
		// Close resources...
		recordInstance.stop();
		try {
			bufferedStreamInstance.close();
		} catch (IOException e) {
			throw new IllegalStateException("Cannot close buffered writer.");
		}
		/*
		 * Clean code should be moved to the end of application
		j.msrRemoveVocabularyFromDecoder(hVoc);
        j.msrDestroyVocabulary(hVoc);
        j.msrClose();
        j.msrExit();
        */
		System.out.println("Exit from the recording thread");
	}

	/**
	 * Calculate SPL P = square root ( 2*Z*I ) - > Pressure Z = Acoustic
	 * Impedance = 406.2 for air at 30 degree celsius I = Intensity = 2*Z*pi
	 * square*frequency square*Amplitude square
	 * 
	 * @param bsize
	 *            - the size of FFT required.
	 */
	public void measure(int bsize) {
	}

	/**
	 * Utility Function to round a double value
	 * 
	 * @param d
	 *            - The decimal value
	 * @param decimalPlace
	 *            - how many places required
	 * @return double - the rounded value
	 */
	public double round(double d, int decimalPlace) {
		// see the Javadoc about why we use a String in the constructor
		// http://java.sun.com/j2se/1.5.0/docs/api/java/math/BigDecimal.html#BigDecimal(double)
		BigDecimal bd = new BigDecimal(Double.toString(d));
		bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
		return bd.doubleValue();
	}

	public void setFileName(File fileName) {
		this.fileName = fileName;
	}

	public File getFileName() {
		return fileName;
	}

	/**
	 * @param isRecording
	 *            the isRecording to set
	 */
	public void setRecording(boolean isRecording) {

		this.isRecording = isRecording;

	}

	/**
	 * @return the isRecording
	 */
	public boolean isRecording() {

		return isRecording;

	}

	/**
	 * @param frequency
	 *            the frequency to set
	 */
	public void setFrequency(int frequency) {
		this.frequency = frequency;
	}

	/**
	 * @return the frequency
	 */
	public int getFrequency() {
		return frequency;
	}

	/**
	 * @param channelConfiguration
	 *            the channelConfiguration to set
	 */
	public void setChannelConfiguration(int channelConfiguration) {
		this.channelConfiguration = channelConfiguration;
	}

	/**
	 * @return the channelConfiguration
	 */
	public int getChannelConfiguration() {
		return channelConfiguration;
	}

	/**
	 * @return the audioEncoding
	 */
	public int getAudioEncoding() {
		return audioEncoding;
	}

}
