package com.robot.test.wifi;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.Toast;

public class Main extends TabActivity {

	private static final int test = RadioGroup.NO_ID;

	static {
		System.loadLibrary("WifiTest");
	}

	private class UI {
		private RadioGroup mChannelGroup;
		private RadioGroup mFrequencyGroup;

		private Button mSendBegin;
		private Button mSendStop;
		private Button mReceiveBegin;
		private Button mReceiveStop;
	};

	private UI mB, mG;
	
	private EditText mManualCmd;
	private Button mManualSend;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TabHost tabHost = getTabHost();

		LayoutInflater.from(this).inflate(R.layout.main,
				tabHost.getTabContentView(), true);

		tabHost.addTab(tabHost.newTabSpec("b").setIndicator("802.11b Wireless")
				.setContent(R.id.b));
		tabHost.addTab(tabHost.newTabSpec("g").setIndicator("802.11g Wireless")
				.setContent(R.id.g));
		tabHost.addTab(tabHost.newTabSpec("manual").setIndicator("Manual")
				.setContent(R.id.manual));

		mB = initUI(findViewById(R.id.b));

		mG = initUI(findViewById(R.id.g));
		
		mManualCmd = (EditText) findViewById(R.id.cmd);
		mManualSend = (Button) findViewById(R.id.send);
		mManualSend.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String str = mManualCmd.getEditableText().toString();
				Toast.makeText(Main.this, "send cmmand: labtool " + str, 300).show();
				JNI.sendCmd(str);
			}
		});
	}

	private UI initUI(View rootView) {
		UI ui = new UI();

		ui.mChannelGroup = (RadioGroup) rootView.findViewById(R.id.channel);
		ui.mFrequencyGroup = (RadioGroup) rootView.findViewById(R.id.frequency);

		ui.mSendBegin = (Button) rootView.findViewById(R.id.send_begin);
		ui.mSendStop = (Button) rootView.findViewById(R.id.send_stop);
		ui.mReceiveBegin = (Button) rootView.findViewById(R.id.receive_begin);
		ui.mReceiveStop = (Button) rootView.findViewById(R.id.receive_stop);

		return ui;
	}

	private boolean isRadioGroupValid(RadioGroup channelGroup,
			RadioGroup frequencyGroup) {
		if (channelGroup == null
				|| channelGroup.getCheckedRadioButtonId() == RadioGroup.NO_ID) {
			Toast.makeText(this, "Please select channel", 3000).show();
			return false;
		}

		if (frequencyGroup == null
				|| frequencyGroup.getCheckedRadioButtonId() == RadioGroup.NO_ID) {
			Toast.makeText(this, "Please select frequency", 3000).show();
			return false;
		}

		return true;
	}
}