package com.robot.study.addition;

import java.util.ArrayList;
import java.util.HashMap;

import com.robot.study.Const;
import com.robot.study.Course;
import com.robot.study.Progress;

public class Config {
	
	public final static int WELCOME_LAYOUT_ID = R.layout.welcome;
	public final static int SETTINGS_LAYOUT_ID = R.layout.settings;
	public final static int PROGRESS_SELECTOR_LAYOUT_ID = R.layout.progress_selector;
	public final static int COURSE_SELECTOR_LAYOUT_ID = R.layout.course_selector;
	public final static int COURSE_PLAYER_LAYOUT_ID = R.layout.courses;
	public final static int GRID_WIDGET_ID = R.id.grid;
	public final static int SEEKBAR_WIDGET_ID = R.id.seek;
	public final static int GALLERY_WIDGET_ID = R.id.gallery;
	public final static int IMAGE_WIDGET_ID = R.id.image;
	public final static int STRING_NEXT_COURSE = R.string.next_course;
	public final static int PROGRESS_COLUMN = 7;
	public final static int COURSE_COLUMN = 3;
	
	public final static String PACKAGE_NAME = "com.robot.study.addition";
	public final static String PROGRESS_SELECTOR_ACTIVITY_NAME = PACKAGE_NAME + ".ProgressSelector";
	public final static String COURSE_SELECTOR_ACTIVITY_NAME = PACKAGE_NAME + ".CourseSelector";
	public final static String COURSE_PLAYER_ACTIVITY_NAME = PACKAGE_NAME + ".CoursePlayer";
	
