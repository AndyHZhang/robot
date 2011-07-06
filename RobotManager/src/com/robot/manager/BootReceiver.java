package com.robot.manager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class BootReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		Log.i("RobotManager", "Receive boot complete!");
		context.startService(new Intent(context, RobotManager.class));
	}

}
