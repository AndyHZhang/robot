package com.robot.evaluation;

import android.media.MediaPlayer;

import com.robot.evaluation.Const.Cases;

public class ActivityCaseMotion extends ActivityCaseBase {
	
	private MediaPlayer mPlayer;
	
	public void refreshQuestion(int monthAge) {
		
		Cases cases = Const.getCases().get("" + monthAge);;
		
		mTitleContent.setText(cases.mMotionCase.mTitle);
		mMethodContent.setText(cases.mMotionCase.mMethod);
		mStandardContent.setText(cases.mMotionCase.mStandard);
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		mPlayer = MediaPlayer.create(this, R.raw.snd_02);
		mPlayer.start();
	}
	
	@Override
	public void cleanMusic() {
		super.cleanMusic();
		
		if (mPlayer != null) {
			mPlayer.stop();
			mPlayer.release();
			mPlayer = null;
		}
	}
	
	@Override
	public void onPause() {
		super.onPause();
		
		cleanMusic();
	}

}