	private static ArrayList<Progress> mProgresses;
	public static ArrayList<Progress> getProgress() {
		if (mProgresses == null) {
			mProgresses = new ArrayList<Progress>();
			
			Course c1_1 = new Course(R.drawable.course01, Config.CourseData1_1);
			Course c1_2 = new Course(R.drawable.course02, Config.CourseData1_2);
			Course c1_3 = new Course(R.drawable.course03, Config.CourseData1_3);
			Course c2_1 = new Course(R.drawable.course01, Config.CourseData2_1);
			Course c2_2 = new Course(R.drawable.course02, Config.CourseData2_2);
			Course c2_3 = new Course(R.drawable.course03, Config.CourseData2_3);
			Course c3_1 = new Course(R.drawable.course01, Config.CourseData3_1);
			Course c3_2 = new Course(R.drawable.course02, Config.CourseData3_2);
			Course c3_3 = new Course(R.drawable.course03, Config.CourseData3_3);
			Course c4_1 = new Course(R.drawable.course01, Config.CourseData4_1);
			Course c4_2 = new Course(R.drawable.course02, Config.CourseData4_2);
			Course c4_3 = new Course(R.drawable.course03, Config.CourseData4_3);
			Course c5_1 = new Course(R.drawable.course01, Config.CourseData5_1);
			Course c5_2 = new Course(R.drawable.course02, Config.CourseData5_2);
			Course c5_3 = new Course(R.drawable.course03, Config.CourseData5_3);
			Course c6_1 = new Course(R.drawable.course01, Config.CourseData6_1);
			Course c6_2 = new Course(R.drawable.course02, Config.CourseData6_2);
			Course c6_3 = new Course(R.drawable.course03, Config.CourseData6_3);
			Course c7_1 = new Course(R.drawable.course01, Config.CourseData7_1);
			Course c7_2 = new Course(R.drawable.course02, Config.CourseData7_2);
			Course c7_3 = new Course(R.drawable.course03, Config.CourseData7_3);
			Course c8_1 = new Course(R.drawable.course01, Config.CourseData8_1);
			Course c8_2 = new Course(R.drawable.course02, Config.CourseData8_2);
			Course c8_3 = new Course(R.drawable.course03, Config.CourseData8_3);
			Course c9_1 = new Course(R.drawable.course01, Config.CourseData9_1);
			Course c9_2 = new Course(R.drawable.course02, Config.CourseData9_2);
			Course c9_3 = new Course(R.drawable.course03, Config.CourseData9_3);
			Course c10_1 = new Course(R.drawable.course01, Config.CourseData10_1);
			Course c10_2 = new Course(R.drawable.course02, Config.CourseData10_2);
			Course c10_3 = new Course(R.drawable.course03, Config.CourseData10_3);
			Course c11_1 = new Course(R.drawable.course01, Config.CourseData11_1);
			Course c11_2 = new Course(R.drawable.course02, Config.CourseData11_2);
			Course c11_3 = new Course(R.drawable.course03, Config.CourseData11_3);
			Course c12_1 = new Course(R.drawable.course01, Config.CourseData12_1);
			Course c12_2 = new Course(R.drawable.course02, Config.CourseData12_2);
			Course c12_3 = new Course(R.drawable.course03, Config.CourseData12_3);
			Course c13_1 = new Course(R.drawable.course01, Config.CourseData13_1);
			Course c13_2 = new Course(R.drawable.course02, Config.CourseData13_2);
			Course c13_3 = new Course(R.drawable.course03, Config.CourseData13_3);
			Course c14_1 = new Course(R.drawable.course01, Config.CourseData14_1);
			Course c14_2 = new Course(R.drawable.course02, Config.CourseData14_2);
			Course c14_3 = new Course(R.drawable.course03, Config.CourseData14_3);
			
			mProgresses.add(new Progress(R.drawable.day01).addCourse(c1_1).addCourse(c1_2).addCourse(c1_3));
			mProgresses.add(new Progress(R.drawable.day02).addCourse(c2_1).addCourse(c2_2).addCourse(c2_3));
			mProgresses.add(new Progress(R.drawable.day03).addCourse(c3_1).addCourse(c3_2).addCourse(c3_3));
			mProgresses.add(new Progress(R.drawable.day04).addCourse(c4_1).addCourse(c4_2).addCourse(c4_3));
			mProgresses.add(new Progress(R.drawable.day05).addCourse(c5_1).addCourse(c5_2).addCourse(c5_3));
			mProgresses.add(new Progress(R.drawable.day06).addCourse(c6_1).addCourse(c6_2).addCourse(c6_3));
			mProgresses.add(new Progress(R.drawable.day07).addCourse(c7_1).addCourse(c7_2).addCourse(c7_3));
			mProgresses.add(new Progress(R.drawable.day08).addCourse(c8_1).addCourse(c8_2).addCourse(c8_3));
			mProgresses.add(new Progress(R.drawable.day09).addCourse(c9_1).addCourse(c9_2).addCourse(c9_3));
			mProgresses.add(new Progress(R.drawable.day10).addCourse(c10_1).addCourse(c10_2).addCourse(c10_3));
			mProgresses.add(new Progress(R.drawable.day11).addCourse(c11_1).addCourse(c11_2).addCourse(c11_3));
			mProgresses.add(new Progress(R.drawable.day12).addCourse(c12_1).addCourse(c12_2).addCourse(c12_3));
			mProgresses.add(new Progress(R.drawable.day13).addCourse(c13_1).addCourse(c13_2).addCourse(c13_3));
			mProgresses.add(new Progress(R.drawable.day14).addCourse(c14_1).addCourse(c14_2).addCourse(c14_3));
		}
		
		return mProgresses;
	}
	
	public final static String[] CourseData1_1 = { 
		"1","+","1","=","2", "1","+","2","=","3", "1","+","3","=","4"
	};
	public final static String[] CourseData1_2 = {
		"1","+","4","=","5", "1","+","5","=","6", "1","+","6","=","7"
	};
	public final static String[] CourseData1_3 = {
		"1","+","7","=","8", "1","+","8","=","9", "1","+","9","=","10",
	};
	
