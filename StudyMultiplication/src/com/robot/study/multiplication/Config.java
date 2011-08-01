package com.robot.study.multiplication;

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
		"1","+","1","=","2",
		"1_e","+_e","1_e","=_e","2_e",
		"1","+","2","=","3",
		"1_e","+_e","2_e","=_e","3_e",
		"1","+","3","=","4",
		"1_e","+_e","3_e","=_e","4_e",
		Const.COURSE_BREAK,
		"1","+","4","=","5",
		"1_e","+_e","4_e","=_e","5_e", 
		"1","+","5","=","6", 
		"1_e","+_e","5_e","=_e","6_e",
		"1","+","6","=","7",
		"1_e","+_e","6_e","=_e","7_e",
		Const.COURSE_BREAK,
		"1","+","7","=","8",
		"1_e","+_e","7_e","=_e","8_e",
		"1","+","8","=","9",
		"1_e","+_e","8_e","=_e","9_e",
		"1","+","9","=","10",
		"1_e","+_e","9_e","=_e","10_e",
	};
	public final static String[] CourseData1_2 = {
		"1","+","4","=","5",
		"1_e","+_e","4_e","=_e","5_e",
		"1","+","5","=","6",
		"1_e","+_e","5_e","=_e","6_e",
		"1","+","6","=","7",
		"1_e","+_e","6_e","=_e","7_e",
		Const.COURSE_BREAK,
		"1","+","7","=","8",
		"1_e","+_e","7_e","=_e","8_e",
		"1","+","8","=","9",
		"1_e","+_e","8_e","=_e","9_e",
		"1","+","9","=","10",
		"1_e","+_e","9_e","=_e","10_e",
		Const.COURSE_BREAK,
		"2","+","2","=","4",
		"2_e","+_e","2_e","=_e","4_e",
		"2","+","3","=","5",
		"2_e","+_e","3_e","=_e","5_e",
		"2","+","4","=","6",
		"2_e","+_e","4_e","=_e","6_e"
	};
	public final static String[] CourseData1_3 = {
		"1","+","7","=","8",
		"1_e","+_e","7_e","=_e","8_e",
		"1","+","8","=","9",
		"1_e","+_e","8_e","=_e","9_e",
		"1","+","9","=","10",
		"1_e","+_e","9_e","=_e","10_e",
		Const.COURSE_BREAK,
		"2","+","2","=","4",
		"2_e","+_e","2_e","=_e","4_e",
		"2","+","3","=","5",
		"2_e","+_e","3_e","=_e","5_e",
		"2","+","4","=","6",
		"2_e","+_e","4_e","=_e","6_e",
		Const.COURSE_BREAK,
		"2","+","5","=","7",
		"2_e","+_e","5_e","=_e","7_e",
		"2","+","6","=","8",
		"2_e","+_e","6_e","=_e","8_e",
		"2","+","7","=","9",
		"2_e","+_e","7_e","=_e","9_e"
	};
	
	public final static String[] CourseData2_1 = { 
		"2","+","2","=","4",
		"2_e","+_e","2_e","=_e","4_e",
		"2","+","3","=","5",
		"2_e","+_e","3_e","=_e","5_e",
		"2","+","4","=","6",
		"2_e","+_e","4_e","=_e","6_e",
		Const.COURSE_BREAK,
		"2","+","5","=","7",
		"2_e","+_e","5_e","=_e","7_e",
		"2","+","6","=","8",
		"2_e","+_e","6_e","=_e","8_e",
		"2","+","7","=","9",
		"2_e","+_e","7_e","=_e","9_e",
		Const.COURSE_BREAK,
		"2","+","8","=","10",
		"2_e","+_e","8_e","=_e","10_e",
		"3","+","3","=","6",
		"3_e","+_e","3_e","=_e","6_e",
		"3","+","4","=","7",
		"3_e","+_e","4_e","=_e","7_e"
	};
	public final static String[] CourseData2_2 = { 
		"2","+","5","=","7",
		"2_e","+_e","5_e","=_e","7_e",
		"2","+","6","=","8",
		"2_e","+_e","6_e","=_e","8_e",
		"2","+","7","=","9",
		"2_e","+_e","7_e","=_e","9_e",
		Const.COURSE_BREAK,
		"2","+","8","=","10",
		"2_e","+_e","8_e","=_e","10_e",
		"3","+","3","=","6",
		"3_e","+_e","3_e","=_e","6_e",
		"3","+","4","=","7",
		"3_e","+_e","4_e","=_e","7_e",
		Const.COURSE_BREAK,
		"3","+","5","=","8",
		"3_e","+_e","5_e","=_e","8_e",
		"3","+","6","=","9",
		"3_e","+_e","6_e","=_e","9_e",
		"3","+","7","=","10",
		"3_e","+_e","7_e","=_e","10_e"
	};
	public final static String[] CourseData2_3 = { 
		"2","+","8","=","10",
		"2_e","+_e","8_e","=_e","10_e",
		"3","+","3","=","6",
		"3_e","+_e","3_e","=_e","6_e",
		"3","+","4","=","7",
		"3_e","+_e","4_e","=_e","7_e",
		Const.COURSE_BREAK,
		"3","+","5","=","8",
		"3_e","+_e","5_e","=_e","8_e",
		"3","+","6","=","9",
		"3_e","+_e","6_e","=_e","9_e",
		"3","+","7","=","10",
		"3_e","+_e","7_e","=_e","10_e",
		Const.COURSE_BREAK,
		"4","+","4","=","8",
		"4_e","+_e","4_e","=_e","8_e",
		"4","+","5","=","9",
		"4_e","+_e","5_e","=_e","9_e",
		"4","+","6","=","10",
		"4_e","+_e","6_e","=_e","10_e"
	};
	
	public final static String[] CourseData3_1 = { 
		"3","+","5","=","8",
		"3_e","+_e","5_e","=_e","8_e",
		"3","+","6","=","9",
		"3_e","+_e","6_e","=_e","9_e",
		"3","+","7","=","10",
		"3_e","+_e","7_e","=_e","10_e",
		Const.COURSE_BREAK,
		"4","+","4","=","8",
		"4_e","+_e","4_e","=_e","8_e",
		"4","+","5","=","9",
		"4_e","+_e","5_e","=_e","9_e",
		"4","+","6","=","10",
		"4_e","+_e","6_e","=_e","10_e",
		Const.COURSE_BREAK,
		"5","+","5","=","10",
		"5_e","+_e","5_e","=_e","10_e",
		"10","+","10","=","20",
		"10_e","+_e","10_e","=_e","20_e",
		"2","+","18","=","20",
		"2_e","+_e","18_e","=_e","20_e"
	};
	public final static String[] CourseData3_2 = { 
		"4","+","4","=","8",
		"4_e","+_e","4_e","=_e","8_e",
		"4","+","5","=","9",
		"4_e","+_e","5_e","=_e","9_e",
		"4","+","6","=","10",
		"4_e","+_e","6_e","=_e","10_e",
		Const.COURSE_BREAK,
		"5","+","5","=","10",
		"5_e","+_e","5_e","=_e","10_e",
		"10","+","10","=","20",
		"10_e","+_e","10_e","=_e","20_e",
		"2","+","18","=","20",
		"2_e","+_e","18_e","=_e","20_e",
		Const.COURSE_BREAK,
		"1","+","10","=","11",
		"1_e","+_e","10_e","=_e","11_e",
		"2","+","9","=","11",
		"2_e","+_e","9_e","=_e","11_e",
		"3","+","8","=","11",
		"3_e","+_e","8_e","=_e","11_e"
	};
	public final static String[] CourseData3_3 = { 
		"5","+","5","=","10",
		"5_e","+_e","5_e","=_e","10_e",
		"10","+","10","=","20",
		"10_e","+_e","10_e","=_e","20_e",
		"2","+","18","=","20",
		"2_e","+_e","18_e","=_e","20_e",
		Const.COURSE_BREAK,
		"1","+","10","=","11",
		"1_e","+_e","10_e","=_e","11_e",
		"2","+","9","=","11",
		"2_e","+_e","9_e","=_e","11_e",
		"3","+","8","=","11",
		"3_e","+_e","8_e","=_e","11_e",
		Const.COURSE_BREAK,
		"4","+","7","=","11",
		"4_e","+_e","7_e","=_e","11_e",
		"5","+","6","=","11",
		"5_e","+_e","6_e","=_e","11_e",
		"6","+","6","=","12",
		"6_e","+_e","6_e","=_e","12_e"
	};
	
	public final static String[] CourseData4_1 = { 
		"1","+","10","=","11",
		"1_e","+_e","10_e","=_e","11_e",
		"2","+","9","=","11",
		"2_e","+_e","9_e","=_e","11_e",
		"3","+","8","=","11",
		"3_e","+_e","8_e","=_e","11_e",
		Const.COURSE_BREAK,
		"4","+","7","=","11",
		"4_e","+_e","7_e","=_e","11_e",
		"5","+","6","=","11",
		"5_e","+_e","6_e","=_e","11_e",
		"6","+","6","=","12",
		"6_e","+_e","6_e","=_e","12_e",
		Const.COURSE_BREAK,
		"5","+","7","=","12",
		"5_e","+_e","7_e","=_e","12_e",
		"4","+","8","=","12",
		"4_e","+_e","8_e","=_e","12_e",
		"3","+","9","=","12",
		"3_e","+_e","9_e","=_e","12_e"
	};
	public final static String[] CourseData4_2 = { 
		"4","+","7","=","11",
		"4_e","+_e","7_e","=_e","11_e",
		"5","+","6","=","11",
		"5_e","+_e","6_e","=_e","11_e",
		"6","+","6","=","12",
		"6_e","+_e","6_e","=_e","12_e",
		Const.COURSE_BREAK,
		"5","+","7","=","12",
		"5_e","+_e","7_e","=_e","12_e",
		"4","+","8","=","12",
		"4_e","+_e","8_e","=_e","12_e",
		"3","+","9","=","12",
		"3_e","+_e","9_e","=_e","12_e",
		Const.COURSE_BREAK,
		"2","+","10","=","12",
		"2_e","+_e","10_e","=_e","12_e",
		"1","+","11","=","12",
		"1_e","+_e","11_e","=_e","12_e",
		"6","+","7","=","13",
		"6_e","+_e","7_e","=_e","13_e"
	};
	public final static String[] CourseData4_3 = { 
		"5","+","7","=","12",
		"5_e","+_e","7_e","=_e","12_e",
		"4","+","8","=","12",
		"4_e","+_e","8_e","=_e","12_e",
		"3","+","9","=","12",
		"3_e","+_e","9_e","=_e","12_e",
		Const.COURSE_BREAK,
		"2","+","10","=","12",
		"2_e","+_e","10_e","=_e","12_e",
		"1","+","11","=","12",
		"1_e","+_e","11_e","=_e","12_e",
		"6","+","7","=","13",
		"6_e","+_e","7_e","=_e","13_e",
		Const.COURSE_BREAK,
		"5","+","8","=","13",
		"5_e","+_e","8_e","=_e","13_e",
		"4","+","9","=","13",
		"4_e","+_e","9_e","=_e","13_e",
		"3","+","10","=","13",
		"3_e","+_e","10_e","=_e","13_e"
	};
	
	public final static String[] CourseData5_1 = { 
		"2","+","10","=","12",
		"2_e","+_e","10_e","=_e","12_e",
		"1","+","11","=","12",
		"1_e","+_e","11_e","=_e","12_e",
		"6","+","7","=","13",
		"6_e","+_e","7_e","=_e","13_e",
		Const.COURSE_BREAK,
		"5","+","8","=","13",
		"5_e","+_e","8_e","=_e","13_e",
		"4","+","9","=","13",
		"4_e","+_e","9_e","=_e","13_e",
		"3","+","10","=","13",
		"3_e","+_e","10_e","=_e","13_e",
		Const.COURSE_BREAK,
		"2","+","11","=","13",
		"2_e","+_e","11_e","=_e","13_e",
		"1","+","12","=","13",
		"1_e","+_e","12_e","=_e","13_e",
		"7","+","7","=","14",
		"7_e","+_e","7_e","=_e","14_e"
	};
	public final static String[] CourseData5_2 = { 
		"5","+","8","=","13",
		"5_e","+_e","8_e","=_e","13_e",
		"4","+","9","=","13",
		"4_e","+_e","9_e","=_e","13_e",
		"3","+","10","=","13",
		"3_e","+_e","10_e","=_e","13_e",
		Const.COURSE_BREAK,
		"2","+","11","=","13",
		"2_e","+_e","11_e","=_e","13_e",
		"1","+","12","=","13",
		"1_e","+_e","12_e","=_e","13_e",
		"7","+","7","=","14",
		"7_e","+_e","7_e","=_e","14_e",
		Const.COURSE_BREAK,
		"6","+","8","=","14",
		"6_e","+_e","8_e","=_e","14_e",
		"5","+","9","=","14",
		"5_e","+_e","9_e","=_e","14_e",
		"4","+","10","=","14",
		"4_e","+_e","10_e","=_e","14_e"
	};
	public final static String[] CourseData5_3 = { 
		"2","+","11","=","13",
		"2_e","+_e","11_e","=_e","13_e",
		"1","+","12","=","13",
		"1_e","+_e","12_e","=_e","13_e",
		"7","+","7","=","14",
		"7_e","+_e","7_e","=_e","14_e",
		Const.COURSE_BREAK,
		"6","+","8","=","14",
		"6_e","+_e","8_e","=_e","14_e",
		"5","+","9","=","14",
		"5_e","+_e","9_e","=_e","14_e",
		"4","+","10","=","14",
		"4_e","+_e","10_e","=_e","14_e",
		Const.COURSE_BREAK,
		"3","+","11","=","14",
		"3_e","+_e","11_e","=_e","14_e",
		"2","+","12","=","14",
		"2_e","+_e","12_e","=_e","14_e",
		"1","+","13","=","14",
		"1_e","+_e","13_e","=_e","14_e"
	};
	
	public final static String[] CourseData6_1 = { 
		"6","+","8","=","14",
		"6_e","+_e","8_e","=_e","14_e",
		"5","+","9","=","14",
		"5_e","+_e","9_e","=_e","14_e",
		"4","+","10","=","14",
		"4_e","+_e","10_e","=_e","14_e",
		Const.COURSE_BREAK,
		"3","+","11","=","14",
		"3_e","+_e","11_e","=_e","14_e",
		"2","+","12","=","14",
		"2_e","+_e","12_e","=_e","14_e",
		"1","+","13","=","14",
		"1_e","+_e","13_e","=_e","14_e",
		Const.COURSE_BREAK,
		"7","+","8","=","15",
		"7_e","+_e","8_e","=_e","15_e",
		"6","+","9","=","15",
		"6_e","+_e","9_e","=_e","15_e",
		"5","+","10","=","15",
		"5_e","+_e","10_e","=_e","15_e"
	};
	public final static String[] CourseData6_2 = { 
		"3","+","11","=","14",
		"3_e","+_e","11_e","=_e","14_e",
		"2","+","12","=","14",
		"2_e","+_e","12_e","=_e","14_e",
		"1","+","13","=","14",
		"1_e","+_e","13_e","=_e","14_e",
		Const.COURSE_BREAK,
		"7","+","8","=","15",
		"7_e","+_e","8_e","=_e","15_e",
		"6","+","9","=","15",
		"6_e","+_e","9_e","=_e","15_e",
		"5","+","10","=","15",
		"5_e","+_e","10_e","=_e","15_e",
		Const.COURSE_BREAK,
		"4","+","11","=","15",
		"4_e","+_e","11_e","=_e","15_e",
		"3","+","12","=","15",
		"3_e","+_e","12_e","=_e","15_e",
		"2","+","11","=","15",
		"2_e","+_e","11_e","=_e","15_e"
	};
	public final static String[] CourseData6_3 = { 
		"7","+","8","=","15",
		"7_e","+_e","8_e","=_e","15_e",
		"6","+","9","=","15",
		"6_e","+_e","9_e","=_e","15_e",
		"5","+","10","=","15",
		"5_e","+_e","10_e","=_e","15_e",
		Const.COURSE_BREAK,
		"4","+","11","=","15",
		"4_e","+_e","11_e","=_e","15_e",
		"3","+","12","=","15",
		"3_e","+_e","12_e","=_e","15_e",
		"2","+","11","=","15",
		"2_e","+_e","11_e","=_e","15_e",
		Const.COURSE_BREAK,
		"1","+","14","=","15",
		"1_e","+_e","14_e","=_e","15_e",
		"8","+","8","=","16",
		"8_e","+_e","8_e","=_e","16_e",
		"7","+","9","=","16",
		"7_e","+_e","9_e","=_e","16_e"
	};
	
	public final static String[] CourseData7_1 = { 
		"4","+","11","=","15",
		"4_e","+_e","11_e","=_e","15_e",
		"3","+","12","=","15",
		"3_e","+_e","12_e","=_e","15_e",
		"2","+","11","=","15",
		"2_e","+_e","11_e","=_e","15_e",
		Const.COURSE_BREAK,
		"1","+","14","=","15",
		"1_e","+_e","14_e","=_e","15_e",
		"8","+","8","=","16",
		"8_e","+_e","8_e","=_e","16_e",
		"7","+","9","=","16",
		"7_e","+_e","9_e","=_e","16_e",
		Const.COURSE_BREAK,
		"6","+","10","=","16",
		"6_e","+_e","10_e","=_e","16_e",
		"5","+","11","=","16",
		"5_e","+_e","11_e","=_e","16_e",
		"4","+","12","=","16",
		"4_e","+_e","12_e","=_e","16_e"
	};
	public final static String[] CourseData7_2 = { 
		"1","+","14","=","15",
		"1_e","+_e","14_e","=_e","15_e",
		"8","+","8","=","16",
		"8_e","+_e","8_e","=_e","16_e",
		"7","+","9","=","16",
		"7_e","+_e","9_e","=_e","16_e",
		Const.COURSE_BREAK,
		"6","+","10","=","16",
		"6_e","+_e","10_e","=_e","16_e",
		"5","+","11","=","16",
		"5_e","+_e","11_e","=_e","16_e",
		"4","+","12","=","16",
		"4_e","+_e","12_e","=_e","16_e",
		Const.COURSE_BREAK,
		"3","+","13","=","16",
		"3_e","+_e","13_e","=_e","16_e",
		"2","+","14","=","16",
		"2_e","+_e","14_e","=_e","16_e",
		"1","+","15","=","16",
		"1_e","+_e","15_e","=_e","16_e"
	};
	public final static String[] CourseData7_3 = { 
		"6","+","10","=","16",
		"6_e","+_e","10_e","=_e","16_e",
		"5","+","11","=","16",
		"5_e","+_e","11_e","=_e","16_e",
		"4","+","12","=","16",
		"4_e","+_e","12_e","=_e","16_e",
		Const.COURSE_BREAK,
		"3","+","13","=","16",
		"3_e","+_e","13_e","=_e","16_e",
		"2","+","14","=","16",
		"2_e","+_e","14_e","=_e","16_e",
		"1","+","15","=","16",
		"1_e","+_e","15_e","=_e","16_e",
		Const.COURSE_BREAK,
		"8","+","9","=","17",
		"8_e","+_e","9_e","=_e","17_e",
		"7","+","10","=","17",
		"7_e","+_e","10_e","=_e","17_e",
		"6","+","11","=","17",
		"6_e","+_e","11_e","=_e","17_e"
	};
	
	public final static String[] CourseData8_1 = { 
		"3","+","13","=","16",
		"3_e","+_e","13_e","=_e","16_e",
		"2","+","14","=","16",
		"2_e","+_e","14_e","=_e","16_e",
		"1","+","15","=","16",
		"1_e","+_e","15_e","=_e","16_e",
		Const.COURSE_BREAK,
		"8","+","9","=","17",
		"8_e","+_e","9_e","=_e","17_e",
		"7","+","10","=","17",
		"7_e","+_e","10_e","=_e","17_e",
		"6","+","11","=","17",
		"6_e","+_e","11_e","=_e","17_e",
		Const.COURSE_BREAK,
		"5","+","12","=","17",
		"5_e","+_e","12_e","=_e","17_e",
		"4","+","13","=","17",
		"4_e","+_e","13_e","=_e","17_e",
		"3","+","14","=","17",
		"3_e","+_e","14_e","=_e","17_e"
	};
	public final static String[] CourseData8_2 = { 
		"8","+","9","=","17",
		"8_e","+_e","9_e","=_e","17_e",
		"7","+","10","=","17",
		"7_e","+_e","10_e","=_e","17_e",
		"6","+","11","=","17",
		"6_e","+_e","11_e","=_e","17_e",
		Const.COURSE_BREAK,
		"5","+","12","=","17",
		"5_e","+_e","12_e","=_e","17_e",
		"4","+","13","=","17",
		"4_e","+_e","13_e","=_e","17_e",
		"3","+","14","=","17",
		"3_e","+_e","14_e","=_e","17_e",
		Const.COURSE_BREAK,
		"2","+","15","=","17",
		"2_e","+_e","15_e","=_e","17_e",
		"1","+","16","=","17",
		"1_e","+_e","16_e","=_e","17_e",
		"9","+","9","=","18",
		"9_e","+_e","9_e","=_e","18_e"
	};
	public final static String[] CourseData8_3 = { 
		"5","+","12","=","17",
		"5_e","+_e","12_e","=_e","17_e",
		"4","+","13","=","17",
		"4_e","+_e","13_e","=_e","17_e",
		"3","+","14","=","17",
		"3_e","+_e","14_e","=_e","17_e",
		Const.COURSE_BREAK,
		"2","+","15","=","17",
		"2_e","+_e","15_e","=_e","17_e",
		"1","+","16","=","17",
		"1_e","+_e","16_e","=_e","17_e",
		"9","+","9","=","18",
		"9_e","+_e","9_e","=_e","18_e",
		Const.COURSE_BREAK,
		"8","+","10","=","18",
		"8_e","+_e","10_e","=_e","18_e",
		"7","+","11","=","18",
		"7_e","+_e","11_e","=_e","18_e",
		"6","+","12","=","18",
		"6_e","+_e","12_e","=_e","18_e"
	};
	
	public final static String[] CourseData9_1 = { 
		"2","+","15","=","17",
		"2_e","+_e","15_e","=_e","17_e",
		"1","+","16","=","17",
		"1_e","+_e","16_e","=_e","17_e",
		"9","+","9","=","18",
		"9_e","+_e","9_e","=_e","18_e",
		Const.COURSE_BREAK,
		"8","+","10","=","18",
		"8_e","+_e","10_e","=_e","18_e",
		"7","+","11","=","18",
		"7_e","+_e","11_e","=_e","18_e",
		"6","+","12","=","18",
		"6_e","+_e","12_e","=_e","18_e",
		Const.COURSE_BREAK,
		"5","+","13","=","18",
		"5_e","+_e","13_e","=_e","18_e",
		"4","+","14","=","18",
		"4_e","+_e","14_e","=_e","18_e",
		"3","+","15","=","18",
		"3_e","+_e","15_e","=_e","18_e"
	};
	public final static String[] CourseData9_2 = {
		"8","+","10","=","18",
		"8_e","+_e","10_e","=_e","18_e",
		"7","+","11","=","18",
		"7_e","+_e","11_e","=_e","18_e",
		"6","+","12","=","18",
		"6_e","+_e","12_e","=_e","18_e",
		Const.COURSE_BREAK,
		"5","+","13","=","18",
		"5_e","+_e","13_e","=_e","18_e",
		"4","+","14","=","18",
		"4_e","+_e","14_e","=_e","18_e",
		"3","+","15","=","18",
		"3_e","+_e","15_e","=_e","18_e",
		Const.COURSE_BREAK,
		"2","+","16","=","18",
		"2_e","+_e","16_e","=_e","18_e",
		"1","+","17","=","18",
		"1_e","+_e","17_e","=_e","18_e",
		"9","+","10","=","19",
		"9_e","+_e","10_e","=_e","19_e"
	};
	public final static String[] CourseData9_3 = {
		"5","+","13","=","18",
		"5_e","+_e","13_e","=_e","18_e",
		"4","+","14","=","18",
		"4_e","+_e","14_e","=_e","18_e",
		"3","+","15","=","18",
		"3_e","+_e","15_e","=_e","18_e",
		Const.COURSE_BREAK,
		"2","+","16","=","18",
		"2_e","+_e","16_e","=_e","18_e",
		"1","+","17","=","18",
		"1_e","+_e","17_e","=_e","18_e",
		"9","+","10","=","19",
		"9_e","+_e","10_e","=_e","19_e",
		Const.COURSE_BREAK,
		"8","+","11","=","19",
		"8_e","+_e","11_e","=_e","19_e",
		"7","+","12","=","19",
		"7_e","+_e","12_e","=_e","19_e",
		"6","+","13","=","19",
		"6_e","+_e","13_e","=_e","19_e"
	};
	
	public final static String[] CourseData10_1 = { 
		"2","+","16","=","18",
		"2_e","+_e","16_e","=_e","18_e",
		"1","+","17","=","18",
		"1_e","+_e","17_e","=_e","18_e",
		"9","+","10","=","19",
		"9_e","+_e","10_e","=_e","19_e",
		Const.COURSE_BREAK,
		"8","+","11","=","19",
		"8_e","+_e","11_e","=_e","19_e",
		"7","+","12","=","19",
		"7_e","+_e","12_e","=_e","19_e",
		"6","+","13","=","19",
		"6_e","+_e","13_e","=_e","19_e",
		Const.COURSE_BREAK,
		"5","+","14","=","19",
		"5_e","+_e","14_e","=_e","19_e",
		"4","+","15","=","19",
		"4_e","+_e","15_e","=_e","19_e",
		"3","+","16","=","19",
		"3_e","+_e","16_e","=_e","19_e"
	};
	public final static String[] CourseData10_2 = { 
		"8","+","11","=","19",
		"8_e","+_e","11_e","=_e","19_e",
		"7","+","12","=","19",
		"7_e","+_e","12_e","=_e","19_e",
		"6","+","13","=","19",
		"6_e","+_e","13_e","=_e","19_e",
		Const.COURSE_BREAK,
		"5","+","14","=","19",
		"5_e","+_e","14_e","=_e","19_e",
		"4","+","15","=","19",
		"4_e","+_e","15_e","=_e","19_e",
		"3","+","16","=","19",
		"3_e","+_e","16_e","=_e","19_e",
		Const.COURSE_BREAK,
		"2","+","17","=","19",
		"2_e","+_e","17_e","=_e","19_e",
		"1","+","18","=","19",
		"1_e","+_e","18_e","=_e","19_e",
		"9","+","11","=","20",
		"9_e","+_e","11_e","=_e","20_e"
	};
	public final static String[] CourseData10_3 = { 
		"5","+","14","=","19",
		"5_e","+_e","14_e","=_e","19_e",
		"4","+","15","=","19",
		"4_e","+_e","15_e","=_e","19_e",
		"3","+","16","=","19",
		"3_e","+_e","16_e","=_e","19_e",
		Const.COURSE_BREAK,
		"2","+","17","=","19",
		"2_e","+_e","17_e","=_e","19_e",
		"1","+","18","=","19",
		"1_e","+_e","18_e","=_e","19_e",
		"9","+","11","=","20",
		"9_e","+_e","11_e","=_e","20_e",
		Const.COURSE_BREAK,
		"8","+","12","=","20",
		"8_e","+_e","12_e","=_e","20_e",
		"7","+","13","=","20",
		"7_e","+_e","13_e","=_e","20_e",
		"6","+","14","=","20",
		"6_e","+_e","14_e","=_e","20_e"
	};
	
	public final static String[] CourseData11_1 = { 
		"2","+","17","=","19",
		"2_e","+_e","17_e","=_e","19_e",
		"1","+","18","=","19",
		"1_e","+_e","18_e","=_e","19_e",
		"9","+","11","=","20",
		"9_e","+_e","11_e","=_e","20_e",
		Const.COURSE_BREAK,
		"8","+","12","=","20",
		"8_e","+_e","12_e","=_e","20_e",
		"7","+","13","=","20",
		"7_e","+_e","13_e","=_e","20_e",
		"6","+","14","=","20",
		"6_e","+_e","14_e","=_e","20_e",
		Const.COURSE_BREAK,
		"5","+","15","=","20",
		"5_e","+_e","15_e","=_e","20_e",
		"4","+","16","=","20",
		"4_e","+_e","16_e","=_e","20_e",
		"3","+","17","=","20",
		"3_e","+_e","17_e","=_e","20_e"
	};
	public final static String[] CourseData11_2 = { 
		"8","+","12","=","20",
		"8_e","+_e","12_e","=_e","20_e",
		"7","+","13","=","20",
		"7_e","+_e","13_e","=_e","20_e",
		"6","+","14","=","20",
		"6_e","+_e","14_e","=_e","20_e",
		Const.COURSE_BREAK,
		"5","+","15","=","20",
		"5_e","+_e","15_e","=_e","20_e",
		"4","+","16","=","20",
		"4_e","+_e","16_e","=_e","20_e",
		"3","+","17","=","20",
		"3_e","+_e","17_e","=_e","20_e",
		Const.COURSE_BREAK,
		"1","+","19","=","20",
		"1_e","+_e","19_e","=_e","20_e",
		"10","+","11","=","21",
		"10_e","+_e","11_e","=_e","21_e",
		"9","+","12","=","21",
		"9_e","+_e","12_e","=_e","21_e"
	};
	public final static String[] CourseData11_3 = { 
		"5","+","15","=","20",
		"5_e","+_e","15_e","=_e","20_e",
		"4","+","16","=","20",
		"4_e","+_e","16_e","=_e","20_e",
		"3","+","17","=","20",
		"3_e","+_e","17_e","=_e","20_e",
		Const.COURSE_BREAK,
		"1","+","19","=","20",
		"1_e","+_e","19_e","=_e","20_e",
		"10","+","11","=","21",
		"10_e","+_e","11_e","=_e","21_e",
		"9","+","12","=","21",
		"9_e","+_e","12_e","=_e","21_e",
		Const.COURSE_BREAK,
		"8","+","13","=","21",
		"8_e","+_e","13_e","=_e","21_e",
		"7","+","14","=","21",
		"7_e","+_e","14_e","=_e","21_e",
		"6","+","15","=","21",
		"6_e","+_e","15_e","=_e","21_e"
	};
	
	public final static String[] CourseData12_1 = { 
		"1","+","19","=","20",
		"1_e","+_e","19_e","=_e","20_e",
		"10","+","11","=","21",
		"10_e","+_e","11_e","=_e","21_e",
		"9","+","12","=","21",
		"9_e","+_e","12_e","=_e","21_e",
		Const.COURSE_BREAK,
		"8","+","13","=","21",
		"8_e","+_e","13_e","=_e","21_e",
		"7","+","14","=","21",
		"7_e","+_e","14_e","=_e","21_e",
		"6","+","15","=","21",
		"6_e","+_e","15_e","=_e","21_e",
		Const.COURSE_BREAK,
		"5","+","16","=","21",
		"5_e","+_e","16_e","=_e","21_e",
		"4","+","17","=","21",
		"4_e","+_e","17_e","=_e","21_e",
		"3","+","18","=","21",
		"3_e","+_e","18_e","=_e","21_e"
	};
	public final static String[] CourseData12_2 = { 
		"8","+","13","=","21",
		"8_e","+_e","13_e","=_e","21_e",
		"7","+","14","=","21",
		"7_e","+_e","14_e","=_e","21_e",
		"6","+","15","=","21",
		"6_e","+_e","15_e","=_e","21_e",
		Const.COURSE_BREAK,
		"5","+","16","=","21",
		"5_e","+_e","16_e","=_e","21_e",
		"4","+","17","=","21",
		"4_e","+_e","17_e","=_e","21_e",
		"3","+","18","=","21",
		"3_e","+_e","18_e","=_e","21_e",
		Const.COURSE_BREAK,
		"2","+","19","=","21",
		"2_e","+_e","19_e","=_e","21_e",
		"1","+","20","=","21",
		"1_e","+_e","20_e","=_e","21_e",
		"11","+","11","=","22",
		"11_e","+_e","11_e","=_e","22_e"
	};
	public final static String[] CourseData12_3 = { 
		"5","+","16","=","21",
		"5_e","+_e","16_e","=_e","21_e",
		"4","+","17","=","21",
		"4_e","+_e","17_e","=_e","21_e",
		"3","+","18","=","21",
		"3_e","+_e","18_e","=_e","21_e",
		Const.COURSE_BREAK,
		"2","+","19","=","21",
		"2_e","+_e","19_e","=_e","21_e",
		"1","+","20","=","21",
		"1_e","+_e","20_e","=_e","21_e",
		"11","+","11","=","22",
		"11_e","+_e","11_e","=_e","22_e",
		Const.COURSE_BREAK,
		"10","+","12","=","22",
		"10_e","+_e","12_e","=_e","22_e",
		"9","+","13","=","22",
		"9_e","+_e","13_e","=_e","22_e",
		"8","+","14","=","22",
		"8_e","+_e","14_e","=_e","22_e"
	};
	public final static String[] CourseData13_1 = { 
		"2","+","19","=","21",
		"2_e","+_e","19_e","=_e","21_e",
		"1","+","20","=","21",
		"1_e","+_e","20_e","=_e","21_e",
		"11","+","11","=","22",
		"11_e","+_e","11_e","=_e","22_e",
		Const.COURSE_BREAK,
		"10","+","12","=","22",
		"10_e","+_e","12_e","=_e","22_e",
		"9","+","13","=","22",
		"9_e","+_e","13_e","=_e","22_e",
		"8","+","14","=","22",
		"8_e","+_e","14_e","=_e","22_e",
		Const.COURSE_BREAK,
		"7","+","15","=","22",
		"7_e","+_e","15_e","=_e","22_e",
		"6","+","15","=","22",
		"6_e","+_e","15_e","=_e","22_e",
		"5","+","17","=","22",
		"5_e","+_e","17_e","=_e","22_e"
	};
	public final static String[] CourseData13_2 = { 
		"10","+","12","=","22",
		"10_e","+_e","12_e","=_e","22_e",
		"9","+","13","=","22",
		"9_e","+_e","13_e","=_e","22_e",
		"8","+","14","=","22",
		"8_e","+_e","14_e","=_e","22_e",
		Const.COURSE_BREAK,
		"7","+","15","=","22",
		"7_e","+_e","15_e","=_e","22_e",
		"6","+","15","=","22",
		"6_e","+_e","15_e","=_e","22_e",
		"5","+","17","=","22",
		"5_e","+_e","17_e","=_e","22_e",
		Const.COURSE_BREAK,
		"4","+","18","=","22",
		"4_e","+_e","18_e","=_e","22_e",
		"3","+","19","=","22",
		"3_e","+_e","19_e","=_e","22_e",
		"2","+","20","=","22",
		"2_e","+_e","20_e","=_e","22_e"
	};
	public final static String[] CourseData13_3 = { 
		"7","+","15","=","22",
		"7_e","+_e","15_e","=_e","22_e",
		"6","+","15","=","22",
		"6_e","+_e","15_e","=_e","22_e",
		"5","+","17","=","22",
		"5_e","+_e","17_e","=_e","22_e",
		Const.COURSE_BREAK,
		"4","+","18","=","22",
		"4_e","+_e","18_e","=_e","22_e",
		"3","+","19","=","22",
		"3_e","+_e","19_e","=_e","22_e",
		"2","+","20","=","22",
		"2_e","+_e","20_e","=_e","22_e",
		Const.COURSE_BREAK,
		"1","+","21","=","22",
		"1_e","+_e","21_e","=_e","22_e",
		"11","+","12","=","23",
		"11_e","+_e","12_e","=_e","23_e",
		"10","+","13","=","23",
		"10_e","+_e","13_e","=_e","23_e"
	};
	
	public final static String[] CourseData14_1 = { 
		"4","+","18","=","22",
		"4_e","+_e","18_e","=_e","22_e",
		"3","+","19","=","22",
		"3_e","+_e","19_e","=_e","22_e",
		"2","+","20","=","22",
		"2_e","+_e","20_e","=_e","22_e",
		Const.COURSE_BREAK,
		"1","+","21","=","22",
		"1_e","+_e","21_e","=_e","22_e",
		"11","+","12","=","23",
		"11_e","+_e","12_e","=_e","23_e",
		"10","+","13","=","23",
		"10_e","+_e","13_e","=_e","23_e",
		Const.COURSE_BREAK,
		"9","+","14","=","23",
		"9_e","+_e","14_e","=_e","23_e",
		"8","+","15","=","23",
		"8_e","+_e","15_e","=_e","23_e",
		"7","+","16","=","23",
		"7_e","+_e","16_e","=_e","23_e"
	};
	public final static String[] CourseData14_2 = { 
		"1","+","21","=","22",
		"1_e","+_e","21_e","=_e","22_e",
		"11","+","12","=","23",
		"11_e","+_e","12_e","=_e","23_e",
		"10","+","13","=","23",
		"10_e","+_e","13_e","=_e","23_e",
		Const.COURSE_BREAK,
		"9","+","14","=","23",
		"9_e","+_e","14_e","=_e","23_e",
		"8","+","15","=","23",
		"8_e","+_e","15_e","=_e","23_e",
		"7","+","16","=","23",
		"7_e","+_e","16_e","=_e","23_e",
		Const.COURSE_BREAK,
		"1","+","1","=","2",
		"1_e","+_e","1_e","=_e","2_e",
		"1","+","2","=","3",
		"1_e","+_e","2_e","=_e","3_e",
		"1","+","3","=","4",
		"1_e","+_e","3_e","=_e","4_e"
	};
	public final static String[] CourseData14_3 = { 
		"9","+","14","=","23",
		"9_e","+_e","14_e","=_e","23_e",
		"8","+","15","=","23",
		"8_e","+_e","15_e","=_e","23_e",
		"7","+","16","=","23",
		"7_e","+_e","16_e","=_e","23_e",
		Const.COURSE_BREAK,
		"1","+","1","=","2",
		"1_e","+_e","1_e","=_e","2_e",
		"1","+","2","=","3",
		"1_e","+_e","2_e","=_e","3_e",
		"1","+","3","=","4",
		"1_e","+_e","3_e","=_e","4_e",
		Const.COURSE_BREAK,
		"1","+","4","=","5",
		"1_e","+_e","4_e","=_e","5_e",
		"1","+","5","=","6",
		"1_e","+_e","5_e","=_e","6_e",
		"1","+","6","=","7",
		"1_e","+_e","6_e","=_e","7_e"
	};
	
	public static final HashMap<String, Integer> mSoundMap = new HashMap<String, Integer>() {
		{
			/*
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
		put("23_e", R.raw.sound023_e);
		
		put("+_e", R.raw.plus_e);
		put("=_e", R.raw.equal_e);
		*/
		}
	};
	
	public static final HashMap<String, Integer> mImageMap = new HashMap<String, Integer>() {
		{
			/*
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
		
		put("+_e", R.drawable.blank);
		put("=_e", R.drawable.blank);
		*/
		}
	};
}
