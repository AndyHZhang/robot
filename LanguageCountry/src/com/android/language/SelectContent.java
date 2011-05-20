package com.android.language;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.Toast;

public class SelectContent extends Activity {
	private CheckBox mSelectText;
	private CheckBox mSelectImage;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.select_content);

		mSelectText = (CheckBox) findViewById(R.id.select_text);
		mSelectImage = (CheckBox) findViewById(R.id.select_image);

		findViewById(R.id.close).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		findViewById(R.id.next).setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				if (recordUserChoice()) {
					finish();
					startActivity(new Intent(SelectContent.this, Selector.class));
				} else {
					Toast.makeText(SelectContent.this, "请至少选择一项", 5000).show();
				}
			}
		});

		mSelectText.setChecked(true);
		mSelectImage.setChecked(true);
	}

	private boolean recordUserChoice() {
		UserChoice.bTextSelected = mSelectText.isChecked();
		UserChoice.bImageSelected = mSelectImage.isChecked();
		
		return UserChoice.bTextSelected | UserChoice.bImageSelected;
	}
}