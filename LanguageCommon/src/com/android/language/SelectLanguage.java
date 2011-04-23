package com.android.language;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;

public class SelectLanguage extends Activity implements OnCheckedChangeListener {
	private CheckBox mLC;
	private CheckBox mLE;
	private CheckBox mLJ;
	private CheckBox mLF;
	private CheckBox mLI;
	private CheckBox mLS;
	private CheckBox mLG;
	private CheckBox mLP;

	private ArrayList<CheckBox> mSelectedLanguage;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_language);
		
		UserChoice.init();

		mLC = (CheckBox) findViewById(R.id.language_chinese);
		mLE = (CheckBox) findViewById(R.id.language_english);
		mLJ = (CheckBox) findViewById(R.id.language_japanese);
		mLF = (CheckBox) findViewById(R.id.language_french);
		mLI = (CheckBox) findViewById(R.id.language_italian);
		mLS = (CheckBox) findViewById(R.id.language_spanish);
		mLG = (CheckBox) findViewById(R.id.language_german);
		mLP = (CheckBox) findViewById(R.id.language_portuguese);

		mLC.setOnCheckedChangeListener(this);
		mLE.setOnCheckedChangeListener(this);
		mLJ.setOnCheckedChangeListener(this);
		mLF.setOnCheckedChangeListener(this);
		mLI.setOnCheckedChangeListener(this);
		mLS.setOnCheckedChangeListener(this);
		mLG.setOnCheckedChangeListener(this);
		mLP.setOnCheckedChangeListener(this);
		
		mSelectedLanguage = new ArrayList<CheckBox>();
		
		findViewById(R.id.close).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});
		
		findViewById(R.id.next).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				recordUserChoice();
				
				finish();
				startActivity(new Intent(SelectLanguage.this, SelectContent.class));
			}
		});
		
		mLC.setChecked(true);
		mLE.setChecked(true);
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
	
	private void recordUserChoice() {
		UserChoice.bChineseSelected = mLC.isChecked();
		UserChoice.bEnglishSelected = mLE.isChecked();
		UserChoice.bJapaneseSelected = mLJ.isChecked();
		UserChoice.bFrenchSelected = mLF.isChecked();
		UserChoice.bItalianSelected = mLI.isChecked();
		UserChoice.bSpanishSelected = mLS.isChecked();
	}
}