	public final static String[] CourseData2_1 = { 
		"2","+","2","=","4", "2","+","3","=","5", "2","+","4","=","6"
	};
	public final static String[] CourseData2_2 = { 
		"2","+","5","=","7", "2","+","6","=","8", "2","+","7","=","9"
	};
	public final static String[] CourseData2_3 = { 
		"2","+","8","=","10", "3","+","3","=","6", "3","+","4","=","7",
	};
	
	public final static String[] CourseData3_1 = { 
		"3","+","5","=","8", "3","+","6","=","9", "3","+","7","=","10"
	};
	public final static String[] CourseData3_2 = { 
		"4","+","4","=","8", "4","+","5","=","9", "4","+","6","=","10"
	};
	public final static String[] CourseData3_3 = { 
		"5","+","5","=","10", "10","+","10","=","20", "2","+","18","=","20",
	};
	
	public final static String[] CourseData4_1 = { 
		"1","+","10","=","11", "2","+","9","=","11", "3","+","8","=","11"
	};
	public final static String[] CourseData4_2 = { 
		"4","+","7","=","11", "5","+","6","=","11", "6","+","6","=","12"
	};
	public final static String[] CourseData4_3 = { 
		"5","+","7","=","12", "4","+","8","=","12", "3","+","9","=","12",
	};
	
	public final static String[] CourseData5_1 = { 
		"2","+","10","=","12", "1","+","11","=","12", "6","+","7","=","13"
	};
	public final static String[] CourseData5_2 = { 
		"5","+","8","=","13", "4","+","9","=","13", "3","+","10","=","13"
	};
	public final static String[] CourseData5_3 = { 
		"2","+","11","=","13", "1","+","12","=","13", "7","+","7","=","14",
	};
	
	public final static String[] CourseData6_1 = { 
		"6","+","8","=","14", "5","+","9","=","14", "4","+","10","=","14"
	};
	public final static String[] CourseData6_2 = { 
		"3","+","11","=","14", "2","+","12","=","14", "1","+","13","=","14"
	};
	public final static String[] CourseData6_3 = { 
		"7","+","8","=","15", "6","+","9","=","15", "5","+","10","=","15",
	};
	
	public final static String[] CourseData7_1 = { 
		"4","+","11","=","15", "3","+","12","=","15", "2","+","11","=","15"
	};
	public final static String[] CourseData7_2 = { 
		"1","+","14","=","15", "8","+","8","=","16", "7","+","9","=","16"
	};
	public final static String[] CourseData7_3 = { 
		"6","+","10","=","16", "5","+","11","=","16", "4","+","12","=","16",
	};
	
	public final static String[] CourseData8_1 = { 
		"3","+","13","=","16", "2","+","14","=","16", "1","+","15","=","16"
	};
	public final static String[] CourseData8_2 = { 
		"8","+","9","=","17", "7","+","10","=","17", "6","+","11","=","17"
	};
	public final static String[] CourseData8_3 = { 
		"5","+","12","=","17", "4","+","13","=","17", "3","+","14","=","17",
	};
	
	public final static String[] CourseData9_1 = { 
		"2","+","15","=","17", "1","+","16","=","17", "9","+","9","=","18"
	};
	public final static String[] CourseData9_2 = {
		"8","+","10","=","18", "7","+","11","=","18", "6","+","12","=","18"
	};
	public final static String[] CourseData9_3 = {
		"5","+","13","=","18", "4","+","14","=","18", "3","+","15","=","18",
	};
	
	public final static String[] CourseData10_1 = { 
		"2","+","16","=","18", "1","+","17","=","18", "9","+","10","=","19"
	};
	public final static String[] CourseData10_2 = { 
		"8","+","11","=","19", "7","+","12","=","19", "6","+","13","=","19"
	};
	public final static String[] CourseData10_3 = { 
		"5","+","14","=","19", "4","+","15","=","19", "3","+","16","=","19",
	};
	
