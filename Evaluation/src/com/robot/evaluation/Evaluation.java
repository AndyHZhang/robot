package com.robot.evaluation;

import android.app.AlertDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TabHost;
import android.widget.Toast;

public class Evaluation extends TabActivity {
	
	private int mMotionScore = Integer.MIN_VALUE;
	private int mArtScore = Integer.MIN_VALUE;
	private int mCognitiveScore = Integer.MIN_VALUE;
	private int mSpeakScore = Integer.MIN_VALUE;
	private int mEQScore = Integer.MIN_VALUE;
	
	private int mStartMonthAge;
	public static int sCurrentMonthAge;
	
	private MediaPlayer mPlayer;
	
	private static final String TAG = "Evaluation";
	
	private boolean isAllDataReady() {
		return (mMotionScore != Integer.MIN_VALUE &&
				mArtScore != Integer.MIN_VALUE &&
				mCognitiveScore != Integer.MIN_VALUE &&
				mSpeakScore != Integer.MIN_VALUE &&
				mEQScore != Integer.MIN_VALUE)
				? true : false;
	}
	
	private int getInvalidPageIndex() {
		if (mMotionScore == Integer.MIN_VALUE) return 0;
		if (mArtScore == Integer.MIN_VALUE) return 1;
		if (mCognitiveScore == Integer.MIN_VALUE) return 2;
		if (mSpeakScore == Integer.MIN_VALUE) return 3;
		if (mEQScore == Integer.MIN_VALUE) return 4;
		
		return 0;
	}
	
