package com.robot.language.unit02;

import java.util.ArrayList;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Toast;

public class LanguageSelector extends Activity implements
		OnCheckedChangeListener {

	private CheckBox mLC;
	private CheckBox mLE;
	private CheckBox mLJ;
	private CheckBox mLF;
	private CheckBox mLI;
	private CheckBox mLS;

	private CompoundButton mTempCheckBox;

	private ArrayList<CheckBox> mSelectedLanguage;
	
	private ArrayList<Intent> mDisplayActivities;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_language);

		mLC = (CheckBox) findViewById(R.id.language_chinese);
		mLE = (CheckBox) findViewById(R.id.language_english);
		mLJ = (CheckBox) findViewById(R.id.language_japanese);
		mLF = (CheckBox) findViewById(R.id.language_french);
		mLI = (CheckBox) findViewById(R.id.language_italian);
		mLS = (CheckBox) findViewById(R.id.language_spanish);

		mLC.setOnCheckedChangeListener(this);
		mLE.setOnCheckedChangeListener(this);
		mLJ.setOnCheckedChangeListener(this);
		mLF.setOnCheckedChangeListener(this);
		mLI.setOnCheckedChangeListener(this);
		mLS.setOnCheckedChangeListener(this);

		mSelectedLanguage = new ArrayList<CheckBox>();

		findViewById(R.id.prev).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
				startActivity(new Intent(LanguageSelector.this,
						UnitSelector.class));
			}
		});

		findViewById(R.id.close).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		findViewById(R.id.next).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				recordUserChoice();
				
				mDisplayActivities = findTargetActivity();

				startPlayerActivity();
			}
		});

		mLC.setChecked(true);
		mLE.setChecked(true);
	}

	// always keep 2 selected
	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			mSelectedLanguage.add((CheckBox) buttonView);
			if (mSelectedLanguage.size() > 2) {
				mSelectedLanguage.get(0).setChecked(false);
			}
		} else {
			mSelectedLanguage.remove(buttonView);
			if (mSelectedLanguage.size() < 2) {
				mTempCheckBox = buttonView;
				buttonView.post(new Runnable() {
					public void run() {
						mTempCheckBox.setChecked(true);
					}
				});
			}
		}
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == 1) {
			startPlayerActivity();
		}
	}

	private void recordUserChoice() {
		UserChoice.bChineseSelected = mLC.isChecked();
		UserChoice.bEnglishSelected = mLE.isChecked();
		UserChoice.bJapaneseSelected = mLJ.isChecked();
		UserChoice.bFrenchSelected = mLF.isChecked();
		UserChoice.bItalianSelected = mLI.isChecked();
		UserChoice.bSpanishSelected = mLS.isChecked();

		Log.d("Andy", "bJapaneseSelected is " + UserChoice.bJapaneseSelected);
	}

	private void startPlayerActivity() {
		if (mDisplayActivities.size() > 0) {
			Intent i = mDisplayActivities.get(0);
			
			try {
				startActivityForResult(i, 0);
			} catch (ActivityNotFoundException e) {
				Toast.makeText(LanguageSelector.this, e.getMessage(), 5000)
						.show();
			}
			
			mDisplayActivities.remove(0);
		}
	}
	
	private void fillExtra(Intent i) {
		i.putExtra("CN Selected", UserChoice.bChineseSelected);
		i.putExtra("EN Selected", UserChoice.bEnglishSelected);
		i.putExtra("ES Selected", UserChoice.bSpanishSelected);
		i.putExtra("FR Selected", UserChoice.bFrenchSelected);
		i.putExtra("IT Selected", UserChoice.bItalianSelected);
		i.putExtra("JP Selected", UserChoice.bJapaneseSelected);

		i.putExtra("Text Selected", UserChoice.bTextSelected);
		i.putExtra("Image Selected", UserChoice.bImageSelected);
	}

	private ArrayList<Intent> findTargetActivity() {
		mDisplayActivities = new ArrayList<Intent>();
		
		if (UserChoice.bUnit01Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0201",
					"com.robot.language.unit0201.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
			
		}
		if (UserChoice.bUnit02Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0202",
					"com.robot.language.unit0202.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		if (UserChoice.bUnit03Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0203",
					"com.robot.language.unit0203.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		if (UserChoice.bUnit04Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0204",
					"com.robot.language.unit0204.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		if (UserChoice.bUnit05Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0205",
					"com.robot.language.unit0205.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		if (UserChoice.bUnit06Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0206",
					"com.robot.language.unit0206.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		if (UserChoice.bUnit07Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0207",
					"com.robot.language.unit0207.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		if (UserChoice.bUnit08Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0208",
					"com.robot.language.unit0208.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		if (UserChoice.bUnit09Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0209",
					"com.robot.language.unit0209.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		if (UserChoice.bUnit10Selected) {
			Intent i = new Intent();
			i.setClassName("com.robot.language.unit0210",
					"com.robot.language.unit0210.Player");
			fillExtra(i);
			mDisplayActivities.add(i);
		}
		
		return mDisplayActivities;
	}
}
