package com.robot.evaluation;

import java.util.Date;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

public class Login extends Activity {
	
	private static final String TAG = Login.class.getSimpleName();
	
	private static final long MONTH_IN_SECOND = 30 * 24 * 60 * 60;
	
	private EditText mName;
	private DatePicker mDate;
	private Button mButton;
	
	private String mNameStr;
	private int mYear;
	private int mMonth;
	private int mDay;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		
		SharedPreferences sp = getSharedPreferences(Const.PREFS, 0);
		if (sp != null) {
			mNameStr = sp.getString(Const.PREFS_NAME, null);
			mYear = sp.getInt(Const.PREFS_YEAR, 0);
			mMonth = sp.getInt(Const.PREFS_MONTH, 0);
			mDay = sp.getInt(Const.PREFS_DAY, 0);
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
		if (mYear != 0) {
			mDate.init(mYear, mMonth, mDay, null);
		}
		
		mButton = (Button) findViewById(R.id.login);
		if (mNameStr == null) {
			//mButton.setEnabled(false);
		}
		mButton.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				SharedPreferences sp = getSharedPreferences(Const.PREFS, 0);
				
				int year = mDate.getYear();
				int month = mDate.getMonth();
				int day = mDate.getDayOfMonth();
				sp.edit()
					.putString(Const.PREFS_NAME, mNameStr)
					.putInt(Const.PREFS_YEAR, year)
					.putInt(Const.PREFS_MONTH, month)
					.putInt(Const.PREFS_DAY, day)
					.commit();
				Log.d(TAG, "year is " + year + ", month is " + month + ", day is " + day);
				
				Date birthday = new Date(year-1900, month, day);
				Log.d(TAG, "birthday is " + birthday.toString());
				Date cur = new Date();
				Date current = new Date(cur.getYear(), cur.getMonth(), cur.getDate());
				Log.d(TAG, "current is " + current.toString());

				long monthAge = (current.getTime() - birthday.getTime()) / 1000 / MONTH_IN_SECOND;
				Log.d(TAG, "month age is " + monthAge);
				
				finish();
				
				Intent i = new Intent(Login.this, Evaluation.class);
				i.putExtra(Const.ACTION_MONTH_AGE, (int)monthAge);
				startActivity(i);
			}
		});
	}
}
