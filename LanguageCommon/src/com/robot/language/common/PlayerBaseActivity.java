package com.robot.language.common;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

public abstract class PlayerBaseActivity extends Activity {

	public static final int SND_INVALID = 0;
	
	abstract public void createArrayList(ArrayList<Integer> i, ArrayList<Integer> s);

	private static ArrayList<Integer> mImageArray = new ArrayList<Integer>();
	private static ArrayList<Integer> mSoundArray = new ArrayList<Integer>();
	
	public boolean bCNSelected;
	public boolean bENSelected;
	public boolean bESSelected;
	public boolean bFRSelected;
	public boolean bITSelected;
	public boolean bJPSelected;
	
	public boolean bTextSelected;
	public boolean bImageSelected;

	private int mIndex;
	private ImageView mContent;
	private MediaPlayer mMediaPlayer;

	Runnable mFinish = new Runnable() {
		public void run() {
			finish();
		}
	};

	Runnable mShowNextImage = new Runnable() {
		public void run() {
			int imageId = mImageArray.get(mIndex);
			int soundId = mSoundArray.get(mIndex);

			mContent.setImageResource(imageId);
			if (soundId != SND_INVALID) {
				mMediaPlayer.release();
				mMediaPlayer = MediaPlayer.create(PlayerBaseActivity.this,
						soundId);
				mMediaPlayer.start();
			}

			nextSlide(3000);
		}
	};

	Handler mHandler = new Handler();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Intent i = getIntent();
		bCNSelected = i.getBooleanExtra("CN Selected", true);
		bENSelected = i.getBooleanExtra("EN Selected", true);
		bESSelected = i.getBooleanExtra("ES Selected", false);
		bFRSelected = i.getBooleanExtra("FR Selected", false);
		bITSelected = i.getBooleanExtra("IT Selected", false);
		bJPSelected = i.getBooleanExtra("JP Selected", false);
		bTextSelected = i.getBooleanExtra("Text Selected", true);
		bImageSelected = i.getBooleanExtra("Image Selected", true);

		setContentView(R.layout.player);

		mContent = (ImageView) findViewById(R.id.show_image);

		mMediaPlayer = new MediaPlayer();
		
		createArrayList(mImageArray, mSoundArray);
	}

	@Override
	public void onResume() {
		super.onResume();

		nextSlide(0);
	}

	@Override
	public void onPause() {
		super.onPause();

		mHandler.removeCallbacks(mFinish);
		mHandler.removeCallbacks(mShowNextImage);
		mMediaPlayer.release();
	}

	private void nextSlide(int interval) {
		mIndex++;
		if (mIndex >= mImageArray.size()) {
			mHandler.postDelayed(mFinish, interval);
		} else {
			mHandler.postDelayed(mShowNextImage, interval);
		}
	}
}
