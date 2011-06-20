package com.robot.demo;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.GestureDetector.OnGestureListener;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.Toast;
import cn.thinkit.libtmsr30.JNI;
import cn.thinkit.libtmsr30.Recorder;

import com.robot.manager.I2C;

public class Main extends Activity {
	
	private static final int MSG_VR_RESULT = 1;
	private static final int MSG_READ_CONFIG_COMPLETE = 2;
	
	private static final int UU_UNCLEAR_SOUND_COUNT = 20;
	private static final String UU_UNCLEAR_SOUND_PATH = "/sdcard/qnqn/demo/unclear/";
	private static final String UU_UNCLEAR_SOUND_TYPE = ".mp3";

	private boolean mDebug;
	private MediaPlayer mMediaPlayer;
	private List<DataInfo> mAppDataInfos;
	private List<String> mAppSpeakData;

	private List<DataInfo> mCommonDataInfos;
	private List<String> mCommonSpeakData;

	private JNI mVREngine = null;
	private long mVocHandle = 0;
	private Recorder mRecorderInstance = null;
	private Thread mRecorderThread = null;
	
	private ImageView mBackground = null;
	private int mBgIndex = 0;
	private int mBgID[] = 
		{R.drawable.main1, R.drawable.main2, R.drawable.main3, R.drawable.main4, R.drawable.main5};
	
	static {
		System.loadLibrary("i2c");
		System.loadLibrary("tmsr30");
	}
	
	private BroadcastReceiver r;

	private Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSG_READ_CONFIG_COMPLETE:
				initEngine();
			break;
			case MSG_VR_RESULT:
				String str = (String) msg.obj;
				Log.i("SPL", "Home receive " + str);
				if (mDebug) {
					Toast.makeText(Main.this,
							"SPL return " + str + "!", Toast.LENGTH_LONG)
							.show();
				}

