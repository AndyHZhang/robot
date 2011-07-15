package com.robot.sendaction;

import com.robot.manager.I2C;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SendAction extends Activity {
	
	static {
		System.loadLibrary("i2c");
	}

	private EditText mEditor;
	private Button mSendBtn;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		mEditor = (EditText) findViewById(R.id.editor);

		mSendBtn = (Button) findViewById(R.id.send);
		mSendBtn.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				String s = mEditor.getText().toString();
				if (s.length() != 0) {
					int code = Integer.parseInt(s);
					
					I2C.sendCommand(code);

					Toast.makeText(SendAction.this, "Send Action " + code,
							Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(SendAction.this, "Please input action code",
							Toast.LENGTH_SHORT).show();
				}
			}
		});
	}
}