	public final static String[] CourseData11_1 = { 
		"2","+","17","=","19", "1","+","18","=","19", "9","+","11","=","20"
	};
	public final static String[] CourseData11_2 = { 
		"8","+","12","=","20", "7","+","13","=","20", "6","+","14","=","20"
	};
	public final static String[] CourseData11_3 = { 
		"5","+","15","=","20", "4","+","16","=","20", "3","+","17","=","20",
	};
	
	public final static String[] CourseData12_1 = { 
		"1","+","19","=","20", "10","+","11","=","21", "9","+","12","=","21"
	};
	public final static String[] CourseData12_2 = { 
		"8","+","13","=","21", "7","+","14","=","21", "6","+","15","=","21"
	};
	public final static String[] CourseData12_3 = { 
		"5","+","16","=","21", "4","+","17","=","21", "3","+","18","=","21",
	};
	public final static String[] CourseData13_1 = { 
		"2","+","19","=","21", "1","+","20","=","21", "11","+","11","=","22"
	};
	public final static String[] CourseData13_2 = { 
		"10","+","12","=","22", "9","+","13","=","22", "8","+","14","=","22"
	};
	public final static String[] CourseData13_3 = { 
		"7","+","15","=","22", "6","+","15","=","22", "5","+","17","=","22",
	};
	
	public final static String[] CourseData14_1 = { 
		"4","+","18","=","22", "3","+","19","=","22", "2","+","20","=","22"
	};
	public final static String[] CourseData14_2 = { 
		"1","+","21","=","22", "11","+","12","=","23", "10","+","13","=","23"
	};
	public final static String[] CourseData14_3 = { 
		"9","+","14","=","23", "8","+","15","=","23", "7","+","16","=","23",
	};
	
	public static final HashMap<String, Integer> mSoundMap = new HashMap<String, Integer>() {
		{
		put("1", R.raw.sound001);
		put("2", R.raw.sound002);
		put("3", R.raw.sound003);
		put("4", R.raw.sound004);
		put("5", R.raw.sound005);
		put("6", R.raw.sound006);
		put("7", R.raw.sound007);
		put("8", R.raw.sound008);
		put("9", R.raw.sound009);
		put("10", R.raw.sound010);
		put("11", R.raw.sound011);
		put("12", R.raw.sound012);
		put("13", R.raw.sound013);
		put("14", R.raw.sound014);
		put("15", R.raw.sound015);
		put("16", R.raw.sound016);
		put("17", R.raw.sound017);
		put("18", R.raw.sound018);
		put("19", R.raw.sound019);
		put("20", R.raw.sound020);
		put("21", R.raw.sound021);
		put("22", R.raw.sound022);
		put("23", R.raw.sound023);
		
		put("+", R.raw.plus);
		put("=", R.raw.equal);
		}
	};
	
	public static final HashMap<String, Integer> mImageMap = new HashMap<String, Integer>() {
		{
		put("1", R.drawable.red01);
		put("2", R.drawable.red02);
		put("3", R.drawable.red03);
		put("4", R.drawable.red04);
		put("5", R.drawable.red05);
		put("6", R.drawable.red06);
		put("7", R.drawable.red07);
		put("8", R.drawable.red08);
		put("9", R.drawable.red09);
		put("10", R.drawable.red10);
		put("11", R.drawable.red11);
		put("12", R.drawable.red12);
		put("13", R.drawable.red13);
		put("14", R.drawable.red14);
		put("15", R.drawable.red15);
		put("16", R.drawable.red16);
		put("17", R.drawable.red17);
		put("18", R.drawable.red18);
		put("19", R.drawable.red19);
		put("20", R.drawable.red20);
		put("21", R.drawable.red21);
		put("22", R.drawable.red22);
		put("23", R.drawable.red23);
		
		put("+", R.drawable.blank);
		put("=", R.drawable.blank);
		}
	};
}