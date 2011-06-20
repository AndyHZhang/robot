package com.robot.study;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class WelcomeActivity extends Activity {

	// private static final String TAG = "Welcome";

	private static final int LOADING_TIME = 3 * 1000;
	
	private MediaPlayer mPlayer;

	private boolean gotWelcomeImage = false;
	public void setWelcomeImage(int res) {
		setContentView(R.layout.welcome);

		View main = findViewById(R.id.welcome);
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

	@Override
	protected void onResume() {
		super.onResume();

		if (!gotWelcomeImage) {
			throw new RuntimeException(
					"setWelcomeImage() should be called in onCreate");
		}

		mPlayer = MediaPlayer.create(this, getWelcomeSound());
		//mPlayer.start();
		
		findViewById(R.id.welcome).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (mOnNextActivityListener != null) {
					mOnNextActivityListener.onNextActivity();
				}
			}
		});
	}
	
	protected int getWelcomeSound() {
		return 0;
	}

	@Override
	protected void onPause() {
		super.onPause();
		
		if (mPlayer != null) {
			mPlayer.stop();
			mPlayer.release();
			mPlayer = null;
		}
	}
}