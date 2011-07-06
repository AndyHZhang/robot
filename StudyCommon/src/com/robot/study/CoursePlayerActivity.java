package com.robot.study;

import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class CoursePlayerActivity extends Activity {

	private static final String TAG = "CoursePlayer";

	private static final int SLIDE_IMMEDIATELY = 0;

	private int mSlideSpeed;

	private boolean mDebug = false;

	public abstract int getViewId();

	public abstract int getTextId();

	public abstract int getImageId();

	public abstract int getNextCourseResId();

	public abstract int getSound(String s);

	public abstract int getImage(String s);

	public abstract int getSoundId();

	private int mIndex = -1;
	private String[] mString;

	private TextView mText;
	private ImageView mImage;

	Handler mHandler = new Handler();

	MediaPlayer mMediaPlayer = new MediaPlayer();

	Runnable mFinish = new Runnable() {
		public void run() {
			finish();
		}
	};

	Runnable mChangeSlide = new Runnable() {
		public void run() {
			String s = mString[mIndex];
			if (!Const.COURSE_BREAK.equals(s)) {
				if (mImage != null && mText != null) {
					// for StudyAddition & StudySubtaction
					int image = getImage(s);
					if (image != Const.IMAGE_INVALID) {
						mImage.setImageResource(image);
					}

					mText.setVisibility(View.INVISIBLE);
				} else {
					// for StudyChinese
					mText.setTextSize(200);
					mText.setText(mString[mIndex]);
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
				mMediaPlayer.release();
				mMediaPlayer = MediaPlayer.create(CoursePlayerActivity.this,
						nextCourseSound());
				mMediaPlayer.start();

				if (mImage != null && mText != null) {
					// for StudyAddition & StudySubtaction
					mText.setTextSize(130);
					mText.setText(getNextCourseResId());

					mImage.setImageResource(R.drawable.blank);
					mText.setVisibility(View.VISIBLE);
				} else {
					// for StudyChinese
					mText.setTextSize(130);
					mText.setText(getNextCourseResId());
				}
			}
		}
	};

	private static int NEXT_SND[] = { R.raw.next_1, R.raw.next_2, R.raw.next_3,
			R.raw.next_4, R.raw.next_5, R.raw.next_6, R.raw.next_7 };
	private Random mRandom = new Random(System.currentTimeMillis());

	private int nextCourseSound() {
		return NEXT_SND[mRandom.nextInt(NEXT_SND.length)];
	}

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

		mSlideSpeed = 10000 / getSharedPreferences("settings", 0).getInt(
				"speed", 3);
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

	private void nextSlide(int interval) {
		mIndex++;
		if (mIndex == mString.length) {
			mHandler.postDelayed(mFinish, interval);
		} else {
			mHandler.postDelayed(mChangeSlide, interval);
		}
	}
}
