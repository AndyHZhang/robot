package com.robot.language.unit02;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

public class UnitSelector extends Activity {

	private CheckBox mUnit01;
	private CheckBox mUnit02;
	private CheckBox mUnit03;
	private CheckBox mUnit04;
	private CheckBox mUnit05;
	private CheckBox mUnit06;
	private CheckBox mUnit07;
	private CheckBox mUnit08;
	private CheckBox mUnit09;
	private CheckBox mUnit10;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_unit);

		UserChoice.init();

		mUnit01 = (CheckBox) findViewById(R.id.unit01);
		mUnit02 = (CheckBox) findViewById(R.id.unit02);
		mUnit03 = (CheckBox) findViewById(R.id.unit03);
		mUnit04 = (CheckBox) findViewById(R.id.unit04);
		mUnit05 = (CheckBox) findViewById(R.id.unit05);
		mUnit06 = (CheckBox) findViewById(R.id.unit06);
		mUnit07 = (CheckBox) findViewById(R.id.unit07);
		mUnit08 = (CheckBox) findViewById(R.id.unit08);
		mUnit09 = (CheckBox) findViewById(R.id.unit09);
		mUnit10 = (CheckBox) findViewById(R.id.unit10);

		findViewById(R.id.prev).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		findViewById(R.id.close).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		findViewById(R.id.next).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				nextStep(true, true);
			}
		});

		findViewById(R.id.play_text).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				nextStep(true, false);
			}
		});

		findViewById(R.id.play_image).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				nextStep(false, true);
			}
		});

		findViewById(R.id.play_text_image).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						nextStep(true, true);
					}
				});
	}

	private void nextStep(boolean playText, boolean playImage) {
		recordUserChoice();
		
		UserChoice.bTextSelected = playText;
		UserChoice.bImageSelected = playImage;

		finish();
		startActivity(new Intent(UnitSelector.this, LanguageSelector.class));
	}

	public void recordUserChoice() {
		UserChoice.bUnit01Selected = mUnit01.isChecked();
		UserChoice.bUnit02Selected = mUnit02.isChecked();
		UserChoice.bUnit03Selected = mUnit03.isChecked();
		UserChoice.bUnit04Selected = mUnit04.isChecked();
		UserChoice.bUnit05Selected = mUnit05.isChecked();
		UserChoice.bUnit06Selected = mUnit06.isChecked();
		UserChoice.bUnit07Selected = mUnit07.isChecked();
		UserChoice.bUnit08Selected = mUnit08.isChecked();
		UserChoice.bUnit09Selected = mUnit09.isChecked();
		UserChoice.bUnit10Selected = mUnit10.isChecked();

		if (!UserChoice.bUnit01Selected && !UserChoice.bUnit02Selected
				&& !UserChoice.bUnit03Selected && !UserChoice.bUnit04Selected
				&& !UserChoice.bUnit05Selected && !UserChoice.bUnit06Selected
				&& !UserChoice.bUnit07Selected && !UserChoice.bUnit08Selected
				&& !UserChoice.bUnit09Selected && !UserChoice.bUnit10Selected) {
			UserChoice.bUnit01Selected = true;
		}
	}
}
