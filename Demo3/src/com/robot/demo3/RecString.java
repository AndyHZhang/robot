package com.robot.demo3;

import android.net.Uri;
import android.provider.BaseColumns;

public final class RecString {
	public static final String AUTHORITY = "com.robot.provider.RecString";
	
	// This class cannot be instantiated
	private RecString() {}
	
	public static final class Records implements BaseColumns {
		// This class cannot be instantiated
		private Records() {}
		
		public static final Uri CONTENT_URI = Uri.parse("content://" + AUTHORITY + "/records");
		
		public static final String STRING = "string";
		
		public static final String IMAGE = "image";
		
		public static final String SOUND = "sound";
	}
}
