package com.robot.evaluation;

import java.util.Random;

import android.content.Context;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Handler;

import com.robot.common.UActionCode;
import com.robot.manager.I2C;

public class RandomAction {
	
	static {
		System.loadLibrary("i2c");
	}
	
	private static final int[] mRandomSound = { R.raw.random_01,
		R.raw.random_02, R.raw.random_03, R.raw.random_04, R.raw.random_05,
		R.raw.random_06, R.raw.random_07, R.raw.random_08, R.raw.random_09,
		R.raw.random_10, R.raw.random_11, R.raw.random_12, R.raw.random_13,
		R.raw.random_14, R.raw.random_15, R.raw.random_16, R.raw.random_17,
		R.raw.random_18, R.raw.random_19, R.raw.random_20 };

	private static final int[] mRandomAction = { UActionCode.LOOK_UP, UActionCode.LOOK_DOWN };
	
	private static MediaPlayer mMediaPlayer;

	private static Random mRandom = new Random(System.currentTimeMillis());
	
	private static final long INTERVAL = 5*60*1000; // 5 min
	
	private static Handler mHandler = new Handler();
	
	private static Context mContext;
	
	private static Runnable mRandonAction = new Runnable() {
		public void run() {
			int soundId = mRandomSound[mRandom.nextInt(mRandomSound.length)];

			if (mMediaPlayer != null)
				mMediaPlayer.release();
			
			if (mContext != null) {
				mMediaPlayer = MediaPlayer.create(mContext, soundId);
				mMediaPlayer.start();
			}

			int actionId = mRandomAction[mRandom.nextInt(mRandomAction.length)];
			I2C.sendCommand(actionId);
			
			mHandler.postDelayed(mRandonAction, INTERVAL);
		}
	};
	
	public static void start(Context context) {
		mHandler.postDelayed(mRandonAction, INTERVAL);
		
		mContext = context;
	}
	
	public static void stop() {
		mHandler.removeCallbacks(mRandonAction);
		mContext = null;
		if (mMediaPlayer != null)
			mMediaPlayer.release();
	}
}
