package com.android.language;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.ViewSwitcher.ViewFactory;

public class Player extends Activity implements ViewFactory {

	private ImageSwitcher mSwitcher;

	private static final int[] mTestImage = { R.drawable.bg_1, R.drawable.bg_2,
			R.drawable.bg_3, R.drawable.bg_4, R.drawable.bg_5, R.drawable.bg_6 };

	private int mIndex;
	
	Runnable mShowNextImage = new Runnable() {
		public void run() {
			mSwitcher.setImageResource(mTestImage[mIndex]);
			
			mIndex++;
			if (mIndex >= mTestImage.length)
				mIndex = 0;

			mHandler.postDelayed(mShowNextImage, 3000);
		}
	};

	Handler mHandler = new Handler();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.player);

		mSwitcher = (ImageSwitcher) findViewById(R.id.show_image);
		mSwitcher.setFactory(this);
		mSwitcher.setInAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.fade_in));
		mSwitcher.setOutAnimation(AnimationUtils.loadAnimation(this,
				android.R.anim.fade_out));

		mHandler.post(mShowNextImage);
	}

	@Override
	public void onResume() {
		super.onResume();

		mHandler.postDelayed(mShowNextImage, 3000);
	}

	@Override
	public void onStop() {
		super.onStop();

		mHandler.removeCallbacks(mShowNextImage);
	}

	public View makeView() {
		ImageView i = new ImageView(this);
		i.setBackgroundColor(0xFF000000);
		i.setScaleType(ImageView.ScaleType.FIT_CENTER);
		i.setLayoutParams(new ImageSwitcher.LayoutParams(
				LayoutParams.FILL_PARENT, LayoutParams.FILL_PARENT));
		return i;
	}
}
