package com.robot.dance;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

import com.robot.common.UActionCode;
import com.robot.manager.I2C;

public class Dance extends Activity {
	
	private static final String TAG = "Dance";
	private static final int DANCE_INTERVAL = 40*1000;
	
	static {
		System.loadLibrary("i2c");
	}
	
	Handler mHandler = new Handler();
	MediaPlayer mMediaPlayer;
	
	Runnable mSendDanceCommand = new Runnable() {
		public void run() {
			I2C.sendCommand(UActionCode.DANCE_TYPE1);
			Log.d(TAG, "send command " + UActionCode.DANCE_TYPE1 + " to device");
			mHandler.postDelayed(mSendDanceCommand, DANCE_INTERVAL);
		}
	};
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mHandler.post(mSendDanceCommand);
        
        mMediaPlayer = MediaPlayer.create(this, R.raw.dance);
		mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				Log.d(TAG, "music finish, restart now");
				mMediaPlayer.start();
			}
		});
		mMediaPlayer.start();
    }
    
    @Override
    public void onDestroy() {
    	super.onDestroy();
    	
    	if (mMediaPlayer != null) {
    		mMediaPlayer.release();
    	}
    	
    	if (mHandler != null) {
    		mHandler.removeCallbacks(mSendDanceCommand);
    	}
    }
}