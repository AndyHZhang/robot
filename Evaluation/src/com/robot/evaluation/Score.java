package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Score extends Activity {
	
	public static final String SCORE_MOTION = "com.robot.evaluation.score.motion"; 
	public static final String SCORE_ART = "com.robot.evaluation.score.art";
	public static final String SCORE_COGNITIVE = "com.robot.evaluation.score.cognitive";
	public static final String SCORE_SPEAK = "com.robot.evaluation.score.speak";
	public static final String SCORE_EQ = "com.robot.evaluation.score.eq";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.score);
		
		TextView mMotionScore = (TextView) findViewById(R.id.motion);
		TextView mArtScore = (TextView) findViewById(R.id.art);
		TextView mCognitiveScore = (TextView) findViewById(R.id.cognitive);
		TextView mSpeakScore = (TextView) findViewById(R.id.speak);
		TextView mEQScore = (TextView) findViewById(R.id.eq);
		TextView mScore = (TextView) findViewById(R.id.score);
		
		Intent i = getIntent();
		if (i != null) {
			int scroeMotion = i.getIntExtra(SCORE_MOTION, 0);
			mMotionScore.setText("运动智能得分：" + scroeMotion);
			
			int scoreArt = i.getIntExtra(SCORE_ART, 0);
			mArtScore.setText("艺术智能得分：" + scoreArt);
			
			int scoreCognitive = i.getIntExtra(SCORE_COGNITIVE, 0);
			mCognitiveScore.setText("认知智能得分：" + scoreCognitive);
			
			int scoreSpeak = i.getIntExtra(SCORE_SPEAK, 0);
			mSpeakScore.setText("语言智能得分：" + scoreSpeak);
			
			int scoreEQ = i.getIntExtra(SCORE_EQ, 0);
			mEQScore.setText("情商智能得分：" + scoreEQ);
			
			int score = (scroeMotion + scoreArt + scoreCognitive + scoreSpeak + scoreEQ) / 5;
			mScore.setText("发育商得分：" + score);
		}
		
		Button mBtn = (Button) findViewById(R.id.training_plan);
		if (mBtn != null) {
			mBtn.setOnClickListener(new OnClickListener() {
				public void onClick(View v) {
					finish();
					
					Intent i = new Intent(Score.this, TrainingPlan.class);
					startActivity(i);
				}
			});
		}
	}
}
