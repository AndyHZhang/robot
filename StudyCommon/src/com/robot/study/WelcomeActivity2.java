package com.robot.study;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class WelcomeActivity2 extends Activity {
	
	private boolean gotWelcomeImage = false;
	public void setWelcomeImage(int res) {
		setContentView(R.layout.welcome2);

		View main = findViewById(R.id.welcome);
		if (main != null) {
			main.setBackgroundResource(res);
		}

		gotWelcomeImage = true;
	}
	
	public interface OnNextActivityListener {
		void onNextActivity();
	}
	
	public interface OnSettingActivityListener {
		void onSettingActivity();
	}
	
	private OnNextActivityListener mOnNextActivityListener;
	private OnSettingActivityListener mOnSettingActivityListener;
	
	public void setOnNextActivityListener(OnNextActivityListener listener) {
		mOnNextActivityListener = listener;
	}
	
	public void setOnSettingActivityListener(OnSettingActivityListener listener) {
		mOnSettingActivityListener = listener;
	}

	@Override
	protected void onResume() {
		super.onResume();

		if (!gotWelcomeImage) {
			throw new RuntimeException(
					"setWelcomeImage() should be called in onCreate");
		}
		
		findViewById(R.id.btn_next).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (mOnNextActivityListener != null) {
					mOnNextActivityListener.onNextActivity();
				}
			}
		});
		
		findViewById(R.id.btn_settings).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (mOnSettingActivityListener != null) {
					mOnSettingActivityListener.onSettingActivity();
				}
			}
		});
	}

}
