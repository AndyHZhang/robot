package com.robot.demo3;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import android.app.ListActivity;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.database.Cursor;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View.OnCreateContextMenuListener;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;
import cn.thinkit.libtmsr30.JNI;
import cn.thinkit.libtmsr30.Recorder;

import com.robot.demo3.RecString.Records;



public class Main extends ListActivity {
	private static final int MENU_ADD_RECORD = Menu.FIRST;
	
	private static final int CMENU_DELETE = 0;
	private static final int CMENU_VIEW_DETAILS = 1;
	
	private static final int MSG_VR_RESULT = 1;
	private static final int MSG_READ_CONFIG_COMPLETE = 2;
	
	static {
		System.loadLibrary("i2c");
		System.loadLibrary("tmsr30");
	}
	
	private boolean mDebug;
	
	private BroadcastReceiver r;
	
	private ImageView mImageView;
	
	private ContentResolver mComtentResolver;
	
	private JNI mVREngine;
	private long mVocHandle;
	private MediaPlayer mMediaPlayer;
	private Recorder mRecorderInstance;
	private Thread mRecorderThread;
	
	private List<String> mUserSpeakData = new ArrayList<String>();
	private List<String> mUserImagePicked = new ArrayList<String>();
	private List<String> mUserSoundPicked = new ArrayList<String>();
	
	private Handler mHandler = new Handler() {
		public void handleMessage(Message msg) {
			switch (msg.what) {
			case MSG_READ_CONFIG_COMPLETE:
				initEngine();
			break;
			case MSG_VR_RESULT:
				String str = (String) msg.obj;
				Log.i("SPL", "Home receive " + str);
				if (mDebug) {
					Toast.makeText(Main.this,
							"SPL return " + str + "!", Toast.LENGTH_LONG)
							.show();
				}

				if (str.equals("REJECT") == false) {				
					int index;
					for (index = 0; index < mUserSpeakData.size(); index++) {
						if (str.startsWith(mUserSpeakData.get(index)) == true) {
							playSound(mUserSoundPicked.get(index));
							mImageView.setImageURI(Uri.parse(mUserImagePicked.get(index)));
							break;
						}
					}
				} else {
					int id = (new Random()).nextInt(20) + 1;
					playSound("/sdcard/qnqn/demo/unclear/" + id + ".mp3");
				}
				break;
			}
			super.handleMessage(msg);
		}
	};
    
	private void initEngine() {
		mVREngine = new JNI();

		mVREngine.msrSetLogLevel(7);
		int ret = mVREngine.msrInitWithPenalty(147);
		if (ret == 0) {
			
			// mVocHandle = mVREngine.msrCreateVocabulary(100);
			mVocHandle = mVREngine.msrCreateVocabulary(3000); // update follow
																// BeiJing's
																// code
			mVREngine.msrOpen();

			for (String s : mUserSpeakData) {
				mVREngine.msrAddActiveWord(mVocHandle, s);
			}
		} else {
			Toast.makeText(this, "MSR Init Error! Error code is " + ret,
					Toast.LENGTH_SHORT).show();
			finish();

		}
    }
    
    private void closeEngine() {
    	if (mVREngine != null) {
			/*
			mVREngine.msrRemoveVocabularyFromDecoder(mVocHandle);
			mVREngine.msrDestroyVocabulary(mVocHandle);
			mVREngine.msrClose();
			mVREngine.msrExit();
			*/
			int ret = 0;
			ret = mVREngine.msrStop();
			if (ret == 0) {
				if (mVocHandle != 0)
					mVREngine.msrRemoveVocabularyFromDecoder(mVocHandle);

				ret = mVREngine.msrDestroyVocabulary(mVocHandle);
			}
			ret = mVREngine.msrClose();
			ret = mVREngine.msrExit();
		}
    }
    
    private void startScan() {
    	clean();
    	
    	mRecorderInstance = new Recorder(mHandler, mVREngine, mVocHandle);
    	mRecorderInstance.setRecording(true);
    	mRecorderInstance.setFileName(new File("/sdcard/test.raw"));
    	mRecorderThread = new Thread(mRecorderInstance);
    	mRecorderThread.start();
		
		Intent recognizedIntent = new Intent("com.robot.START_RECORDER");
		sendBroadcast(recognizedIntent);
    }
    
    private void playSound(String str) {
    	clean();
    	
		if (((File) new File(str.replace("file://", ""))).exists() == false) {
			Toast.makeText(this, "can't find " + str.replace("file://", ""), Toast.LENGTH_LONG).show();
			return;
		}
		
		mMediaPlayer = MediaPlayer.create(this, Uri.parse(str));
		mMediaPlayer.setOnCompletionListener(new OnCompletionListener() {
			public void onCompletion(MediaPlayer mp) {
				stopSound();
			}
		});
		mMediaPlayer.start();
	}
    
