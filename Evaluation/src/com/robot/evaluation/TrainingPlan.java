package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class TrainingPlan extends Activity {
	
	public static final String SCORE_MOTION = "com.robot.evaluation.score.motion"; 
	public static final String SCORE_ART = "com.robot.evaluation.score.art";
	public static final String SCORE_COGNITIVE = "com.robot.evaluation.score.cognitive";
	public static final String SCORE_SPEAK = "com.robot.evaluation.score.speak";
	public static final String SCORE_EQ = "com.robot.evaluation.score.eq";
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.plan);
	}
}
