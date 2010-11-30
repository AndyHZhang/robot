package com.robot.demo3;

import com.robot.demo3.RecString.Records;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Setup extends Activity {

	private final int REQUEST_INSERT_IMAGE = 1;
	private final int REQUEST_RECORD_SOUND = 2;

	private View mLayoutSetup1;
	private View mLayoutSetup2;
	private View mLayoutSetup3;

	private EditText mRecString;
	private TextView mSoundPicked;
	private TextView mImagePicked;

	private Button mSetup1Next;
	private Button mSetup2Next;
	private Button mSetup3Next;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		LayoutInflater inflater = getLayoutInflater();
		mLayoutSetup1 = inflater.inflate(R.layout.setup_1, null);
		mLayoutSetup2 = inflater.inflate(R.layout.setup_2, null);
		mLayoutSetup3 = inflater.inflate(R.layout.setup_3, null);

		setContentView(mLayoutSetup1);

		initSetup1();
		initSetup2();
		initSetup3();
	}

	public void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case REQUEST_INSERT_IMAGE:
			if (resultCode == RESULT_OK) {
				String filePath = getRealPathFromURI(data.getData(),
						MediaStore.Images.Media.DATA);
				mImagePicked.setText(filePath);
				mSetup3Next.setEnabled(true);
			}
			break;
		case REQUEST_RECORD_SOUND:
			if (resultCode == RESULT_OK) {
				String filePath = getRealPathFromURI(data.getData(),
						MediaStore.Audio.Media.DATA);
				mSoundPicked.setText(filePath);
				mSetup2Next.setEnabled(true);
			}
			break;
		default:
			super.onActivityResult(requestCode, resultCode, data);
		}
	}

	private void initSetup1() {

		mRecString = (EditText) findViewById(R.id.rec_string);
		mRecString.addTextChangedListener(new TextWatcher() {
			public void afterTextChanged(Editable s) {
				mSetup1Next.setEnabled((s.length() > 0) ? true : false);
			}

			public void beforeTextChanged(CharSequence s, int start, int count,
					int after) {
			}

			public void onTextChanged(CharSequence s, int start, int before,
					int count) {
			}
		});

		mSetup1Next = (Button) mLayoutSetup1.findViewById(R.id.next);
		mSetup1Next.setEnabled(false);
		mSetup1Next.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setContentView(mLayoutSetup2);
			}
		});
	}

	private void initSetup2() {
		mLayoutSetup2.findViewById(R.id.prev).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						setContentView(mLayoutSetup1);
					}
				});

		mSetup2Next = (Button) mLayoutSetup2.findViewById(R.id.next);
		mSetup2Next.setEnabled(false);
		mSetup2Next.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				setContentView(mLayoutSetup3);
			}
		});

		mLayoutSetup2.findViewById(R.id.pick_sound).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						startActivityForResult(new Intent(
								Intent.ACTION_GET_CONTENT).setType("audio/amr")
								.setPackage("com.android.music"),
								REQUEST_RECORD_SOUND);
					}
				});

		mLayoutSetup2.findViewById(R.id.record_sound).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						startActivityForResult(new Intent(
								Intent.ACTION_GET_CONTENT).setType("audio/amr")
								.setPackage("com.robot.recorder"),
								REQUEST_RECORD_SOUND);
					}
				});

		mSoundPicked = (TextView) mLayoutSetup2.findViewById(R.id.sound);
	}

	private void initSetup3() {
		mLayoutSetup3.findViewById(R.id.prev).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						setContentView(mLayoutSetup2);
					}
				});

		mSetup3Next = (Button) mLayoutSetup3.findViewById(R.id.finish);
		mSetup3Next.setEnabled(false);
		mSetup3Next.setOnClickListener(new OnClickListener() {
			public void onClick(View v) {
				addRecord();
				finish();
			}
		});

		mLayoutSetup3.findViewById(R.id.pick_image).setOnClickListener(
				new OnClickListener() {
					public void onClick(View v) {
						startActivityForResult(Intent.createChooser(new Intent(
								Intent.ACTION_GET_CONTENT).setType("image/*"),
								null), REQUEST_INSERT_IMAGE);
					}
				});
		
		mImagePicked = (TextView) mLayoutSetup3.findViewById(R.id.image);
	}

	private String getRealPathFromURI(Uri contentUri, String type) {
		String[] proj = { type };
		Cursor cursor = managedQuery(contentUri, proj, null, null, null);
		int column_index = cursor.getColumnIndexOrThrow(type);
		cursor.moveToFirst();
		return cursor.getString(column_index);
	}
	
	private void addRecord() {
		ContentValues values = new ContentValues();
		values.put(Records.STRING, mRecString.getText().toString());
		values.put(Records.IMAGE, mImagePicked.getText().toString());
		values.put(Records.SOUND, mSoundPicked.getText().toString());
		getContentResolver().insert(Records.CONTENT_URI, values);
	}
}
