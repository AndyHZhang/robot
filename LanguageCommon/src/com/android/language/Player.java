package com.android.language;

import java.util.Random;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.robot.common.UActionCode;
import com.robot.manager.I2C;

public class Player extends Activity {

	private static final int SND_INVALID = 0;
	
	/*
	static {
		System.loadLibrary("i2c");
	}*/

	private static final int[] mRandomSound = { R.raw.random_01,
			R.raw.random_02, R.raw.random_03, R.raw.random_04, R.raw.random_05,
			R.raw.random_06, R.raw.random_07, R.raw.random_08, R.raw.random_09,
			R.raw.random_10, R.raw.random_11, R.raw.random_12, R.raw.random_13,
			R.raw.random_14, R.raw.random_15, R.raw.random_16, R.raw.random_17,
			R.raw.random_18, R.raw.random_19, R.raw.random_20 };
	
	private static final int[] mRandomAction = { UActionCode.LOOK_UP, UActionCode.LOOK_DOWN };

	private static final int[] mTestImage = { R.drawable.img_1gj_c,
			R.drawable.img_1gj_e, R.drawable.img_2mg_c, R.drawable.img_2mg_e,
			R.drawable.img_2mg_pic, R.drawable.img_3rb_c, R.drawable.img_3rb_e,
			R.drawable.img_3rb_pic, R.drawable.img_4yg_c, R.drawable.img_4yg_e,
			R.drawable.img_4yg_pic, R.drawable.img_5fg_c, R.drawable.img_5fg_e,
			R.drawable.img_5fg_pic, R.drawable.img_6ydl_c,
			R.drawable.img_6ydl_e, R.drawable.img_6ydl_pic,
			R.drawable.img_7jnd_c, R.drawable.img_7jnd_e,
			R.drawable.img_7jnd_pic, R.drawable.img_8dg_c,
			R.drawable.img_8dg_e, R.drawable.img_8dg_pic,
			R.drawable.img_9mxg_c, R.drawable.img_9mxg_e,
			R.drawable.img_9mxg_pic, R.drawable.img_10xby_c,
			R.drawable.img_10xby_e, R.drawable.img_10xby_pic,
			R.drawable.img_11adly_c, R.drawable.img_11adly_e,
			R.drawable.img_11adly_pic };

	private static final int[] mTestSound = { R.raw.snd_1gj_c, R.raw.snd_1gj_e,
			R.raw.snd_2mg_c, R.raw.snd_2mg_e, SND_INVALID, R.raw.snd_3rb_c,
			R.raw.snd_3rb_e, SND_INVALID, R.raw.snd_4yg_c, R.raw.snd_4yg_e,
			SND_INVALID, R.raw.snd_5fg_c, R.raw.snd_5fg_e, SND_INVALID,
			R.raw.snd_6ydl_c, R.raw.snd_6ydl_e, SND_INVALID, R.raw.snd_7jnd_c,
			R.raw.snd_7jnd_e, SND_INVALID, R.raw.snd_8dg_c, R.raw.snd_8dg_e,
			SND_INVALID, R.raw.snd_9mxg_c, R.raw.snd_9mxg_e, SND_INVALID,
			R.raw.snd_10xby_c, R.raw.snd_10xby_e, SND_INVALID,
			R.raw.snd_11adly_c, R.raw.snd_11adly_e, SND_INVALID };

	private boolean mDebug;
	private int mIndex;
	private ImageView mContent;
	private MediaPlayer mMediaPlayer;

	private Random mRandom = new Random(System.currentTimeMillis());
	
	Runnable mFinish = new Runnable() {
		public void run() {
			finish();
		}
	};

	Runnable mShowNextImage = new Runnable() {
		public void run() {
			int imageId = mTestImage[mIndex];
			int soundId = mTestSound[mIndex];

			mContent.setImageResource(imageId);
			if (soundId != SND_INVALID) {
				mMediaPlayer.release();
				mMediaPlayer = MediaPlayer.create(Player.this,
						mTestSound[mIndex]);
				mMediaPlayer.start();
			}

			nextSlide(3000);
		}
	};

	Runnable mPlayRandomAction = new Runnable() {
		public void run() {
			int soundId = mRandomSound[mRandom.nextInt(mRandomSound.length)];

			mMediaPlayer.release();
			mMediaPlayer = MediaPlayer.create(Player.this, soundId);
			mMediaPlayer.start();
			mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {
				public void onCompletion(MediaPlayer mp) {
					mp.setOnCompletionListener(null);

					nextSlide(3000);
				}
			});

			int actionId = mRandomAction[mRandom.nextInt(mRandomAction.length)];
			I2C.sendCommand(actionId);
		}
	};

	private boolean mRandomActionPlayed;

	private boolean needPlayRandomAction() {
		boolean needPlay;
		if (mRandomActionPlayed) {
			needPlay = false;
		} else {
			// play random sound & action in 5%
			needPlay = (mDebug || mRandom.nextInt(100) < 5) ? true : false;
		}

		mRandomActionPlayed = needPlay;
		return needPlay;
	}

	Handler mHandler = new Handler();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.player);

		mContent = (ImageView) findViewById(R.id.show_image);

		mMediaPlayer = new MediaPlayer();
	}

	@Override
	public void onResume() {
		super.onResume();

		nextSlide(0);
	}

	@Override
	public void onPause() {
		super.onPause();

		mHandler.removeCallbacks(mFinish);
		mHandler.removeCallbacks(mPlayRandomAction);
		mHandler.removeCallbacks(mShowNextImage);
		mMediaPlayer.release();
	}
	
	private void nextSlide(int interval) {

		if (needPlayRandomAction()) {
			mHandler.postDelayed(mPlayRandomAction, interval);
		} else {
			mIndex++;
			if (mIndex >= mRandomSound.length) {
				mHandler.postDelayed(mFinish, interval);
			} else {
				mHandler.postDelayed(mShowNextImage, interval);
			}
		}
	}
}
