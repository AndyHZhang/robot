package com.robot.manager;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Main extends Activity {
	
	private final int MSG_CHECK_SERVICE = 1;
	
	private Button mBtn;
	private TextView mStatus;
	private ActivityManager am;
	
	private Timer mTimer = new Timer();
	private Handler	mHandler = new Handler() {
		public void handleMessage(Message msg) {
			switch(msg.what) {
			case MSG_CHECK_SERVICE:
				checkService();
				break;
			}
			super.handleMessage(msg);
		}
	};
	
	private void checkService() {
		boolean foundRmService = false;
		
		List<RunningServiceInfo> serviceInfos = am.getRunningServices(100);
		for (RunningServiceInfo info : serviceInfos) {
			if (info.process.equals("com.robot.manager")) {
				foundRmService = true;
				break;
			}
		}
		
		if (foundRmService) {
			mBtn.setEnabled(false);
			mStatus.setText("Robot Manager Service has been started!");
		} else {
			mBtn.setEnabled(true);
			mStatus.setText("Robot Manager Service has not been started!");
		}
	}
	
	@Override
	public void onCreate(Bundle d) {
		super.onCreate(d);
		setContentView(R.layout.main);
		
		mStatus = (TextView) findViewById(R.id.status);
		
		mBtn = (Button) findViewById(R.id.start);
		mBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				Main.this.startService(new Intent(Main.this, RobotManager.class));
				Toast.makeText(Main.this, "start service after 5s", Toast.LENGTH_SHORT).show();
			}
		});
		
		am = (ActivityManager) getSystemService(ACTIVITY_SERVICE);
		
		mTimer.schedule(new TimerTask() {
			public void run() {
				mHandler.sendEmptyMessage(MSG_CHECK_SERVICE);
			}
		}, 0, 200);
	}
	
	@Override
	public void onDestroy() {
		super.onDestroy();
		
		mTimer.cancel();
	}
}
