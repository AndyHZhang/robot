package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public abstract class ActivityCaseBase extends Activity {
	
	private static final String TAG = "Evaluation";
	
	public static final String REPORT_SCORE = "com.robot.evaluation.next";
	public static final String CATEGORY_TYPE = "com.robot.evaluation.type";
	public static final String CATEGORY_SCORE = "com.robot.evaluation.score";
	public static final String CATEGORY_MONTH_AGE = "com.robot.evaluation.month.age";
	public static final String CATEGORY_START_MONTH_AGE = "com.robot.evaluation.start";
	
	protected TextView mTitleContent;
	protected TextView mMethodContent;
	protected TextView mStandardContent;
	
	private Button mYesBtn;
	private Button mNoBtn;
	
	private int mMonthAge;
	private int mCurrentMonthAge;
	private int mActualMonthAge;
	
	abstract public void refreshQuestion(int monthAge);
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.show_case);
		
		mTitleContent = (TextView) findViewById(R.id.title_content);
		mMethodContent = (TextView) findViewById(R.id.method_content);
		mStandardContent = (TextView) findViewById(R.id.standard_content);
		
		mYesBtn = (Button) findViewById(R.id.yes_btn);
		mYesBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				mActualMonthAge = mMonthAge;
				cleanMusic();
				nextCase();
			}
		});
		
		mNoBtn = (Button) findViewById(R.id.no_btn);
		mNoBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				cleanMusic();
				nextEvaluation();
			}
		});
		
		mMonthAge = getIntent().getIntExtra(CATEGORY_START_MONTH_AGE, 1);
		mCurrentMonthAge = Evaluation.sCurrentMonthAge;
		refreshQuestion(mMonthAge);
	}
	
	void cleanMusic() {
		
	}
	
	private void nextCase() {
		if (nextMonthAge()) {
			refreshQuestion(mMonthAge);
		} else {
			nextEvaluation();
		}
	}
	
	private void nextEvaluation() {
		int score;
		if (mActualMonthAge == 0) mActualMonthAge = Evaluation.getStartMonthAge(mCurrentMonthAge);
		score = mActualMonthAge * 100 / mCurrentMonthAge;
		Intent i = new Intent(REPORT_SCORE);
		i.putExtra(CATEGORY_TYPE, getClass().getSimpleName());
		i.putExtra(CATEGORY_SCORE, score);
		i.putExtra(CATEGORY_MONTH_AGE, mActualMonthAge);
		sendBroadcast(i);
		
		Log.d(TAG, "month age is " + mCurrentMonthAge + "," +
				" actual is " + mActualMonthAge + ", score is " + score);
	}
	
	private boolean nextMonthAge() {
		if (mMonthAge < 84) {
			mMonthAge += (mMonthAge < 12) ? 1 : 3;
			return true;
		} else {
			return false;
		}
	}
}
