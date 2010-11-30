package com.robot.demo3;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ContentValues;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.robot.demo3.RecString.Records;

public class NewRecord extends Activity {
	private final int REQUEST_INSERT_IMAGE = 1;
	private final int REQUEST_RECORD_SOUND = 2;

	private TextView mImagePicked;
	private TextView mSoundPicked;
	private EditText mRecString;
	private Button mDone;
	private Button mCancel;
	
	private Cursor mCursor;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.new_layout);
		
		mDone = (Button) findViewById(R.id.done);
		mDone.setEnabled(false);
		mDone.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				ContentValues values = new ContentValues();
				values.put(Records.STRING, mRecString.getText().toString());
				values.put(Records.IMAGE, mImagePicked.getText().toString());
				values.put(Records.SOUND, mSoundPicked.getText().toString());
				getContentResolver().insert(Records.CONTENT_URI, values);
				finish();
			}
		});
		mCancel = (Button) findViewById(R.id.cancel);
		mCancel.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				finish();
			}
		});

		mImagePicked = (TextView) findViewById(R.id.image);
		mImagePicked.setText("/sdcard/qnqn/demo3/default.png");
		mSoundPicked = (TextView) findViewById(R.id.sound);
		mSoundPicked.setText("/sdcard/qnqn/demo3/default.mp3");
		
		mRecString = (EditText) findViewById(R.id.rec_string);
		mRecString.addTextChangedListener(new TextWatcher() {
			public void afterTextChanged(Editable s){
				mDone.setEnabled((s.length() > 0) ? true : false);
			}
			public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
			public void onTextChanged(CharSequence s, int start, int before, int count) {}
		});

		((Button) findViewById(R.id.pick_sound))
				.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
						intent.setType("audio/amr");
						startActivityForResult(intent, REQUEST_RECORD_SOUND);
						/*
						mCursor = NewRecord.this.getContentResolver().query(
								MediaStore.Audio.Media.EXTERNAL_CONTENT_URI,
				                null, null, null, null);
						new AlertDialog.Builder(NewRecord.this)
							.setTitle("Select Image")
							.setCursor(mCursor, new DialogInterface.OnClickListener() {
								public void onClick(DialogInterface dialog, int i) {
									mCursor.moveToPosition(i);
									int index = mCursor.getColumnIndex(MediaStore.Audio.Media.DATA);
									mSoundPicked.setText(mCursor.getString(index));
								}
							}, null)
							.show();
							*/
					}
				});

		((Button) findViewById(R.id.pick_image))
				.setOnClickListener(new OnClickListener() {
					public void onClick(View v) {
						Intent intent = new Intent(Intent.ACTION_GET_CONTENT);
						intent.setType("image/*");
						startActivityForResult(Intent.createChooser(intent,
								null), REQUEST_INSERT_IMAGE);
					}
				});
	}

	@Override
	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case REQUEST_INSERT_IMAGE:
			if (resultCode == RESULT_OK) {
				String filePath = getRealPathFromURI(data.getData(), MediaStore.Images.Media.DATA);
				mImagePicked.setText(filePath);
			}
			break;
		case REQUEST_RECORD_SOUND:
			if (resultCode == RESULT_OK) {
				String filePath = getRealPathFromURI(data.getData(), MediaStore.Audio.Media.DATA);
				mSoundPicked.setText(filePath);
			}
			break;
		default:
			super.onActivityResult(requestCode, resultCode, data);
		}
	}
	
	private String getRealPathFromURI(Uri contentUri, String type) {
		String[] proj = {type};
		Cursor cursor = managedQuery(contentUri, proj, null, null, null);
		int column_index = cursor.getColumnIndexOrThrow(type);
		cursor.moveToFirst();
		return cursor.getString(column_index);
	}
}