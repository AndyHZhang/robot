package com.robot.study;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;

import com.robot.common.UActionCode;
import com.robot.manager.I2C;

public abstract class CoursePlayerActivity extends Activity {

	private static final String TAG = "CoursePlayer";

	private static final int SLIDE_IMMEDIATELY = 0;
	
	static {
		System.loadLibrary("i2c");
	}

	private static final int[] mRandomSound = { R.raw.random_01,
			R.raw.random_02, R.raw.random_03, R.raw.random_04, R.raw.random_05,
			R.raw.random_06, R.raw.random_07, R.raw.random_08, R.raw.random_09,
			R.raw.random_10, R.raw.random_11, R.raw.random_12, R.raw.random_13,
			R.raw.random_14, R.raw.random_15, R.raw.random_16, R.raw.random_17,
			R.raw.random_18, R.raw.random_19, R.raw.random_20 };

	private int mSlideSpeed;
	
	private boolean mDebug = false;

	public abstract int getViewId();

	public abstract int getTextId();

	public abstract int getImageId();

	public abstract int getNextCourseResId();

	public abstract int getSound(String s);

	public abstract int getImage(String s);

	private int mIndex = -1;
	private String[] mString;

	private TextView mText;
	private ImageView mImage;

	Handler mHandler = new Handler();

	private Random mRandom = new Random(System.currentTimeMillis());

	MediaPlayer mMediaPlayer = new MediaPlayer();

	Runnable mFinish = new Runnable() {
		public void run() {
			finish();
		}
	};

	Runnable mRandomAction = new Runnable() {
		public void run() {
			int soundId = mRandomSound[mRandom.nextInt(mRandomSound.length)];

			mMediaPlayer.release();
			mMediaPlayer = MediaPlayer.create(CoursePlayerActivity.this,
					soundId);
			mMediaPlayer.start();
			mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {
				public void onCompletion(MediaPlayer mp) {
					mp.setOnCompletionListener(null);

					nextSlide(mSlideSpeed);
				}
			});
			
			I2C.sendCommand(UActionCode.LOOK_UP);
		}
	};

	Runnable mChangeSlide = new Runnable() {
		public void run() {
			String s = mString[mIndex];
			if (!Const.COURSE_BREAK.equals(s)) {
				if (mText != null) {
					mText.setTextSize(200);
					mText.setText(mString[mIndex]);
				}

				if (mImage != null) {
					int image = getImage(s);
					if (image != Const.IMAGE_INVALID) {
						mImage.setImageResource(image);
					}
				}

				int sound = getSound(s);
				mMediaPlayer.release();
				if (sound != Const.SOUND_INVALID) {
					mMediaPlayer = MediaPlayer.create(
							CoursePlayerActivity.this, sound);
					mMediaPlayer.start();
				}

				nextSlide(mSlideSpeed);
			} else {
				if (mText != null) {
					mText.setTextSize(130);
					mText.setText(getNextCourseResId());
				}
			}
		}
	};

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Intent i = getIntent();
		if (i != null) {
			mString = i.getStringArrayExtra("course");
		}

		setContentView(getViewId());

		mText = (TextView) findViewById(getTextId());
		if (mText != null) {
			mText.setOnTouchListener(new OnTouchListener() {
				public boolean onTouch(View v, MotionEvent event) {
					if (Const.COURSE_BREAK.equals(mString[mIndex])) {
						nextSlide(SLIDE_IMMEDIATELY);
					}
					return false;
				}
			});
		}

		mImage = (ImageView) findViewById(getImageId());

		mSlideSpeed = getSharedPreferences("settings", 0).getInt("speed", 3) * 1000;
	}

	@Override
	public void onResume() {
		super.onResume();

		nextSlide(SLIDE_IMMEDIATELY);
	}

	@Override
	public void onPause() {
		super.onPause();

		mHandler.removeCallbacks(mChangeSlide);
		mHandler.removeCallbacks(mRandomAction);
		mHandler.removeCallbacks(mFinish);
		mMediaPlayer.release();
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		// TODO we need to test whether music can stop when press home key

	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_0:
		case KeyEvent.KEYCODE_VOLUME_UP:
			mDebug = true;
			break;
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			mDebug = false;
			break;
		}
		return super.onKeyDown(keyCode, event);
	}

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

	private void nextSlide(int interval) {

		if (needPlayRandomAction()) {
			mHandler.postDelayed(mRandomAction, interval);
		} else {
			mIndex++;
			if (mIndex == mString.length) {
				mHandler.postDelayed(mFinish, interval);
			} else {
				mHandler.postDelayed(mChangeSlide, interval);
			}
		}
	}
}