				if (str.equals("REJECT") == false) {				
					int index;
					for (index = 0; index < mCommonSpeakData.size(); index++) {
						if (str.startsWith(mCommonSpeakData.get(index)) == true) {
							playSound(mCommonDataInfos.get(index).getSound());
							startAction(mCommonDataInfos.get(index).getAction());
							break;
						}
					}
					for (index = 0; index < mAppSpeakData.size(); index++) {
						if (str.startsWith(mAppSpeakData.get(index)) == true) {
							playSound(mAppDataInfos.get(index).getSound());
							startAction(mAppDataInfos.get(index).getAction());
							break;
						}
					}
				} else {
					int id = (new Random()).nextInt(20) + 1;
					playSound("/sdcard/qnqn/demo/unclear/" + id + ".mp3");
				}
				break;
			}
			super.handleMessage(msg);
		}
	};
	
	class TouchListener implements OnTouchListener, OnGestureListener {
		private GestureDetector mGestureDetector = new GestureDetector(this);
    	
    	public boolean onTouch(View v, MotionEvent event) {
    		return mGestureDetector.onTouchEvent(event);
    	}
    	
    	public boolean onDown(MotionEvent e) {
    		return false;
    	}
    	 
    	public void onShowPress(MotionEvent e) {
    	}
    	 
    	public boolean onSingleTapUp(MotionEvent e) {
    		return false;
    	}
    	 
    	public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
    		Log.i("SPL", "onFling");
    		if (e1.getRawX() > e2.getRawX()) {
    			mBgIndex++;
    			if (mBgIndex == mBgID.length) mBgIndex = 0;
    		} else {
    			if (mBgIndex == 0) mBgIndex = mBgID.length;
    			mBgIndex--;
    		}
    		
    		mBackground.setImageResource(mBgID[mBgIndex]);
    		return false;
    	}
    	 
    	public void onLongPress(MotionEvent e) {
    	}
    	 
    	public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
    		return false;
    	}
	};
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON, WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        
        setContentView(R.layout.main);
		IntentFilter filter = new IntentFilter("com.robot.rm.MCU_CMD");
		r = new BroadcastReceiver() {
			public void onReceive(Context context, Intent intent) {
				clean();
			}
		};
		registerReceiver(r, filter);
        
        mBackground = (ImageView) findViewById(R.id.background);
        mBackground.setClickable(true);
        mBackground.setOnTouchListener(new TouchListener());
		
		new Thread() {
        	public void run() {
        		readAppConfig("/sdcard/qnqn/demo/demo.xml");
        		readCommonConfig("/sdcard/qnqn/demo/common.xml");
        		
        		mHandler.sendEmptyMessage(MSG_READ_CONFIG_COMPLETE);
        	}
        }.start();
    }
    
    @Override
    public void onStop() {
    	super.onStop();
    	
		clean();
    	closeEngine();
		if (r != null) {
			unregisterReceiver(r);
		}
    }
    
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	switch (keyCode) {
    	case KeyEvent.KEYCODE_0:
    	case KeyEvent.KEYCODE_VOLUME_DOWN:
    	case KeyEvent.KEYCODE_VOLUME_UP:
			mDebug = true;
    	case KeyEvent.KEYCODE_SOFT_LEFT:
    		startScan();
    		break;
    	case KeyEvent.KEYCODE_SOFT_RIGHT:
    		break;
    	}
    	return super.onKeyDown(keyCode, event);
    }
    
    private void initEngine() {
		mVREngine = new JNI();

		mVREngine.msrSetLogLevel(7);
		int ret = mVREngine.msrInitWithPenalty(147);
		if (ret == 0) {
			
			// mVocHandle = mVREngine.msrCreateVocabulary(100);
			mVocHandle = mVREngine.msrCreateVocabulary(3000); // update follow
																// BeiJing's
																// code
			mVREngine.msrOpen();

			for (String s : mCommonSpeakData) {
				mVREngine.msrAddActiveWord(mVocHandle, s);
			}

			for (String s : mAppSpeakData) {
				mVREngine.msrAddActiveWord(mVocHandle, s);
			}
		} else {
			Toast.makeText(this, "MSR Init Error! Error code is " + ret,
					Toast.LENGTH_SHORT).show();
			finish();

		}
    }
    
    private void closeEngine() {
    	if (mVREngine != null) {
			/*
			mVREngine.msrRemoveVocabularyFromDecoder(mVocHandle);
			mVREngine.msrDestroyVocabulary(mVocHandle);
			mVREngine.msrClose();
			mVREngine.msrExit();
			*/
			int ret = 0;
			ret = mVREngine.msrStop();
			if (ret == 0) {
				if (mVocHandle != 0)
					mVREngine.msrRemoveVocabularyFromDecoder(mVocHandle);

				ret = mVREngine.msrDestroyVocabulary(mVocHandle);
			}
			ret = mVREngine.msrClose();
			ret = mVREngine.msrExit();
		}
    }
    
    private void startScan() {
    	clean();
    	
    	mRecorderInstance = new Recorder(mHandler, mVREngine, mVocHandle);
    	mRecorderInstance.setRecording(true);
    	mRecorderInstance.setFileName(new File("/sdcard/test.raw"));
    	mRecorderThread = new Thread(mRecorderInstance);
    	mRecorderThread.start();
		
		Intent recognizedIntent = new Intent("com.robot.START_RECORDER");
		sendBroadcast(recognizedIntent);
    }
    
    private void playSound(String str) {
    	clean();
    	
		if (((File) new File(str.replace("file://", ""))).exists() == false) {
			Toast.makeText(this, "can't find " + str.replace("file://", ""), Toast.LENGTH_LONG).show();
			return;
		}
		
		mMediaPlayer = MediaPlayer.create(this, Uri.parse(str));
		mMediaPlayer.start();
	}
    
    private void startAction(short code) {
    	if (code == 0) {
    		switch ((new Random()).nextInt(3)) {
    		case 0: code = 0X002D; break;
    		case 1: code = 0X002E; break;
    		case 2: code = 0X002F; break;
    		}
    	}
    	
    	long fd = I2C.open();
		I2C.send(fd, code);
		I2C.close(fd);
    }
    
    private void stopScan() {
    	if (mRecorderInstance != null) {
    		mRecorderInstance.setRecording(false);
    		try {
    			mRecorderThread.join();
			} catch (InterruptedException exp) {
				Log.e("SPL", "service stop_scan InterruptedException");
			}
    	}
    }
    
    private void stopSound() {
    	if (mMediaPlayer != null) {
			mMediaPlayer.release();
			mMediaPlayer = null;
		}
    }
    
    private void clean() {
    	stopScan();
    	stopSound();
    }
    
	private boolean readAppConfig(String filePath) {
		File file = new File(filePath);
		if (file.exists() == false) {
			Log.e("Demo", "can't find " + filePath);
			finish();
			return false;
		}

		DataInfoParser mDataInfoParser = new DataInfoParser(file);
		mAppDataInfos = mDataInfoParser.parse();

		mAppSpeakData = new ArrayList<String>();
		for (DataInfo info : mAppDataInfos) {
			mAppSpeakData.add(info.getString());
		}

		return true;
	}

	private boolean readCommonConfig(String filePath) {
		File file = new File(filePath);
		if (file.exists() == false) {
			Log.e("Demo", "can't find " + filePath);
			finish();
			return false;
		}

		DataInfoParser mDataInfoParser = new DataInfoParser(file);
		mCommonDataInfos = mDataInfoParser.parse();

		mCommonSpeakData = new ArrayList<String>();
		for (DataInfo info : mCommonDataInfos) {
			mCommonSpeakData.add(info.getString());
		}

		return true;
	}
}