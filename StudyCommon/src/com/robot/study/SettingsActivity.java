package com.robot.study;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;

public class SettingsActivity extends Activity {
	
	private SeekBar mSeekBar;
	
	private boolean gotBackgroundImage = false;
	public void setBackgroundImage(int res) {
		setContentView(R.layout.settings_activity);

		View main = findViewById(R.id.settings);
		if (main != null) {
			main.setBackgroundResource(res);
		}

		gotBackgroundImage = true;
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

		if (!gotBackgroundImage) {
			throw new RuntimeException(
					"setBackgroundImage() should be called in onCreate");
		}
		
		findViewById(R.id.btn_exit).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (mOnNextActivityListener != null) {
					int speed = mSeekBar.getProgress() + 1;

					getSharedPreferences("settings", 0).edit()
							.putInt("speed", speed).commit();
					
					mOnNextActivityListener.onNextActivity();
				}
			}
		});
		
		int speed = getSharedPreferences("settings", 0).getInt("speed", 3);

		mSeekBar = (SeekBar) findViewById(R.id.seek);
		mSeekBar.setProgress(speed);
	}

}