	private BroadcastReceiver mReceiver = new BroadcastReceiver() {
		public void onReceive(Context context, Intent intent) {
			recordScore(intent);
			
			//int currentTab = mTabHost.getCurrentTab();
			//ImageView mImage = (ImageView) mTabHost.getTabWidget().getChildAt(
			//		currentTab).findViewById(R.id.icon);
			//mImage.setImageResource(R.drawable.star_big_on);
			
			if (isAllDataReady()) {
				mPlayer = MediaPlayer.create(Evaluation.this, R.raw.snd_05);
				mPlayer.start();
				
				new AlertDialog.Builder(Evaluation.this)
				.setTitle("已完成评测")
				.setMessage("产生测评报告单？")
				.setPositiveButton("生成",new OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						finish();
						
						//Intent i = new Intent(Evaluation.this, Score.class);
						Intent i = new Intent(Evaluation.this, TableReport.class);
						i.putExtra(Score.SCORE_MOTION, mMotionScore);
						i.putExtra(Score.SCORE_ART, mArtScore);
						i.putExtra(Score.SCORE_COGNITIVE, mCognitiveScore);
						i.putExtra(Score.SCORE_SPEAK, mSpeakScore);
						i.putExtra(Score.SCORE_EQ, mEQScore);
						startActivity(i);
					}
				})
				.setNegativeButton("重新填写", new OnClickListener() {
					public void onClick(DialogInterface dialog, int whichButton) {
						finish();
						
						Intent i = new Intent(Evaluation.this, Evaluation.class);
						startActivity(i);
					}
				}).create().show();
			} else {
				mTabHost.setCurrentTab(getInvalidPageIndex());
			}
		}
	};
	
	private void recordScore(Intent intent) {
		String type = intent.getStringExtra(ActivityCaseBase.CATEGORY_TYPE);
		int score = intent.getIntExtra(ActivityCaseBase.CATEGORY_SCORE, 0);
		int monthAge = intent.getIntExtra(ActivityCaseBase.CATEGORY_MONTH_AGE, 0);
		score = (score > 200) ? 200 : score;
		Log.d(TAG, "Evaluation got score " + score);
		
		if (ActivityCaseMotion.class.getSimpleName().equals(type)) {
			mMotionScore = score;
			RecordData.motionMonthAge = monthAge;
		} else if (ActivityCaseArt.class.getSimpleName().equals(type)) {
			mArtScore = score;
			RecordData.artMonthAge = monthAge;
		} else if (ActivityCaseCognitive.class.getSimpleName().equals(type)) {
			mCognitiveScore = score;
			RecordData.cognitiveMonthAge = monthAge;
		} else if (ActivityCaseSpeak.class.getSimpleName().equals(type)) {
			mSpeakScore = score;
			RecordData.speakMonthAge = monthAge;
		} else if (ActivityCaseEQ.class.getSimpleName().equals(type)) {
			mEQScore = score;
			RecordData.EQMonthAge = monthAge;
		} 
	}
	
	public static int getStartMonthAge(int currentMonthAge) {
		if (currentMonthAge <= 1) {
			return 1;
		}
		
		if (currentMonthAge >= 84) {
			return 81;
		}
		
		if (currentMonthAge <= 12) {
			return currentMonthAge - 1;
		} else {
			return currentMonthAge - 3;
		}
	}
	
	private IntentFilter mFilter = new IntentFilter(ActivityCaseBase.REPORT_SCORE);
	
	private TabHost mTabHost;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		mTabHost = getTabHost();
		
		sCurrentMonthAge = getIntent().getIntExtra(Const.ACTION_MONTH_AGE, 0);
		Toast.makeText(this, "当前月龄为" + Integer.toString(sCurrentMonthAge), 3000).show();
		if (sCurrentMonthAge == 0) sCurrentMonthAge = 1;
		mStartMonthAge = getStartMonthAge(sCurrentMonthAge);

		Intent i = new Intent(this, ActivityCaseMotion.class);
		i.putExtra(ActivityCaseBase.CATEGORY_START_MONTH_AGE, mStartMonthAge);
		View v = LayoutInflater.from(this).inflate(R.layout.tab_indicator_01,
				mTabHost.getTabWidget(), false);
		//TextView t = (TextView) v.findViewById(R.id.title);
		//t.setText("运动智能");
		mTabHost.addTab(mTabHost.newTabSpec("tab1")
        		.setIndicator(v)
                .setContent(i));
		
		i = new Intent(this, ActivityCaseArt.class);
		i.putExtra(ActivityCaseBase.CATEGORY_START_MONTH_AGE, mStartMonthAge);
		v = LayoutInflater.from(this).inflate(R.layout.tab_indicator_02,
				mTabHost.getTabWidget(), false);
		//t = (TextView) v.findViewById(R.id.title);
		//t.setText("艺术智能");
		mTabHost.addTab(mTabHost.newTabSpec("tab2")
                .setIndicator(v)
                .setContent(i));
		
		i = new Intent(this, ActivityCaseCognitive.class);
		i.putExtra(ActivityCaseBase.CATEGORY_START_MONTH_AGE, mStartMonthAge);
		v = LayoutInflater.from(this).inflate(R.layout.tab_indicator_03,
				mTabHost.getTabWidget(), false);
		//t = (TextView) v.findViewById(R.id.title);
		//t.setText("认知智能");
		mTabHost.addTab(mTabHost.newTabSpec("tab3")
                .setIndicator(v)
                .setContent(i));
		
		i = new Intent(this, ActivityCaseSpeak.class);
		i.putExtra(ActivityCaseBase.CATEGORY_START_MONTH_AGE, mStartMonthAge);
		v = LayoutInflater.from(this).inflate(R.layout.tab_indicator_04,
				mTabHost.getTabWidget(), false);
		//t = (TextView) v.findViewById(R.id.title);
		//t.setText("语言智能");
		mTabHost.addTab(mTabHost.newTabSpec("tab4")
                .setIndicator(v)
                .setContent(i));
		
		i = new Intent(this, ActivityCaseEQ.class);
		i.putExtra(ActivityCaseBase.CATEGORY_START_MONTH_AGE, mStartMonthAge);
		v = LayoutInflater.from(this).inflate(R.layout.tab_indicator_05,
				mTabHost.getTabWidget(), false);
		//t = (TextView) v.findViewById(R.id.title);
		//t.setText("情商智能");
		mTabHost.addTab(mTabHost.newTabSpec("tab5")
                .setIndicator(v)
                .setContent(i));        
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		Log.d(TAG, "Evaluation onResume");
		registerReceiver(mReceiver, mFilter);
	}
	
	@Override
	public void onPause() {
		super.onPause();
		
		Log.d(TAG, "Evaluation onPause");
		this.unregisterReceiver(mReceiver);
		
		if (mPlayer != null) {
			mPlayer.stop();
			mPlayer.release();
			mPlayer = null;
		}
	}
}
