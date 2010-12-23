package com.robot.common;

import java.io.File;
import java.util.Random;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.widget.Toast;
import cn.thinkit.libtmsr30.JNI;
import cn.thinkit.libtmsr30.Recorder;

public class SPL {
	
	private Context mContext;
	private Handler mHandler;
	private JNI mVREngine;
	private long mVocHandle;
	private Recorder mRecorderInstance;
	private Thread mRecorderThread;
	
	private MediaPlayer mMediaPlayer;
	
	public SPL(Context context, Handler handler) {
		mContext = context;
		mHandler = handler;
		
		initEngine();
	}
	
	public void addIdentifyString(String s) {
		mVREngine.msrAddActiveWord(mVocHandle, s);
	}
	
	public void startScan() {
		clean();
		
    	mRecorderInstance = new Recorder(mHandler, mVREngine, mVocHandle);
    	mRecorderInstance.setRecording(true);
    	mRecorderInstance.setFileName(new File("/sdcard/test.raw"));
    	mRecorderThread = new Thread(mRecorderInstance);
    	mRecorderThread.start();
		
		Intent recognizedIntent = new Intent("com.robot.START_RECORDER");
		mContext.sendBroadcast(recognizedIntent);
    }
	
	public void stopScan() {
    	if (mRecorderInstance != null) {
    		mRecorderInstance.setRecording(false);
    		try {
    			mRecorderThread.join();
			} catch (InterruptedException exp) {
				Log.e("SPL", "service stop_scan InterruptedException");
			}
    	}
    	
    	// TODO need broadcast com.robot.STOP_RECORDER here?
    }
	
	public void playNotIdentifySound() {
		int id = (new Random()).nextInt(20) + 1;
		playSound("/sdcard/qnqn/demo/unclear/" + id + ".mp3");
	}
	
	private void playSound(String str) {    
		clean();
		
		if (((File) new File(str.replace("file://", ""))).exists() == false) {
			Toast.makeText(mContext, "can't find " + str.replace("file://", ""), Toast.LENGTH_LONG).show();
			return;
		}
		
		mMediaPlayer = MediaPlayer.create(mContext, Uri.parse(str));
		mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				stopSound();
			}
		});
		mMediaPlayer.start();
	}
    
    private void stopSound() {
    	if (mMediaPlayer != null) {
			mMediaPlayer.release();
			mMediaPlayer = null;
		}
    }
    
    public void clean() {
    	stopScan();
    	stopSound();
    }
	
	private void initEngine() {
		mVREngine = new JNI();
    	
    	mVREngine.msrInitWithPenalty(0);
		mVREngine.msrSetLogLevel(0);
		mVocHandle = mVREngine.msrCreateVocabulary(4);
		mVREngine.msrOpen();
    }
}
