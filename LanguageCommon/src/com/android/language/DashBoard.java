package com.android.language;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
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
	
	private CheckBox mText;
	private CheckBox mImage;

	private ArrayList<CheckBox> mSelectedLanguage;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dashboard);
		
		UserChoice.init();

		mLC = (CheckBox) findViewById(R.id.language_chinese);
		mLE = (CheckBox) findViewById(R.id.language_english);
		mLJ = (CheckBox) findViewById(R.id.language_japanese);
		mLF = (CheckBox) findViewById(R.id.language_french);
		mLS = (CheckBox) findViewById(R.id.language_spanish);
		mLI = (CheckBox) findViewById(R.id.language_italian);
		
		mText = (CheckBox) findViewById(R.id.show_text);
		mImage = (CheckBox) findViewById(R.id.show_image);

		mLC.setOnCheckedChangeListener(this);
		mLE.setOnCheckedChangeListener(this);
		mLJ.setOnCheckedChangeListener(this);
		mLF.setOnCheckedChangeListener(this);
		mLS.setOnCheckedChangeListener(this);
		mLI.setOnCheckedChangeListener(this);

		Button btn = (Button) findViewById(R.id.start);
		btn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
				startActivity(new Intent(DashBoard.this, Selector.class));
			}
		});

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
	
	private void recordUserChoice() {
		UserChoice.bChineseSelected = mLC.isChecked();
		UserChoice.bEnglishSelected = mLE.isChecked();
		UserChoice.bJapaneseSelected = mLJ.isChecked();
		UserChoice.bFrenchSelected = mLF.isChecked();
		UserChoice.bSpanishSelected = mLS.isChecked();
		UserChoice.bItalianSelected = mLI.isChecked();
		
		UserChoice.bTextSelected = mText.isChecked();
		UserChoice.bImageSelected = mImage.isChecked();
	}
}