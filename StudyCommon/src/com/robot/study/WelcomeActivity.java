package com.robot.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public abstract class WelcomeActivity extends Activity {

	private static final String TAG = "Welcome";

	private static final int LOADING_TIME = 3000;

	public abstract int getViewId();
	public abstract String getNextPackageName();
	public abstract String getNextActivityName();

	Handler mHandler = new Handler();

	Runnable mLoadMainActivity = new Runnable() {
		public void run() {
			Intent i = new Intent();
			i.setClassName(getNextPackageName(), getNextActivityName());
			WelcomeActivity.this.startActivity(i);
			WelcomeActivity.this.finish();
		}
	};

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(getViewId());
		mHandler.postDelayed(mLoadMainActivity, LOADING_TIME);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		mHandler.removeCallbacks(mLoadMainActivity);
	}
}