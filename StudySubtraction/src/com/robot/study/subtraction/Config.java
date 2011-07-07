package com.robot.study.subtraction;

import java.util.ArrayList;
import java.util.HashMap;

import com.robot.study.Const;
import com.robot.study.Course;
import com.robot.study.Progress;

public class Config {
	
	public final static int COURSE_PLAYER_LAYOUT_ID = R.layout.courses;
	public final static int IMAGE_WIDGET_ID = R.id.image;
	public final static int STRING_NEXT_COURSE = R.string.next_course;
	
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
		"2","-","1","=","1",
		"2_e","-_e","1_e","=_e","1_e",
		"3","-","1","=","2",
		"3_e","-_e","1_e","=_e","2_e",
		"4","-","1","=","3",
		"4_e","-_e","1_e","=_e","3_e",
		Const.COURSE_BREAK,
		"3","-","2","=","1",
		"3_e","-_e","2_e","=_e","1_e",
		"4","-","2","=","2",
		"4_e","-_e","2_e","=_e","2_e",
		"5","-","2","=","3",
		"5_e","-_e","2_e","=_e","3_e",
		Const.COURSE_BREAK,
		"5","-","1","=","4",
		"5_e","-_e","1_e","=_e","4_e",
		"6","-","1","=","5",
		"6_e","-_e","1_e","=_e","5_e",
		"7","-","1","=","6",
		"7_e","-_e","1_e","=_e","6_e",
	};
	public final static String[] CourseData1_2 = {
		"3","-","2","=","1",
		"3_e","-_e","2_e","=_e","1_e",
		"4","-","2","=","2",
		"4_e","-_e","2_e","=_e","2_e",
		"5","-","2","=","3",
		"5_e","-_e","2_e","=_e","3_e",
		Const.COURSE_BREAK,
		"5","-","1","=","4",
		"5_e","-_e","1_e","=_e","4_e",
		"6","-","1","=","5",
		"6_e","-_e","1_e","=_e","5_e",
		"7","-","1","=","6",
		"7_e","-_e","1_e","=_e","6_e",
		Const.COURSE_BREAK,
		"4","-","3","=","1",
		"4_e","-_e","3_e","=_e","1_e",
		"5","-","3","=","2",
		"5_e","-_e","3_e","=_e","2_e",
		"6","-","3","=","3",
		"6_e","-_e","3_e","=_e","3_e"
	};
	public final static String[] CourseData1_3 = {
		"5","-","1","=","4",
		"5_e","-_e","1_e","=_e","4_e",
		"6","-","1","=","5",
		"6_e","-_e","1_e","=_e","5_e",
		"7","-","1","=","6",
		"7_e","-_e","1_e","=_e","6_e",
		Const.COURSE_BREAK,
		"4","-","3","=","1",
		"4_e","-_e","3_e","=_e","1_e",
		"5","-","3","=","2",
		"5_e","-_e","3_e","=_e","2_e",
		"6","-","3","=","3",
		"6_e","-_e","3_e","=_e","3_e",
		Const.COURSE_BREAK,
		"5","-","4","=","1",
		"5_e","-_e","4_e","=_e","1_e",
		"6","-","4","=","2",
		"6_e","-_e","4_e","=_e","2_e",
		"7","-","4","=","3",
		"7_e","-_e","4_e","=_e","3_e"
	};
	
	public final static String[] CourseData2_1 = { 
		"4","-","3","=","1",
		"4_e","-_e","3_e","=_e","1_e",
		"5","-","3","=","2",
		"5_e","-_e","3_e","=_e","2_e",
		"6","-","3","=","3",
		"6_e","-_e","3_e","=_e","3_e",
		Const.COURSE_BREAK,
		"5","-","4","=","1",
		"5_e","-_e","4_e","=_e","1_e",
		"6","-","4","=","2",
		"6_e","-_e","4_e","=_e","2_e",
		"7","-","4","=","3",
		"7_e","-_e","4_e","=_e","3_e",
		Const.COURSE_BREAK,
		"6","-","2","=","4",
		"6_e","-_e","2_e","=_e","4_e",
		"7","-","2","=","5",
		"7_e","-_e","2_e","=_e","5_e",
		"8","-","2","=","6",
		"8_e","-_e","2_e","=_e","6_e",
	};
	public final static String[] CourseData2_2 = { 
		"5","-","4","=","1",
		"5_e","-_e","4_e","=_e","1_e",
		"6","-","4","=","2",
		"6_e","-_e","4_e","=_e","2_e",
		"7","-","4","=","3",
		"7_e","-_e","4_e","=_e","3_e",
		Const.COURSE_BREAK,
		"6","-","2","=","4",
		"6_e","-_e","2_e","=_e","4_e",
		"7","-","2","=","5",
		"7_e","-_e","2_e","=_e","5_e",
		"8","-","2","=","6",
		"8_e","-_e","2_e","=_e","6_e",
		Const.COURSE_BREAK,
		"6","-","5","=","1",
		"6_e","-_e","5_e","=_e","1_e",
		"7","-","5","=","2",
		"7_e","-_e","5_e","=_e","2_e",
		"8","-","5","=","3",
		"8_e","-_e","5_e","=_e","3_e"
	};
	public final static String[] CourseData2_3 = { 
		"6","-","2","=","4",
		"6_e","-_e","2_e","=_e","4_e",
		"7","-","2","=","5",
		"7_e","-_e","2_e","=_e","5_e",
		"8","-","2","=","6",
		"8_e","-_e","2_e","=_e","6_e",
		Const.COURSE_BREAK,
		"6","-","5","=","1",
		"6_e","-_e","5_e","=_e","1_e",
		"7","-","5","=","2",
		"7_e","-_e","5_e","=_e","2_e",
		"8","-","5","=","3",
		"8_e","-_e","5_e","=_e","3_e",
		Const.COURSE_BREAK,
		"7","-","6","=","2",
		"7_e","-_e","6_e","=_e","2_e",
		"8","-","6","=","2",
		"8_e","-_e","6_e","=_e","2_e",
		"9","-","6","=","3",
		"9_e","-_e","6_e","=_e","3_e"
	};
	
	public final static String[] CourseData3_1 = { 
		"6","-","5","=","1",
		"6_e","-_e","5_e","=_e","1_e",
		"7","-","5","=","2",
		"7_e","-_e","5_e","=_e","2_e",
		"8","-","5","=","3",
		"8_e","-_e","5_e","=_e","3_e",
		Const.COURSE_BREAK,
		"7","-","6","=","2",
		"7_e","-_e","6_e","=_e","2_e",
		"8","-","6","=","2",
		"8_e","-_e","6_e","=_e","2_e",
		"9","-","6","=","3",
		"9_e","-_e","6_e","=_e","3_e",
		Const.COURSE_BREAK,
		"7","-","3","=","4",
		"7_e","-_e","3_e","=_e","4_e",
		"8","-","3","=","5",
		"8_e","-_e","3_e","=_e","5_e",
		"9","-","3","=","6",
		"9_e","-_e","3_e","=_e","6_e",
	};
	public final static String[] CourseData3_2 = { 
		"7","-","6","=","2",
		"7_e","-_e","6_e","=_e","2_e",
		"8","-","6","=","2",
		"8_e","-_e","6_e","=_e","2_e",
		"9","-","6","=","3",
		"9_e","-_e","6_e","=_e","3_e",
		Const.COURSE_BREAK,
		"7","-","3","=","4",
		"7_e","-_e","3_e","=_e","4_e",
		"8","-","3","=","5",
		"8_e","-_e","3_e","=_e","5_e",
		"9","-","3","=","6",
		"9_e","-_e","3_e","=_e","6_e",
		Const.COURSE_BREAK,
		"8","-","7","=","1",
		"8_e","-_e","7_e","=_e","1_e",
		"9","-","7","=","2",
		"9_e","-_e","7_e","=_e","2_e",
		"10","-","7","=","3",
		"10_e","-_e","7_e","=_e","3_e"
	};
	public final static String[] CourseData3_3 = { 
		"7","-","3","=","4",
		"7_e","-_e","3_e","=_e","4_e",
		"8","-","3","=","5",
		"8_e","-_e","3_e","=_e","5_e",
		"9","-","3","=","6",
		"9_e","-_e","3_e","=_e","6_e",
		Const.COURSE_BREAK,
		"8","-","7","=","1",
		"8_e","-_e","7_e","=_e","1_e",
		"9","-","7","=","2",
		"9_e","-_e","7_e","=_e","2_e",
		"10","-","7","=","3",
		"10_e","-_e","7_e","=_e","3_e",
		Const.COURSE_BREAK,
		"9","-","8","=","1",
		"9_e","-_e","8_e","=_e","1_e",
		"10","-","8","=","2",
		"10_e","-_e","8_e","=_e","2_e",
		"11","-","8","=","3",
		"11_e","-_e","8_e","=_e","3_e"
	};
	
	public final static String[] CourseData4_1 = { 
		"8","-","7","=","1",
		"8_e","-_e","7_e","=_e","1_e",
		"9","-","7","=","2",
		"9_e","-_e","7_e","=_e","2_e",
		"10","-","7","=","3",
		"10_e","-_e","7_e","=_e","3_e",
		Const.COURSE_BREAK,
		"9","-","8","=","1",
		"9_e","-_e","8_e","=_e","1_e",
		"10","-","8","=","2",
		"10_e","-_e","8_e","=_e","2_e",
		"11","-","8","=","3",
		"11_e","-_e","8_e","=_e","3_e",
		Const.COURSE_BREAK,
		"8","-","4","=","4",
		"8_e","-_e","4_e","=_e","4_e",
		"9","-","4","=","5",
		"9_e","-_e","4_e","=_e","5_e",
		"10","-","4","=","6",
		"10_e","-_e","4_e","=_e","6_e",
	};
	public final static String[] CourseData4_2 = { 
		"9","-","8","=","1",
		"9_e","-_e","8_e","=_e","1_e",
		"10","-","8","=","2",
		"10_e","-_e","8_e","=_e","2_e",
		"11","-","8","=","3",
		"11_e","-_e","8_e","=_e","3_e",
		Const.COURSE_BREAK,
		"8","-","4","=","4",
		"8_e","-_e","4_e","=_e","4_e",
		"9","-","4","=","5",
		"9_e","-_e","4_e","=_e","5_e",
		"10","-","4","=","6",
		"10_e","-_e","4_e","=_e","6_e",
		Const.COURSE_BREAK,
		"10","-","9","=","1",
		"10_e","-_e","9_e","=_e","1_e",
		"11","-","9","=","2",
		"11_e","-_e","9_e","=_e","2_e",
		"12","-","9","=","3",
		"12_e","-_e","9_e","=_e","3_e"
	};
	public final static String[] CourseData4_3 = { 
		"8","-","4","=","4",
		"8_e","-_e","4_e","=_e","4_e",
		"9","-","4","=","5",
		"9_e","-_e","4_e","=_e","5_e",
		"10","-","4","=","6",
		"10_e","-_e","4_e","=_e","6_e",
		Const.COURSE_BREAK,
		"10","-","9","=","1",
		"10_e","-_e","9_e","=_e","1_e",
		"11","-","9","=","2",
		"11_e","-_e","9_e","=_e","2_e",
		"12","-","9","=","3",
		"12_e","-_e","9_e","=_e","3_e",
		Const.COURSE_BREAK,
		"11","-","10","=","1",
		"11_e","-_e","10_e","=_e","1_e",
		"12","-","10","=","2",
		"12_e","-_e","10_e","=_e","2_e",
		"13","-","10","=","3",
		"13_e","-_e","10_e","=_e","3_e"
	};
	
	public final static String[] CourseData5_1 = { 
		"10","-","9","=","1",
		"10_e","-_e","9_e","=_e","1_e",
		"11","-","9","=","2",
		"11_e","-_e","9_e","=_e","2_e",
		"12","-","9","=","3",
		"12_e","-_e","9_e","=_e","3_e",
		Const.COURSE_BREAK,
		"11","-","10","=","1",
		"11_e","-_e","10_e","=_e","1_e",
		"12","-","10","=","2",
		"12_e","-_e","10_e","=_e","2_e",
		"13","-","10","=","3",
		"13_e","-_e","10_e","=_e","3_e",
		Const.COURSE_BREAK,
		"9","-","5","=","4",
		"9_e","-_e","5_e","=_e","4_e",
		"10","-","5","=","5",
		"10_e","-_e","5_e","=_e","5_e",
		"11","-","5","=","6",
		"11_e","-_e","5_e","=_e","6_e",
	};
	public final static String[] CourseData5_2 = { 
		"11","-","10","=","1",
		"11_e","-_e","10_e","=_e","1_e",
		"12","-","10","=","2",
		"12_e","-_e","10_e","=_e","2_e",
		"13","-","10","=","3",
		"13_e","-_e","10_e","=_e","3_e",
		Const.COURSE_BREAK,
		"9","-","5","=","4",
		"9_e","-_e","5_e","=_e","4_e",
		"10","-","5","=","5",
		"10_e","-_e","5_e","=_e","5_e",
		"11","-","5","=","6",
		"11_e","-_e","5_e","=_e","6_e",
		Const.COURSE_BREAK,
		"12","-","11","=","1",
		"12_e","-_e","11_e","=_e","1_e",
		"13","-","11","=","2",
		"13_e","-_e","11_e","=_e","2_e",
		"14","-","11","=","3",
		"14_e","-_e","11_e","=_e","3_e"
	};
	public final static String[] CourseData5_3 = { 
		"9","-","5","=","4",
		"9_e","-_e","5_e","=_e","4_e",
		"10","-","5","=","5",
		"10_e","-_e","5_e","=_e","5_e",
		"11","-","5","=","6",
		"11_e","-_e","5_e","=_e","6_e",
		Const.COURSE_BREAK,
		"12","-","11","=","1",
		"12_e","-_e","11_e","=_e","1_e",
		"13","-","11","=","2",
		"13_e","-_e","11_e","=_e","2_e",
		"14","-","11","=","3",
		"14_e","-_e","11_e","=_e","3_e",
		Const.COURSE_BREAK,
		"13","-","12","=","1",
		"13_e","-_e","12_e","=_e","1_e",
		"14","-","12","=","2",
		"14_e","-_e","12_e","=_e","2_e",
		"15","-","12","=","3",
		"15_e","-_e","12_e","=_e","3_e"
	};
	
	public final static String[] CourseData6_1 = { 
		"12","-","11","=","1",
		"12_e","-_e","11_e","=_e","1_e",
		"13","-","11","=","2",
		"13_e","-_e","11_e","=_e","2_e",
		"14","-","11","=","3",
		"14_e","-_e","11_e","=_e","3_e",
		Const.COURSE_BREAK,
		"13","-","12","=","1",
		"13_e","-_e","12_e","=_e","1_e",
		"14","-","12","=","2",
		"14_e","-_e","12_e","=_e","2_e",
		"15","-","12","=","3",
		"15_e","-_e","12_e","=_e","3_e",
		Const.COURSE_BREAK,
		"10","-","6","=","4",
		"10_e","-_e","6_e","=_e","4_e",
		"11","-","6","=","5",
		"11_e","-_e","6_e","=_e","5_e",
		"12","-","6","=","6",
		"12_e","-_e","6_e","=_e","6_e",
	};
	public final static String[] CourseData6_2 = { 
		"13","-","12","=","1",
		"13_e","-_e","12_e","=_e","1_e",
		"14","-","12","=","2",
		"14_e","-_e","12_e","=_e","2_e",
		"15","-","12","=","3",
		"15_e","-_e","12_e","=_e","3_e",
		Const.COURSE_BREAK,
		"10","-","6","=","4",
		"10_e","-_e","6_e","=_e","4_e",
		"11","-","6","=","5",
		"11_e","-_e","6_e","=_e","5_e",
		"12","-","6","=","6",
		"12_e","-_e","6_e","=_e","6_e",
		Const.COURSE_BREAK,
		"14","-","13","=","1",
		"14_e","-_e","13_e","=_e","1_e",
		"15","-","13","=","2",
		"15_e","-_e","13_e","=_e","2_e",
		"16","-","13","=","3",
		"16_e","-_e","13_e","=_e","3_e"
	};
	public final static String[] CourseData6_3 = { 
		"10","-","6","=","4",
		"10_e","-_e","6_e","=_e","4_e",
		"11","-","6","=","5",
		"11_e","-_e","6_e","=_e","5_e",
		"12","-","6","=","6",
		"12_e","-_e","6_e","=_e","6_e",
		Const.COURSE_BREAK,
		"14","-","13","=","1",
		"14_e","-_e","13_e","=_e","1_e",
		"15","-","13","=","2",
		"15_e","-_e","13_e","=_e","2_e",
		"16","-","13","=","3",
		"16_e","-_e","13_e","=_e","3_e",
		Const.COURSE_BREAK,
		"15","-","14","=","1",
		"15_e","-_e","14_e","=_e","1_e",
		"16","-","14","=","2",
		"16_e","-_e","14_e","=_e","2_e",
		"17","-","14","=","3",
		"17_e","-_e","14_e","=_e","3_e"
	};
	
	public final static String[] CourseData7_1 = { 
		"14","-","13","=","1",
		"14_e","-_e","13_e","=_e","1_e",
		"15","-","13","=","2",
		"15_e","-_e","13_e","=_e","2_e",
		"16","-","13","=","3",
		"16_e","-_e","13_e","=_e","3_e",
		Const.COURSE_BREAK,
		"15","-","14","=","1",
		"15_e","-_e","14_e","=_e","1_e",
		"16","-","14","=","2",
		"16_e","-_e","14_e","=_e","2_e",
		"17","-","14","=","3",
		"17_e","-_e","14_e","=_e","3_e",
		Const.COURSE_BREAK,
		"11","-","7","=","4",
		"11_e","-_e","7_e","=_e","4_e",
		"12","-","7","=","5",
		"12_e","-_e","7_e","=_e","5_e",
		"13","-","7","=","6",
		"13_e","-_e","7_e","=_e","6_e",
	};
	public final static String[] CourseData7_2 = { 
		"15","-","14","=","1",
		"15_e","-_e","14_e","=_e","1_e",
		"16","-","14","=","2",
		"16_e","-_e","14_e","=_e","2_e",
		"17","-","14","=","3",
		"17_e","-_e","14_e","=_e","3_e",
		Const.COURSE_BREAK,
		"11","-","7","=","4",
		"11_e","-_e","7_e","=_e","4_e",
		"12","-","7","=","5",
		"12_e","-_e","7_e","=_e","5_e",
		"13","-","7","=","6",
		"13_e","-_e","7_e","=_e","6_e",
		Const.COURSE_BREAK,
		"16","-","15","=","1",
		"16_e","-_e","15_e","=_e","1_e",
		"17","-","15","=","2",
		"17_e","-_e","15_e","=_e","2_e",
		"18","-","15","=","3",
		"18_e","-_e","15_e","=_e","3_e"
	};
	public final static String[] CourseData7_3 = { 
		"11","-","7","=","4",
		"11_e","-_e","7_e","=_e","4_e",
		"12","-","7","=","5",
		"12_e","-_e","7_e","=_e","5_e",
		"13","-","7","=","6",
		"13_e","-_e","7_e","=_e","6_e",
		Const.COURSE_BREAK,
		"16","-","15","=","1",
		"16_e","-_e","15_e","=_e","1_e",
		"17","-","15","=","2",
		"17_e","-_e","15_e","=_e","2_e",
		"18","-","15","=","3",
		"18_e","-_e","15_e","=_e","3_e",
		Const.COURSE_BREAK,
		"17","-","16","=","1",
		"17_e","-_e","16_e","=_e","1_e",
		"18","-","16","=","2",
		"18_e","-_e","16_e","=_e","2_e",
		"19","-","16","=","3",
		"19_e","-_e","16_e","=_e","3_e"
	};
	
	public final static String[] CourseData8_1 = { 
		"16","-","15","=","1",
		"16_e","-_e","15_e","=_e","1_e",
		"17","-","15","=","2",
		"17_e","-_e","15_e","=_e","2_e",
		"18","-","15","=","3",
		"18_e","-_e","15_e","=_e","3_e",
		Const.COURSE_BREAK,
		"17","-","16","=","1",
		"17_e","-_e","16_e","=_e","1_e",
		"18","-","16","=","2",
		"18_e","-_e","16_e","=_e","2_e",
		"19","-","16","=","3",
		"19_e","-_e","16_e","=_e","3_e",
		Const.COURSE_BREAK,
		"12","-","8","=","4",
		"12_e","-_e","8_e","=_e","4_e",
		"13","-","8","=","5",
		"13_e","-_e","8_e","=_e","5_e",
		"14","-","8","=","6",
		"14_e","-_e","8_e","=_e","6_e",
	};
	public final static String[] CourseData8_2 = { 
		"17","-","16","=","1",
		"17_e","-_e","16_e","=_e","1_e",
		"18","-","16","=","2",
		"18_e","-_e","16_e","=_e","2_e",
		"19","-","16","=","3",
		"19_e","-_e","16_e","=_e","3_e",
		Const.COURSE_BREAK,
		"12","-","8","=","4",
		"12_e","-_e","8_e","=_e","4_e",
		"13","-","8","=","5",
		"13_e","-_e","8_e","=_e","5_e",
		"14","-","8","=","6",
		"14_e","-_e","8_e","=_e","6_e",
		Const.COURSE_BREAK,
		"8","-","1","=","7",
		"8_e","-_e","1_e","=_e","7_e",
		"9","-","1","=","8",
		"9_e","-_e","1_e","=_e","8_e",
		"10","-","1","=","9",
		"10_e","-_e","1_e","=_e","9_e"
	};
	public final static String[] CourseData8_3 = { 
		"12","-","8","=","4",
		"12_e","-_e","8_e","=_e","4_e",
		"13","-","8","=","5",
		"13_e","-_e","8_e","=_e","5_e",
		"14","-","8","=","6",
		"14_e","-_e","8_e","=_e","6_e",
		Const.COURSE_BREAK,
		"8","-","1","=","7",
		"8_e","-_e","1_e","=_e","7_e",
		"9","-","1","=","8",
		"9_e","-_e","1_e","=_e","8_e",
		"10","-","1","=","9",
		"10_e","-_e","1_e","=_e","9_e",
		Const.COURSE_BREAK,
		"9","-","2","=","7",
		"9_e","-_e","2_e","=_e","7_e",
		"10","-","2","=","8",
		"10_e","-_e","2_e","=_e","8_e",
		"11","-","2","=","9",
		"11_e","-_e","2_e","=_e","9_e"
	};
	
	public final static String[] CourseData9_1 = { 
		"8","-","1","=","7",
		"8_e","-_e","1_e","=_e","7_e",
		"9","-","1","=","8",
		"9_e","-_e","1_e","=_e","8_e",
		"10","-","1","=","9",
		"10_e","-_e","1_e","=_e","9_e",
		Const.COURSE_BREAK,
		"9","-","2","=","7",
		"9_e","-_e","2_e","=_e","7_e",
		"10","-","2","=","8",
		"10_e","-_e","2_e","=_e","8_e",
		"11","-","2","=","9",
		"11_e","-_e","2_e","=_e","9_e",
		Const.COURSE_BREAK,
		"11","-","1","=","10",
		"11_e","-_e","1_e","=_e","10_e",
		"12","-","1","=","11",
		"12_e","-_e","1_e","=_e","11_e",
		"13","-","1","=","12",
		"13_e","-_e","1_e","=_e","12_e",
	};
	public final static String[] CourseData9_2 = {
		"9","-","2","=","7",
		"9_e","-_e","2_e","=_e","7_e",
		"10","-","2","=","8",
		"10_e","-_e","2_e","=_e","8_e",
		"11","-","2","=","9",
		"11_e","-_e","2_e","=_e","9_e",
		Const.COURSE_BREAK,
		"11","-","1","=","10",
		"11_e","-_e","1_e","=_e","10_e",
		"12","-","1","=","11",
		"12_e","-_e","1_e","=_e","11_e",
		"13","-","1","=","12",
		"13_e","-_e","1_e","=_e","12_e",
		Const.COURSE_BREAK,
		"10","-","3","=","7",
		"10_e","-_e","3_e","=_e","7_e",
		"11","-","3","=","8",
		"11_e","-_e","3_e","=_e","8_e",
		"12","-","3","=","9",
		"12_e","-_e","3_e","=_e","9_e"
	};
	public final static String[] CourseData9_3 = {
		"11","-","1","=","10",
		"11_e","-_e","1_e","=_e","10_e",
		"12","-","1","=","11",
		"12_e","-_e","1_e","=_e","11_e",
		"13","-","1","=","12",
		"13_e","-_e","1_e","=_e","12_e",
		Const.COURSE_BREAK,
		"10","-","3","=","7",
		"10_e","-_e","3_e","=_e","7_e",
		"11","-","3","=","8",
		"11_e","-_e","3_e","=_e","8_e",
		"12","-","3","=","9",
		"12_e","-_e","3_e","=_e","9_e",
		Const.COURSE_BREAK,
		"11","-","4","=","7",
		"11_e","-_e","4_e","=_e","7_e",
		"12","-","4","=","8",
		"12_e","-_e","4_e","=_e","8_e",
		"13","-","4","=","9",
		"13_e","-_e","4_e","=_e","9_e"
	};
	
	public final static String[] CourseData10_1 = { 
		"10","-","3","=","7",
		"10_e","-_e","3_e","=_e","7_e",
		"11","-","3","=","8",
		"11_e","-_e","3_e","=_e","8_e",
		"12","-","3","=","9",
		"12_e","-_e","3_e","=_e","9_e",
		Const.COURSE_BREAK,
		"11","-","4","=","7",
		"11_e","-_e","4_e","=_e","7_e",
		"12","-","4","=","8",
		"12_e","-_e","4_e","=_e","8_e",
		"13","-","4","=","9",
		"13_e","-_e","4_e","=_e","9_e",
		Const.COURSE_BREAK,
		"12","-","2","=","10",
		"12_e","-_e","2_e","=_e","10_e",
		"13","-","2","=","11",
		"13_e","-_e","2_e","=_e","11_e",
		"14","-","2","=","12",
		"14_e","-_e","2_e","=_e","12_e",
	};
	public final static String[] CourseData10_2 = { 
		"11","-","4","=","7",
		"11_e","-_e","4_e","=_e","7_e",
		"12","-","4","=","8",
		"12_e","-_e","4_e","=_e","8_e",
		"13","-","4","=","9",
		"13_e","-_e","4_e","=_e","9_e",
		Const.COURSE_BREAK,
		"12","-","2","=","10",
		"12_e","-_e","2_e","=_e","10_e",
		"13","-","2","=","11",
		"13_e","-_e","2_e","=_e","11_e",
		"14","-","2","=","12",
		"14_e","-_e","2_e","=_e","12_e",
		Const.COURSE_BREAK,
		"12","-","5","=","7",
		"12_e","-_e","5_e","=_e","7_e",
		"13","-","5","=","8",
		"13_e","-_e","5_e","=_e","8_e",
		"14","-","5","=","9",
		"14_e","-_e","5_e","=_e","9_e"
	};
	public final static String[] CourseData10_3 = { 
		"12","-","2","=","10",
		"12_e","-_e","2_e","=_e","10_e",
		"13","-","2","=","11",
		"13_e","-_e","2_e","=_e","11_e",
		"14","-","2","=","12",
		"14_e","-_e","2_e","=_e","12_e",
		Const.COURSE_BREAK,
		"12","-","5","=","7",
		"12_e","-_e","5_e","=_e","7_e",
		"13","-","5","=","8",
		"13_e","-_e","5_e","=_e","8_e",
		"14","-","5","=","9",
		"14_e","-_e","5_e","=_e","9_e",
		Const.COURSE_BREAK,
		"13","-","6","=","7",
		"13_e","-_e","6_e","=_e","7_e",
		"14","-","6","=","8",
		"14_e","-_e","6_e","=_e","8_e",
		"15","-","6","=","9",
		"15_e","-_e","6_e","=_e","9_e"
	};
	
	public final static String[] CourseData11_1 = { 
		"12","-","5","=","7",
		"12_e","-_e","5_e","=_e","7_e",
		"13","-","5","=","8",
		"13_e","-_e","5_e","=_e","8_e",
		"14","-","5","=","9",
		"14_e","-_e","5_e","=_e","9_e",
		Const.COURSE_BREAK,
		"13","-","6","=","7",
		"13_e","-_e","6_e","=_e","7_e",
		"14","-","6","=","8",
		"14_e","-_e","6_e","=_e","8_e",
		"15","-","6","=","9",
		"15_e","-_e","6_e","=_e","9_e",
		Const.COURSE_BREAK,
		"13","-","3","=","10",
		"13_e","-_e","3_e","=_e","10_e",
		"14","-","3","=","11",
		"14_e","-_e","3_e","=_e","11_e",
		"15","-","3","=","12",
		"15_e","-_e","3_e","=_e","12_e",
	};
	public final static String[] CourseData11_2 = { 
		"13","-","6","=","7",
		"13_e","-_e","6_e","=_e","7_e",
		"14","-","6","=","8",
		"14_e","-_e","6_e","=_e","8_e",
		"15","-","6","=","9",
		"15_e","-_e","6_e","=_e","9_e",
		Const.COURSE_BREAK,
		"13","-","3","=","10",
		"13_e","-_e","3_e","=_e","10_e",
		"14","-","3","=","11",
		"14_e","-_e","3_e","=_e","11_e",
		"15","-","3","=","12",
		"15_e","-_e","3_e","=_e","12_e",
		Const.COURSE_BREAK,
		"14","-","7","=","7",
		"14_e","-_e","7_e","=_e","7_e",
		"15","-","7","=","8",
		"15_e","-_e","7_e","=_e","8_e",
		"16","-","7","=","9",
		"16_e","-_e","7_e","=_e","9_e"
	};
	public final static String[] CourseData11_3 = { 
		"13","-","3","=","10",
		"13_e","-_e","3_e","=_e","10_e",
		"14","-","3","=","11",
		"14_e","-_e","3_e","=_e","11_e",
		"15","-","3","=","12",
		"15_e","-_e","3_e","=_e","12_e",
		Const.COURSE_BREAK,
		"14","-","7","=","7",
		"14_e","-_e","7_e","=_e","7_e",
		"15","-","7","=","8",
		"15_e","-_e","7_e","=_e","8_e",
		"16","-","7","=","9",
		"16_e","-_e","7_e","=_e","9_e",
		Const.COURSE_BREAK,
		"15","-","8","=","7",
		"15_e","-_e","8_e","=_e","7_e",
		"16","-","8","=","8",
		"16_e","-_e","8_e","=_e","8_e",
		"17","-","8","=","9",
		"17_e","-_e","8_e","=_e","9_e"
	};
	
	public final static String[] CourseData12_1 = { 
		"14","-","7","=","7",
		"14_e","-_e","7_e","=_e","7_e",
		"15","-","7","=","8",
		"15_e","-_e","7_e","=_e","8_e",
		"16","-","7","=","9",
		"16_e","-_e","7_e","=_e","9_e",
		Const.COURSE_BREAK,
		"15","-","8","=","7",
		"15_e","-_e","8_e","=_e","7_e",
		"16","-","8","=","8",
		"16_e","-_e","8_e","=_e","8_e",
		"17","-","8","=","9",
		"17_e","-_e","8_e","=_e","9_e",
		Const.COURSE_BREAK,
		"14","-","4","=","10",
		"14_e","-_e","4_e","=_e","10_e",
		"15","-","4","=","11",
		"15_e","-_e","4_e","=_e","11_e",
		"16","-","4","=","12",
		"16_e","-_e","4_e","=_e","12_e",
	};
	public final static String[] CourseData12_2 = { 
		"15","-","8","=","7",
		"15_e","-_e","8_e","=_e","7_e",
		"16","-","8","=","8",
		"16_e","-_e","8_e","=_e","8_e",
		"17","-","8","=","9",
		"17_e","-_e","8_e","=_e","9_e",
		Const.COURSE_BREAK,
		"14","-","4","=","10",
		"14_e","-_e","4_e","=_e","10_e",
		"15","-","4","=","11",
		"15_e","-_e","4_e","=_e","11_e",
		"16","-","4","=","12",
		"16_e","-_e","4_e","=_e","12_e",
		Const.COURSE_BREAK,
		"30","-","20","=","10",
		"30_e","-_e","20_e","=_e","10_e",
		"29","-","21","=","8",
		"29_e","-_e","21_e","=_e","8_e",
		"28","-","22","=","6",
		"28_e","-_e","22_e","=_e","6_e"
	};
	public final static String[] CourseData12_3 = { 
		"14","-","4","=","10",
		"14_e","-_e","4_e","=_e","10_e",
		"15","-","4","=","11",
		"15_e","-_e","4_e","=_e","11_e",
		"16","-","4","=","12",
		"16_e","-_e","4_e","=_e","12_e",
		Const.COURSE_BREAK,
		"30","-","20","=","10",
		"30_e","-_e","20_e","=_e","10_e",
		"29","-","21","=","8",
		"29_e","-_e","21_e","=_e","8_e",
		"28","-","22","=","6",
		"28_e","-_e","22_e","=_e","6_e",
		Const.COURSE_BREAK,
		"33","-","22","=","11",
		"33_e","-_e","22_e","=_e","11_e",
		"17","-","9","=","8",
		"17_e","-_e","9_e","=_e","8_e",
		"36","-","29","=","7",
		"36_e","-_e","29_e","=_e","7_e"
	};
	public final static String[] CourseData13_1 = { 
		"30","-","20","=","10",
		"30_e","-_e","20_e","=_e","10_e",
		"29","-","21","=","8",
		"29_e","-_e","21_e","=_e","8_e",
		"28","-","22","=","6",
		"28_e","-_e","22_e","=_e","6_e",
		Const.COURSE_BREAK,
		"33","-","22","=","11",
		"33_e","-_e","22_e","=_e","11_e",
		"17","-","9","=","8",
		"17_e","-_e","9_e","=_e","8_e",
		"36","-","29","=","7",
		"36_e","-_e","29_e","=_e","7_e",
		Const.COURSE_BREAK,
		"23","-","18","=","5",
		"23_e","-_e","18_e","=_e","5_e",
		"15","-","1","=","14",
		"15_e","-_e","1_e","=_e","14_e",
		"13","-","1","=","12",
		"13_e","-_e","1_e","=_e","12_e",
	};
	public final static String[] CourseData13_2 = { 
		"33","-","22","=","11",
		"33_e","-_e","22_e","=_e","11_e",
		"17","-","9","=","8",
		"17_e","-_e","9_e","=_e","8_e",
		"36","-","29","=","7",
		"36_e","-_e","29_e","=_e","7_e",
		Const.COURSE_BREAK,
		"23","-","18","=","5",
		"23_e","-_e","18_e","=_e","5_e",
		"15","-","1","=","14",
		"15_e","-_e","1_e","=_e","14_e",
		"13","-","1","=","12",
		"13_e","-_e","1_e","=_e","12_e",
		Const.COURSE_BREAK,
		"60","-","31","=","29",
		"60_e","-_e","31_e","=_e","29_e",
		"50","-","40","=","10",
		"50_e","-_e","40_e","=_e","10_e",
		"29","-","23","=","6",
		"29_e","-_e","23_e","=_e","6_e"
	};
	public final static String[] CourseData13_3 = { 
		"23","-","18","=","5",
		"23_e","-_e","18_e","=_e","5_e",
		"15","-","1","=","14",
		"15_e","-_e","1_e","=_e","14_e",
		"13","-","1","=","12",
		"13_e","-_e","1_e","=_e","12_e",
		Const.COURSE_BREAK,
		"60","-","31","=","29",
		"60_e","-_e","31_e","=_e","29_e",
		"50","-","40","=","10",
		"50_e","-_e","40_e","=_e","10_e",
		"29","-","23","=","6",
		"29_e","-_e","23_e","=_e","6_e",
		Const.COURSE_BREAK,
		"62","-","20","=","42",
		"62_e","-_e","20_e","=_e","42_e",
		"58","-","7","=","51",
		"58_e","-_e","7_e","=_e","51_e",
		"37","-","30","=","7",
		"37_e","-_e","30_e","=_e","7_e"
	};
	
	public final static String[] CourseData14_1 = { 
		"60","-","31","=","29",
		"60_e","-_e","31_e","=_e","29_e",
		"50","-","40","=","10",
		"50_e","-_e","40_e","=_e","10_e",
		"29","-","23","=","6",
		"29_e","-_e","23_e","=_e","6_e",
		Const.COURSE_BREAK,
		"62","-","20","=","42",
		"62_e","-_e","20_e","=_e","42_e",
		"58","-","7","=","51",
		"58_e","-_e","7_e","=_e","51_e",
		"37","-","30","=","7",
		"37_e","-_e","30_e","=_e","7_e",
		Const.COURSE_BREAK,
		"24","-","19","=","5",
		"24_e","-_e","19_e","=_e","5_e",
		"16","-","2","=","14",
		"16_e","-_e","2_e","=_e","14_e",
		"60","-","1","=","59",
		"60_e","-_e","1_e","=_e","59_e",
	};
	public final static String[] CourseData14_2 = { 
		"62","-","20","=","42",
		"62_e","-_e","20_e","=_e","42_e",
		"58","-","7","=","51",
		"58_e","-_e","7_e","=_e","51_e",
		"37","-","30","=","7",
		"37_e","-_e","30_e","=_e","7_e",
		Const.COURSE_BREAK,
		"24","-","19","=","5",
		"24_e","-_e","19_e","=_e","5_e",
		"16","-","2","=","14",
		"16_e","-_e","2_e","=_e","14_e",
		"60","-","1","=","59",
		"60_e","-_e","1_e","=_e","59_e",
		Const.COURSE_BREAK,
		"2","-","1","=","1",
		"2_e","-_e","1_e","=_e","1_e",
		"3","-","1","=","2",
		"3_e","-_e","1_e","=_e","2_e",
		"4","-","1","=","3",
		"4_e","-_e","1_e","=_e","3_e",
	};
	public final static String[] CourseData14_3 = { 
		"24","-","19","=","5",
		"24_e","-_e","19_e","=_e","5_e",
		"16","-","2","=","14",
		"16_e","-_e","2_e","=_e","14_e",
		"60","-","1","=","59",
		"60_e","-_e","1_e","=_e","59_e",
		Const.COURSE_BREAK,
		"2","-","1","=","1",
		"2_e","-_e","1_e","=_e","1_e",
		"3","-","1","=","2",
		"3_e","-_e","1_e","=_e","2_e",
		"4","-","1","=","3",
		"4_e","-_e","1_e","=_e","3_e",
		Const.COURSE_BREAK,
		"3","-","2","=","1",
		"3_e","-_e","2_e","=_e","1_e",
		"4","-","2","=","2",
		"4_e","-_e","2_e","=_e","2_e",
		"5","-","2","=","3",
		"5_e","-_e","2_e","=_e","3_e",
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
		put("24", R.raw.sound024);
		put("28", R.raw.sound028);
		put("29", R.raw.sound029);
		put("30", R.raw.sound030);
		put("31", R.raw.sound031);
		put("33", R.raw.sound033);
		put("36", R.raw.sound036);
		put("37", R.raw.sound037);
		put("40", R.raw.sound040);
		put("42", R.raw.sound042);
		put("50", R.raw.sound050);
		put("51", R.raw.sound051);
		put("58", R.raw.sound058);
		put("59", R.raw.sound059);
		put("60", R.raw.sound060);
		put("62", R.raw.sound062);
		
		put("-", R.raw.sub);
		put("=", R.raw.equal);
		
		put("1_e", R.raw.sound001_e);
		put("2_e", R.raw.sound002_e);
		put("3_e", R.raw.sound003_e);
		put("4_e", R.raw.sound004_e);
		put("5_e", R.raw.sound005_e);
		put("6_e", R.raw.sound006_e);
		put("7_e", R.raw.sound007_e);
		put("8_e", R.raw.sound008_e);
		put("9_e", R.raw.sound009_e);
		put("10_e", R.raw.sound010_e);
		put("11_e", R.raw.sound011_e);
		put("12_e", R.raw.sound012_e);
		put("13_e", R.raw.sound013_e);
		put("14_e", R.raw.sound014_e);
		put("15_e", R.raw.sound015_e);
		put("16_e", R.raw.sound016_e);
		put("17_e", R.raw.sound017_e);
		put("18_e", R.raw.sound018_e);
		put("19_e", R.raw.sound019_e);
		put("20_e", R.raw.sound020_e);
		put("21_e", R.raw.sound021_e);
		put("22_e", R.raw.sound022_e);
		put("23_e", Const.SOUND_INVALID);
		put("24_e", Const.SOUND_INVALID);
		put("28_e", Const.SOUND_INVALID);
		put("29_e", Const.SOUND_INVALID);
		put("30_e", Const.SOUND_INVALID);
		put("31_e", Const.SOUND_INVALID);
		put("33_e", Const.SOUND_INVALID);
		put("36_e", Const.SOUND_INVALID);
		put("37_e", Const.SOUND_INVALID);
		put("40_e", Const.SOUND_INVALID);
		put("42_e", Const.SOUND_INVALID);
		put("50_e", Const.SOUND_INVALID);
		put("51_e", Const.SOUND_INVALID);
		put("58_e", Const.SOUND_INVALID);
		put("59_e", Const.SOUND_INVALID);
		put("60_e", Const.SOUND_INVALID);
		put("62_e", Const.SOUND_INVALID);
		
		put("-_e", R.raw.sub_e);
		put("=_e", R.raw.equal_e);
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
		put("24", R.drawable.blank);
		put("28", R.drawable.blank);
		put("29", R.drawable.blank);
		put("30", R.drawable.blank);
		put("31", R.drawable.blank);
		put("33", R.drawable.blank);
		put("36", R.drawable.blank);
		put("37", R.drawable.blank);
		put("40", R.drawable.blank);
		put("42", R.drawable.blank);
		put("50", R.drawable.blank);
		put("51", R.drawable.blank);
		put("58", R.drawable.blank);
		put("59", R.drawable.blank);
		put("60", R.drawable.blank);
		put("62", R.drawable.blank);
		
		put("-", R.drawable.blank);
		put("=", R.drawable.blank);
		
		put("1_e", R.drawable.red01);
		put("2_e", R.drawable.red02);
		put("3_e", R.drawable.red03);
		put("4_e", R.drawable.red04);
		put("5_e", R.drawable.red05);
		put("6_e", R.drawable.red06);
		put("7_e", R.drawable.red07);
		put("8_e", R.drawable.red08);
		put("9_e", R.drawable.red09);
		put("10_e", R.drawable.red10);
		put("11_e", R.drawable.red11);
		put("12_e", R.drawable.red12);
		put("13_e", R.drawable.red13);
		put("14_e", R.drawable.red14);
		put("15_e", R.drawable.red15);
		put("16_e", R.drawable.red16);
		put("17_e", R.drawable.red17);
		put("18_e", R.drawable.red18);
		put("19_e", R.drawable.red19);
		put("20_e", R.drawable.red20);
		put("21_e", R.drawable.red21);
		put("22_e", R.drawable.red22);
		put("23_e", R.drawable.red23);
		put("24_e", R.drawable.blank);
		put("28_e", R.drawable.blank);
		put("29_e", R.drawable.blank);
		put("30_e", R.drawable.blank);
		put("31_e", R.drawable.blank);
		put("33_e", R.drawable.blank);
		put("36_e", R.drawable.blank);
		put("37_e", R.drawable.blank);
		put("40_e", R.drawable.blank);
		put("42_e", R.drawable.blank);
		put("50_e", R.drawable.blank);
		put("51_e", R.drawable.blank);
		put("58_e", R.drawable.blank);
		put("59_e", R.drawable.blank);
		put("60_e", R.drawable.blank);
		put("62_e", R.drawable.blank);
		
		put("-_e", R.drawable.blank);
		put("=_e", R.drawable.blank);
		}
	};
}
