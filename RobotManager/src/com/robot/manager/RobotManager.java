package com.robot.manager;

import java.io.File;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

public class RobotManager extends Service {

	static {
		System.loadLibrary("i2c");
	}

	private final int MSG_SLEEP_TIMEOUT = 1;

	private final int SLEEP_INTERVAL = 5 * 60 * 1000;
	private int mTimerCount = 0;

	private SleepReceiver mSleepReceiver;
	private WakeupReceiver mWakeupReceiver;
	private MediaButtonReceiver mMediaButtonReceiver;

	private boolean mCooling = false;
	private MediaPlayer mPlayer;

	private Timer mTimer = new Timer();

	private Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSG_SLEEP_TIMEOUT:
				mTimerCount++;
				switch (mTimerCount) {
				case 1:
					playMusic(R.raw.sleep_1);
					startAction((short) 0x002D);
					break;
				case 2:
					playMusic(R.raw.sleep_2);
					startAction((short) 0x002E);
					break;
				case 3:
					playMusic(R.raw.sleep_3);
					startAction((short) 0x002F);
					cleanTimer();
					break;
				}
				break;
			}
			super.handleMessage(msg);
		}
	};

	private TimerTask mTask = new TimerTask() {
		public void run() {
			Message msg = new Message();
			msg.what = MSG_SLEEP_TIMEOUT;
			mHandler.sendMessage(msg);
		}
	};

	@Override
	public void onCreate() {
		super.onCreate();

		Log.i("RobotManager", "Service onCreate");
		
		readAppConfig("/sdcard/qnqn/robotmanager/config.xml");

		if (mTimer == null)
			mTimer = new Timer();

		mTimer.schedule(new TimerTask() {
			public void run() {
				startAction(MCU_CMD.POWER_ON);

				mSleepReceiver = new SleepReceiver();
				registerReceiver(mSleepReceiver, new IntentFilter(
						Intent.ACTION_SCREEN_OFF));

				mWakeupReceiver = new WakeupReceiver();
				registerReceiver(mWakeupReceiver, new IntentFilter(
						Intent.ACTION_SCREEN_ON));

				mMediaButtonReceiver = new MediaButtonReceiver();
				registerReceiver(mMediaButtonReceiver, new IntentFilter(
						Intent.ACTION_MEDIA_BUTTON));

				playMusic(R.raw.power_on);
			}
		}, 5000);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		unregisterReceiver(mSleepReceiver);
		unregisterReceiver(mWakeupReceiver);
		unregisterReceiver(mMediaButtonReceiver);

		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
		}
	}

	@Override
	public IBinder onBind(Intent intent) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private List<DataInfo> mAppDataInfos;
	private boolean readAppConfig(String filePath) {
		File file = new File(filePath);
		if (file.exists() == false) {
			Toast.makeText(RobotManager.this, "can't open " + filePath, 5000);
			return false;
		}

		DataInfoParser mDataInfoParser = new DataInfoParser(file);
		mAppDataInfos = mDataInfoParser.parse();

		return true;
	}
	
	private DataInfo findDataInfo(short interrupt) {
		if (mAppDataInfos != null) {
			for (DataInfo info : mAppDataInfos) {
				if (info.getInterrupt() == interrupt) {
					return info;
				}
			}
		}
		
		return null;
	}

	private void playMusic(int id) {

		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
		}

		mPlayer = MediaPlayer.create(this, id);
		mPlayer.start();
	}
	
	private void playMusic(String str) {
		if (mPlayer != null) {
			mPlayer.release();
			mPlayer = null;
		}
    	
		if (((File) new File(str.replace("file://", ""))).exists() == false) {
			Toast.makeText(this, "can't find " + str.replace("file://", ""), Toast.LENGTH_LONG).show();
			return;
		}
		
		mPlayer = MediaPlayer.create(this, Uri.parse(str));
		mPlayer.start();
	}

	private void startAction(short code) {
		long fd = I2C.open();
		I2C.send(fd, code);
		I2C.close(fd);
	}

	private void cleanTimer() {
		if (mTimer != null) {
			mTimer.cancel();
			mTimer = null;
		}
		mTimerCount = 0;
	}

	class SleepReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			Log.i("RobotManager", "Receive Screen Off");
			if (mTimer == null)
				mTimer = new Timer();
			mTimer.schedule(mTask, 0, SLEEP_INTERVAL);
		}
	}

	class WakeupReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			Log.i("RobotManager", "Receive Screen On");
			cleanTimer();
		}
	}

	private boolean isRecordButton(Intent intent) {
		KeyEvent keyEvent = intent.getParcelableExtra(Intent.EXTRA_KEY_EVENT);
		if (keyEvent != null
				&& keyEvent.getKeyCode() == KeyEvent.KEYCODE_SOFT_LEFT) {
			return true;
		}
		return false;
	}

	class MediaButtonReceiver extends BroadcastReceiver {
		@Override
		public void onReceive(Context context, Intent intent) {
			if (isRecordButton(intent) == false && mCooling == false) {
				long fd = I2C.open();
				short readData = I2C.read_interrupt(fd);
				I2C.close(fd);
				
				DataInfo info = findDataInfo(readData);
				if (info != null) {
					String s = info.getSound();
					if (s != null) playMusic(s);
					
					short a = info.getAction();
					if (a != 0) startAction(a);
				}

				/*
				switch (readData) {
				case MCU_CMD.TOUCH_HEAD:
					playMusic(R.raw.touch_head);
					break;
				case MCU_CMD.TOUCH_BELLY:
					//playMusic(R.raw.touch_belly);
					//break;
					return;
				case MCU_CMD.FALL:
					playMusic(R.raw.fall);
					break;
				case MCU_CMD.BAT_LOW:
					playMusic(R.raw.bat_low);
					startAction((short) 0x002D);
					break;
				case MCU_CMD.CHARGING:
					playMusic(R.raw.charging);
					startAction((short) 0x002E);
					break;
				case MCU_CMD.BAT_FULL:
					playMusic(R.raw.bat_full);
					startAction((short) 0x002F);
					break;
				}
				*/
				
				Toast.makeText(RobotManager.this,
						"I2C read_interrupt " + readData, Toast.LENGTH_LONG)
						.show();

				mCooling = true;
				mHandler.postDelayed(new Runnable() {
					public void run() {
						mCooling = false;
					}
				}, 3000);
				
				Intent recognizedIntent = new Intent("com.robot.rm.MCU_CMD");
				sendBroadcast(recognizedIntent);
			}
		}
	}

}
