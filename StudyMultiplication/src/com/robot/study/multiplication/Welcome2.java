package com.robot.study.multiplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class Welcome2 extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.pri_welcome2);

		findViewById(R.id.pri_btn_settings).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						startActivity(new Intent().setClassName(
								"com.robot.study.multiplication",
								"com.robot.study.multiplication.Settings"));
					}
				});
		findViewById(R.id.pri_btn_next).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						startActivity(new Intent().setClassName(
								"com.robot.study.multiplication",
								"com.robot.study.multiplication.ProgressSelector"));
						finish();
					}
				});
		findViewById(R.id.pri_btn_exit).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						finish();
					}
				});
	}
}
