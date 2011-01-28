package com.robot.study;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.SeekBar;
import android.widget.AdapterView.OnItemClickListener;

public abstract class ProgressSelectorActivity extends Activity {

	// private static final String TAG = "ProgressSelector";

	private static final int MENU_SETTINGS = 1;

	private static final int DIALOG_SETTINGS = 11;

	private static final int DEFAULT_GRID_COLUMN = 7;

	private GridView mGrid;

	private SeekBar mSeekBar;

	public void setGridColumn(int column) {
		if (mGrid != null) {
			mGrid.setNumColumns(column);
		}
	}
	
	public void setAdapter(BaseAdapter adapter) {		
		setContentView(R.layout.progress_selector);
		
		mGrid = (GridView) findViewById(R.id.grid);
		if (mGrid != null) {
			mGrid.setNumColumns(DEFAULT_GRID_COLUMN);
			mGrid.setAdapter(adapter);
			mGrid.setOnItemClickListener(new OnItemClickListener() {
				public void onItemClick(AdapterView<?> parent, View view,
						int position, long id) {
					if (mOnProgressSelectorListener != null) {
						mOnProgressSelectorListener
								.onProgressSelector(position);
					}
				}
			});
		}
	}

	public interface OnProgressSelectorListener {
		public void onProgressSelector(int position);
	}

	private OnProgressSelectorListener mOnProgressSelectorListener;

	public void setOnProgressSelectorListener(
			OnProgressSelectorListener listener) {
		mOnProgressSelectorListener = listener;
	}

	@Override
	public Dialog onCreateDialog(int id) {
		switch (id) {
		case DIALOG_SETTINGS:
			// Dialog dialog = new AlertDialog(this);
			View view = getLayoutInflater().inflate(R.layout.settings, null);

			int speed = getSharedPreferences("settings", 0).getInt("speed", 5);

			mSeekBar = (SeekBar) view.findViewById(R.id.seek);
			mSeekBar.setProgress(speed);

			Dialog dialog = new AlertDialog.Builder(this).setTitle("间隔时间调节")
					.setPositiveButton("确认", new OnClickListener() {
						public void onClick(DialogInterface dialog, int which) {
							// speed should more than 2s
							int speed = mSeekBar.getProgress() + 1;

							getSharedPreferences("settings", 0).edit().putInt(
									"speed", speed).commit();
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
}
