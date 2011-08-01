package com.robot.study.multiplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.SeekBar;

import com.robot.study.R;

public class Settings extends Activity {
	private SeekBar mSeekBar;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.pri_settings);

		findViewById(R.id.pri_setting_back).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						int speed = mSeekBar.getProgress();

						getSharedPreferences("settings", 0).edit()
								.putInt("speed", speed).commit();

						finish();
					}
				});

		int speed = getSharedPreferences("settings", 0).getInt("speed", 3);

		mSeekBar = (SeekBar) findViewById(R.id.seek);
		mSeekBar.setProgress(speed);
	}
}
