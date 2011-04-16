package com.robot.evaluation;

import com.robot.evaluation.Const.Cases;

public class ActivityCaseArt extends ActivityCaseBase {
	
	public void refreshQuestion(int monthAge) {
		
		Cases cases = Const.getCases().get("" + monthAge);
		
		mTitleContent.setText(cases.mArtCase.mTitle);
		mMethodContent.setText(cases.mArtCase.mMethod);
		mStandardContent.setText(cases.mArtCase.mStandard);
	}

}
