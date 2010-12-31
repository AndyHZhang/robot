package com.robot.evaluation;

import android.app.TabActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TabHost;
import android.widget.Toast;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class Main extends TabActivity {
	
	private Button mPreBtn;
	private Button mNextBtn;
	private RadioGroup mRadioGroup;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        TabHost tabHost = getTabHost();
        
        LayoutInflater.from(this).inflate(R.layout.tabs1, tabHost.getTabContentView(), true);

        tabHost.addTab(tabHost.newTabSpec("tab1")
        		.setIndicator("大动作", getResources().getDrawable(R.drawable.star_big_on))
                .setContent(R.id.view1));
        tabHost.addTab(tabHost.newTabSpec("tab3")
                .setIndicator("精细动作")
                .setContent(R.id.view2));
        tabHost.addTab(tabHost.newTabSpec("tab3")
                .setIndicator("言语")
                .setContent(R.id.view3));
        tabHost.addTab(tabHost.newTabSpec("tab4")
                .setIndicator("认知")
                .setContent(R.id.view4));
        tabHost.addTab(tabHost.newTabSpec("tab5")
                .setIndicator("行为")
                .setContent(R.id.view5));
        
        mPreBtn = (Button) findViewById(R.id.prev);
        mPreBtn.setEnabled(false);
        mNextBtn = (Button) findViewById(R.id.next);
        mNextBtn.setEnabled(false);
        
        mRadioGroup = (RadioGroup) findViewById(R.id.ability);
        mRadioGroup.setOnCheckedChangeListener(new OnCheckedChangeListener() {
        	public void onCheckedChanged(RadioGroup group, int checkedId) {
        		switch(checkedId) {
        		case R.id.yes:
        			mNextBtn.setEnabled(true);
        			break;
        		case R.id.no:
        			mPreBtn.setEnabled(true);
        			break;
        		}
        	}
        });
	}
}
