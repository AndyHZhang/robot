package com.robot.study;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;

public abstract class ProgressSelectorActivity extends Activity {

	private static final String TAG = "ProgressSelector";

	private GridView mGrid;

	public abstract String getNextPackageName();

	public abstract String getNextActivityName();

	public abstract int getViewId();

	public abstract int getGridId();

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
