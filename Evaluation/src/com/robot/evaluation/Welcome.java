package com.robot.evaluation;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;

public class Welcome extends Activity {
	
	private MediaPlayer mPlayer;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.welcome);

		mPlayer = MediaPlayer.create(this, R.raw.snd_01);
		mPlayer.start();
		mPlayer.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				mPlayer = null;
				finish();
				startActivity(new Intent(Welcome.this,
						InputEvaulationNumber.class));
			}
		});
	}
	
	@Override
	public void onStop() {
		super.onStop();
		
		if (mPlayer != null) {
			mPlayer.stop();
			mPlayer.release();
			mPlayer = null;
		}
	}
}
