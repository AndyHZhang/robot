package com.android.language;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class DashBoard extends Activity implements OnCheckedChangeListener {
	private CheckBox mLC;
	private CheckBox mLE;
	private CheckBox mLJ;
	private CheckBox mLF;
	private CheckBox mLS;
	private CheckBox mLI;

	private ArrayList<CheckBox> mSelectedLanguage;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);

		mLC = (CheckBox) findViewById(R.id.language_chinese);
		mLE = (CheckBox) findViewById(R.id.language_english);
		mLJ = (CheckBox) findViewById(R.id.language_japanese);
		mLF = (CheckBox) findViewById(R.id.language_french);
		mLS = (CheckBox) findViewById(R.id.language_spanish);
		mLI = (CheckBox) findViewById(R.id.language_italian);

		mLC.setOnCheckedChangeListener(this);
		mLE.setOnCheckedChangeListener(this);
		mLJ.setOnCheckedChangeListener(this);
		mLF.setOnCheckedChangeListener(this);
		mLS.setOnCheckedChangeListener(this);
		mLI.setOnCheckedChangeListener(this);

		mSelectedLanguage = new ArrayList<CheckBox>();
	}

	public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
		if (isChecked) {
			mSelectedLanguage.add((CheckBox) buttonView);
			if (mSelectedLanguage.size() > 2) {
				mSelectedLanguage.get(0).setChecked(false);
			}
		} else {
			mSelectedLanguage.remove(buttonView);
		}
	}
}