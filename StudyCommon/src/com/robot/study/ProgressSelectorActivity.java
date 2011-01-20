package com.robot.study;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.AdapterView.OnItemClickListener;

public abstract class ProgressSelectorActivity extends Activity {

	private static final String TAG = "ProgressSelector";

	private static final int MENU_SETTINGS = 1;

	private static final int DIALOG_SETTINGS = 11;

	private GridView mGrid;

	private SeekBar mSeekBar;

	public abstract String getNextPackageName();

	public abstract String getNextActivityName();

	public abstract int getViewId();

	public abstract int getGridId();

	public abstract int getSettingLayoutId();

	public abstract int getSeekBarId();

	public abstract int getCourseIcon(int position);

	public abstract int getGridCellCount();

	public abstract int getGridColumn();

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(getViewId());

		mGrid = (GridView) findViewById(getGridId());
		if (mGrid != null) {
			mGrid.setNumColumns(getGridColumn());
			mGrid.setAdapter(new ProgressAdapter());
			mGrid.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					Intent i = new Intent();
					i.setClassName(getNextPackageName(), getNextActivityName());
					i.putExtra("progress", position);
					ProgressSelectorActivity.this.startActivity(i);
				}
			});
		}
	}

	@Override
	public Dialog onCreateDialog(int id) {
		switch (id) {
		case DIALOG_SETTINGS:
			// Dialog dialog = new AlertDialog(this);
			View view = getLayoutInflater().inflate(getSettingLayoutId(), null);

			int speed = getSharedPreferences("settings", 0).getInt("speed", 5);

			mSeekBar = (SeekBar) view.findViewById(getSeekBarId());
			mSeekBar.setProgress(speed);

			Dialog dialog = new AlertDialog.Builder(this).setTitle("间隔时间调节")
					.setPositiveButton("确认", new OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							// speed should more than 2s
							int speed = mSeekBar.getProgress() + 1;

							getSharedPreferences("settings", 0).edit()
								.putInt("speed", speed)
								.commit();
						}
					}).setNegativeButton("取消", new OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
						}
					}).setView(view).create();

			return dialog;
		}
		return null;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case MENU_SETTINGS:
			showDialog(DIALOG_SETTINGS);
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		menu.add(0, MENU_SETTINGS, 0, "间隔时间调节").setIcon(
				android.R.drawable.ic_menu_preferences);
		return true;
	}

	private class ProgressAdapter extends BaseAdapter {
		public View getView(int position, View convertView, ViewGroup parent) {
			ImageView i;

			if (convertView == null) {
				i = new ImageView(ProgressSelectorActivity.this);
				i.setImageResource(getCourseIcon(position));
			} else {
				i = (ImageView) convertView;
			}

			return i;
		}

		public final int getCount() {
			return getGridCellCount();
		}

		public final Object getItem(int position) {
			return null;
		}

		public final long getItemId(int position) {
			return position;
		}
	}
}
