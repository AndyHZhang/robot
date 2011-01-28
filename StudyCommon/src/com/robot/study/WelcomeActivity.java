package com.robot.study;

import android.app.Activity;
import android.os.Handler;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

public class WelcomeActivity extends Activity {

	// private static final String TAG = "Welcome";

	private static final int LOADING_TIME = 3 * 1000;

	private boolean gotWelcomeImage = false;
	public void setWelcomeImage(int res) {
		setContentView(R.layout.welcome);

		LinearLayout main = (LinearLayout) findViewById(R.id.welcome);
		if (main != null) {
			main.setBackgroundResource(res);
		}

		gotWelcomeImage = true;
	}
	
	public interface OnNextActivityListener {
		void onNextActivity();
	}
	
	private OnNextActivityListener mOnNextActivityListener;
	
	public void setOnNextActivityListener(OnNextActivityListener listener) {
		mOnNextActivityListener = listener;
	}

	Handler mHandler = new Handler();

	Runnable mLoadMainActivity = new Runnable() {
		public void run() {
			if (mOnNextActivityListener != null) {
				mOnNextActivityListener.onNextActivity();
			}
		}
	};

	@Override
	protected void onResume() {
		super.onResume();

		if (!gotWelcomeImage) {
			throw new RuntimeException(
					"setWelcomeImage() should be called in onCreate");
		}

		mHandler.postDelayed(mLoadMainActivity, LOADING_TIME);
	}

	@Override
	protected void onPause() {
		super.onPause();

		mHandler.removeCallbacks(mLoadMainActivity);
	}
}