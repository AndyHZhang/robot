package com.robot.study;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.TextView;

public abstract class CoursePlayerActivity extends Activity {
	
	private static final String TAG = "CoursePlayer";
	
	private static final int SLIDE_IMMEDIATELY = 0;
	private static final int SLIDE_NORMAL_INTERVAL = 3000;
	
	public abstract int getViewId();
	public abstract int getTextId();
	public abstract int getNextCourseResId();
	public abstract int getSound(String s);
	
	private int mIndex = -1;
	private String[] mString;
	
	private TextView mText;
	
	Handler mHandler = new Handler();
	
	MediaPlayer mMediaPlayer = new MediaPlayer();
	
	Runnable mChangeSlide = new Runnable(){
		public void run() {
			String s = mString[mIndex];
			if (!Const.COURSE_BREAK.equals(s)) {
				mText.setTextSize(200);
				mText.setText(mString[mIndex]);
				
				int sound = getSound(s);
				mMediaPlayer.release();
				if (sound != Const.SOUND_INVALID) {
					mMediaPlayer = MediaPlayer.create(CoursePlayerActivity.this, sound);
					//mMediaPlayer.start();
				}
				
				nextSlide(SLIDE_NORMAL_INTERVAL);
			} else {
				mText.setTextSize(150);
				mText.setText(getNextCourseResId());
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
		mText.setOnTouchListener(new OnTouchListener() {
			public boolean onTouch(View v, MotionEvent event) {
				if (Const.COURSE_BREAK.equals(mString[mIndex])) {
					nextSlide(SLIDE_IMMEDIATELY);
				}
				return false;
			}
		});
		
		nextSlide(SLIDE_IMMEDIATELY);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
		// TODO we need to test whether music can stop when press home key
		mHandler.removeCallbacks(mChangeSlide);
		mMediaPlayer.release();
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