    private void stopScan() {
    	if (mRecorderInstance != null) {
    		mRecorderInstance.setRecording(false);
    		try {
    			mRecorderThread.join();
			} catch (InterruptedException exp) {
				Log.e("SPL", "service stop_scan InterruptedException");
			}
    	}
    }
    
    private void stopSound() {
    	if (mMediaPlayer != null) {
			mMediaPlayer.release();
			mMediaPlayer = null;
		}
    	
    	mImageView.setImageURI(null);
    }
    
    private void clean() {
    	stopScan();
    	stopSound();
    }
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.main);
		mImageView = (ImageView)findViewById(R.id.background);
		
		mComtentResolver = getContentResolver();

		Cursor mCursor = mComtentResolver.query(Records.CONTENT_URI,
				null, null, null, null);
		startManagingCursor(mCursor);

		ListAdapter adapter = new SimpleCursorAdapter(this,
				android.R.layout.simple_list_item_1, mCursor,
				new String[] { Records.STRING },
				new int[] { android.R.id.text1 });

		setListAdapter(adapter);
		
		/*
		getListView().setOnCreateContextMenuListener(new OnCreateContextMenuListener() {
			public void onCreateContextMenu(ContextMenu menu, View v, ContextMenuInfo menuInfo) {
				menu.add(0, CMENU_DELETE, 0, "Delete");
				menu.add(0, CMENU_VIEW_DETAILS, 0, "View Detail");
			}
		});
		*/
	}
	
	@Override
	public boolean onContextItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case CMENU_DELETE:
			Toast.makeText(this, "No ready", 3000).show();
			return true;
		case CMENU_VIEW_DETAILS:
			Toast.makeText(this, "No ready", 3000).show();
			return true;
		default:
			return super.onContextItemSelected(item);
		}
	}
	
	@Override
	public void onStop() {
		super.onStop();
		
		clean();
		closeEngine();
		
		if (r != null) {
			unregisterReceiver(r);
		}
	}
	
	@Override
	public void onResume() {
		super.onResume();
		
		Cursor mCursor = mComtentResolver.query(Records.CONTENT_URI,
				null, null, null, null);
		if (mCursor != null) {
			if (mCursor.moveToFirst()) {
				mUserSpeakData = new ArrayList<String>();
				mUserImagePicked = new ArrayList<String>();
				mUserSoundPicked = new ArrayList<String>();
				
				int mStringIndex = mCursor.getColumnIndex(Records.STRING);
				int mImageIndex = mCursor.getColumnIndex(Records.IMAGE);
				int mSoundIndex = mCursor.getColumnIndex(Records.SOUND);
				
				while (mCursor.isAfterLast() == false) {
					mUserSpeakData.add(mCursor.getString(mStringIndex));
					mUserImagePicked.add(mCursor.getString(mImageIndex));
					mUserSoundPicked.add(mCursor.getString(mSoundIndex));
					mCursor.moveToNext();
				}
				initEngine();
			}
			mCursor.close();
		}
		
		IntentFilter filter = new IntentFilter("com.robot.rm.MCU_CMD");
		r = new BroadcastReceiver() {
			public void onReceive(Context context, Intent intent) {
				clean();
			}
		};
		registerReceiver(r, filter);
	}
	
	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        int groupId = 0;
        int menuItemOrder = Menu.NONE;
        
        menu.add(groupId, MENU_ADD_RECORD, menuItemOrder, "Add Record");
        
        return true;
	}
	
	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
        case MENU_ADD_RECORD:
            // Launch activity to insert a new item
        	//startActivity(new Intent().setClassName("com.robot.demo3", "com.robot.demo3.NewRecord"));
        	startActivity(new Intent().setClassName("com.robot.demo3", "com.robot.demo3.Setup"));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
	
	@Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
    	switch (keyCode) {
    	case KeyEvent.KEYCODE_0:
    	case KeyEvent.KEYCODE_VOLUME_DOWN:
    	case KeyEvent.KEYCODE_VOLUME_UP:
			mDebug = true;
    	case KeyEvent.KEYCODE_SOFT_LEFT:
    		if (mVREngine != null) {
    			startScan();
    		}
    		break;
    	case KeyEvent.KEYCODE_SOFT_RIGHT:
    		if (mVREngine != null) {
    			//stopScan();
    		}
    		break;
    	}
    	return super.onKeyDown(keyCode, event);
    }
}
