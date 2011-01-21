package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class Login extends Activity {
	
	private EditText mName;
	private DatePicker mDate;
	private Button mButton;
	
	private String mNameStr;
	private String mDateStr;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		SharedPreferences sp = getSharedPreferences(Const.PREFS, 0);
		if (sp != null) {
			mNameStr = sp.getString(Const.PREFS_NAME, null);
			mDateStr = sp.getString(Const.PREFS_DATE, null);
		}
		
		mName = (EditText) findViewById(R.id.name);
		mName.setText(mNameStr);
		mName.addTextChangedListener(new TextWatcher() {
			public void afterTextChanged(Editable s){
				mNameStr = s.toString();
				mButton.setEnabled((s.length() > 0) ? true : false);
			}
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
			public void onTextChanged(CharSequence s, int start, int before, int count) {}
		});
		
		mDate = (DatePicker) findViewById(R.id.date);
		
		mButton = (Button) findViewById(R.id.login);
		if (mNameStr == null) {
			mButton.setEnabled(false);
		}
		mButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				SharedPreferences sp = getSharedPreferences(Const.PREFS, 0);
				sp.edit().putString(Const.PREFS_NAME, mNameStr).commit();
				
				finish();
				startActivity(new Intent(Login.this, Evaluation.class));
			}
		});
	}
}
