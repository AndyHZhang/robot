package com.robot.manager;

import java.util.ArrayList;
import java.util.Random;

public class DataInfo {
	private short mInterrupt;
	private ArrayList<String> mSoundList;
	private short mAction;
	
	public DataInfo(short interrupt, ArrayList<String> soundList, short action) {
		mInterrupt = interrupt;
		mSoundList = soundList;
		mAction = action;
	}
	
	public short getInterrupt() {
		return mInterrupt;
	}
	
	public String getRandomSound(long seed) {
		Random r = new Random(seed);
		return mSoundList.get(r.nextInt(mSoundList.size()));
	}
	
	public short getAction() {
		return mAction;
	}
}
