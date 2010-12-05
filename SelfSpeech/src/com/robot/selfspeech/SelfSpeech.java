package com.robot.selfspeech;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

import com.robot.common.SPL;
import com.robot.common.UActionCode;
import com.robot.common.UMessage;
import com.robot.manager.I2C;

public class SelfSpeech extends Activity {

	private static final String TAG = "SelfSpeech";
	private static final int COMMAND_GROUP_INTERVAL = 10 * 1000;
	private static final int COMMAND_INTERVAL = 2 * 1000;

	private enum State {
		IDLE, RUNNING
	};

	static {
		System.loadLibrary("i2c");
		System.loadLibrary("tmsr30");
	}

	private boolean mDebug = false;

	private State mState = State.IDLE;

	private Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case UMessage.SELFSPEECH_EXECUTE_COMMAND_COMPLETE:
				if (mState == State.RUNNING) {
					executeNextCommand();
				}
				break;
			case UMessage.SPL_IDENTIFY_RESULT:
				String str = (String) msg.obj;
				Log.d(TAG, "Got identify result: " + str);
				if (mDebug) {
					Toast.makeText(SelfSpeech.this, "SPL return " + str + "!",
							Toast.LENGTH_LONG).show();
				}

				if (str.equals("REJECT") == false) {
					for (ArrayList<RobotCommand> array : mCommandLists) {
						for (RobotCommand c : array) {
							if (str.startsWith(c.getIdentify())) {
								c.execute();
							}
						}
					}
				} else {
					mSPL.playNotIdentifySound();
				}
				break;
			}
		}
	};
	private ArrayList<ArrayList<RobotCommand>> mCommandLists;
	private ArrayList<RobotCommand> mCommandList;
	private int mActionIndex;

	private MediaPlayer mMediaPlayer;
	private SPL mSPL;

	private void prepareSelfSpeech() {
		if (mState == State.IDLE) {
			mActionIndex = 0;
			mCommandList = mCommandLists.get(new Random().nextInt(mCommandLists
					.size()));
			mHandler.postDelayed(mStart, COMMAND_GROUP_INTERVAL);
		}
	}

	private Runnable mStart = new Runnable() {
		public void run() {
			if (mState == State.IDLE) {
				mState = State.RUNNING;
				executeNextCommand();
			}
		}
	};

	private void executeNextCommand() {
		if (mActionIndex >= mCommandList.size()) {
			mState = State.IDLE;
			prepareSelfSpeech();
		} else {
			mCommandList.get(mActionIndex).execute();
			mActionIndex++;
		}
	}

	private ArrayList<RobotCommand> prepareCommandList1() {
		ArrayList<RobotCommand> commands = new ArrayList<RobotCommand>();

		commands.add(new RobotCommand("小优和大家打个招呼", R.raw.type1_01,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("小优你都会做什么", R.raw.type1_02,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("你没吹牛吧", R.raw.type1_03,
				UActionCode.DANCE_TYPE1, 10 * 1000));
		commands.add(new RobotCommand("小优跳的不错", R.raw.type1_04,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("小优唱首歌", R.raw.type1_05,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("背首唐诗", R.raw.type1_06,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("小优你就会这些啊", R.raw.type1_07,
				UActionCode.DO_NOTHING, 0));

		return commands;
	}

	private ArrayList<RobotCommand> prepareCommandList2() {
		ArrayList<RobotCommand> commands = new ArrayList<RobotCommand>();

		commands.add(new RobotCommand("小优和大家打个招呼", R.raw.type2_01,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("小优跳舞", R.raw.type2_02,
				UActionCode.DANCE_TYPE2, 15*1000));
		commands.add(new RobotCommand("小优转圈", R.raw.type2_03,
				UActionCode.CIRCLE, 15*1000));
		commands.add(new RobotCommand("小优表演个武术", R.raw.type2_04,
				UActionCode.WU_SHU, 15*1000));
		commands.add(new RobotCommand("小优唱首歌", R.raw.type2_05,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("再来一首", R.raw.type2_06,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("小优给大家讲个故事", R.raw.type2_07,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("小优你会英文歌吗", R.raw.type2_08,
				UActionCode.DO_NOTHING, 0));
		commands.add(new RobotCommand("小优说个绕口令", R.raw.type2_09,
				UActionCode.DO_NOTHING, 0));

		return commands;
	}

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mCommandLists = new ArrayList<ArrayList<RobotCommand>>();
		mCommandLists.add(prepareCommandList1());
		mCommandLists.add(prepareCommandList2());

		mSPL = new SPL(this, mHandler);
		for (ArrayList<RobotCommand> array : mCommandLists) {
			for (RobotCommand c : array) {
				mSPL.addIdentifyString(c.getIdentify());
			}
		}

		prepareSelfSpeech();
	}

	@Override
	public boolean onKeyDown(int keyCode, KeyEvent event) {
		switch (keyCode) {
		case KeyEvent.KEYCODE_0:
		case KeyEvent.KEYCODE_VOLUME_UP:
		case KeyEvent.KEYCODE_VOLUME_DOWN:
			mDebug = true;
		case KeyEvent.KEYCODE_SOFT_LEFT:
			if (mState == State.IDLE) {
				mSPL.startScan();
			}
			break;
		case KeyEvent.KEYCODE_SOFT_RIGHT:
			break;
		}
		return super.onKeyDown(keyCode, event);
	}

	@Override
	public void onDestroy() {
		super.onDestroy();

		if (mHandler != null) {
			mHandler.removeCallbacks(mStart);
		}

		if (mMediaPlayer != null) {
			mMediaPlayer.release();
		}

		if (mSPL != null) {
			mSPL.clean();
		}
	}

	private class RobotCommand {

		private String mIdentify;
		private int mMusic;
		private int mActionCode;
		private int mActionDuration;

		public RobotCommand(String identify, int music, int actionCode,
				int actionDuration) {
			mIdentify = identify;
			mMusic = music;
			mActionCode = actionCode;
			mActionDuration = actionDuration;
		}

		public String getIdentify() {
			return mIdentify;
		}

		public void execute() {
			mMediaPlayer = MediaPlayer.create(SelfSpeech.this, mMusic);
			mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {
				public void onCompletion(MediaPlayer mp) {
					if (mActionCode != UActionCode.DO_NOTHING) {
						I2C.sendCommand(mActionCode);
					}

					mHandler.sendEmptyMessageDelayed(
							UMessage.SELFSPEECH_EXECUTE_COMMAND_COMPLETE,
							mActionDuration + COMMAND_INTERVAL);
				}
			});
			mMediaPlayer.start();
		}
	}
}