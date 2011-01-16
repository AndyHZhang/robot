package com.robot.study;

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

	MediaPlayer mMediaPlayer = new MediaPlayer();

	Runnable mChangeSlide = new Runnable() {
		public void run() {
			String s = mString[mIndex];
			if (!Const.COURSE_BREAK.equals(s)) {
				if(mText != null) {
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
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			mHandler.removeCallbacks(mChangeSlide);
			mMediaPlayer.release();

			mIndex = -1;
			// mString =

			break;
		}
		return super.onKeyDown(keyCode, event);
	}

	private void nextSlide(int interval) {
		mIndex++;
		if (mIndex == mString.length) {
			finish();
		} else {
			mHandler.postDelayed(mChangeSlide, interval);
		}
	}
}
