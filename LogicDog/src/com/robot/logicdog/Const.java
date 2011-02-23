package com.robot.logicdog;


public class Const {
	
	static class ImagePair {
		
		int mSourceResId;
		int mTargetResId;
		int mMixedResId;
		
		public ImagePair(int s, int t, int m) {
			mSourceResId = s;
			mTargetResId = t;
			mMixedResId = m;
		}
	}
	
	static final int[] BACKGROUND = {
		R.drawable.bg01,
		R.drawable.bg02,
	};
	
	static final ImagePair[][] DB = {
		{
			new ImagePair(R.drawable.s01_01, R.drawable.t01_01, R.drawable.m01_01),
			new ImagePair(R.drawable.s01_02, R.drawable.t01_02, R.drawable.m01_02),
			new ImagePair(R.drawable.s01_03, R.drawable.t01_03, R.drawable.m01_03),
			new ImagePair(R.drawable.s01_04, R.drawable.t01_04, R.drawable.m01_04),
			new ImagePair(R.drawable.s01_05, R.drawable.t01_05, R.drawable.m01_05),
			new ImagePair(R.drawable.s01_06, R.drawable.t01_06, R.drawable.m01_06)
		},
		{
			new ImagePair(R.drawable.s02_01, R.drawable.t02_01, R.drawable.m02_01),
			new ImagePair(R.drawable.s02_02, R.drawable.t02_02, R.drawable.m02_02),
			new ImagePair(R.drawable.s02_03, R.drawable.t02_03, R.drawable.m02_03),
			new ImagePair(R.drawable.s02_04, R.drawable.t02_04, R.drawable.m02_04),
			new ImagePair(R.drawable.s02_05, R.drawable.t02_05, R.drawable.m02_05),
			new ImagePair(R.drawable.s02_06, R.drawable.t02_06, R.drawable.m02_06)
		}
	};
}
