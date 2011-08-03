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
			
			mProgresses.add(new Progress(R.drawable.day01).addCourse(c1_1).addCourse(c1_2).addCourse(c1_3));
			mProgresses.add(new Progress(R.drawable.day02).addCourse(c2_1).addCourse(c2_2).addCourse(c2_3));
			mProgresses.add(new Progress(R.drawable.day03).addCourse(c3_1).addCourse(c3_2).addCourse(c3_3));
			mProgresses.add(new Progress(R.drawable.day04).addCourse(c4_1).addCourse(c4_2).addCourse(c4_3));
			mProgresses.add(new Progress(R.drawable.day05).addCourse(c5_1).addCourse(c5_2).addCourse(c5_3));
			mProgresses.add(new Progress(R.drawable.day06).addCourse(c6_1).addCourse(c6_2).addCourse(c6_3));
			mProgresses.add(new Progress(R.drawable.day07).addCourse(c7_1).addCourse(c7_2).addCourse(c7_3));
			mProgresses.add(new Progress(R.drawable.day08).addCourse(c8_1).addCourse(c8_2).addCourse(c8_3));
			mProgresses.add(new Progress(R.drawable.day09).addCourse(c9_1).addCourse(c9_2).addCourse(c9_3));
		}
		
		return mProgresses;
	}
	
	public final static String[] CourseData1_1 = {
		"2", "x", "1", "=", "2", "2_e", "x_e", "1_e", "=_e", "2_e", 
		"2", "x", "2", "=", "4", "2_e", "x_e", "2_e", "=_e", "4_e", 
		"2", "x", "3", "=", "6", "2_e", "x_e", "3_e", "=_e", "6_e", 
		Const.COURSE_BREAK,
		"2", "x", "4", "=", "8", "2_e", "x_e", "4_e", "=_e", "8_e", 
		"2", "x", "5", "=", "10", "2_e", "x_e", "5_e", "=_e", "10_e", 
		"2", "x", "6", "=", "12", "2_e", "x_e", "6_e", "=_e", "12_e", 
		Const.COURSE_BREAK,
		"2", "x", "7", "=", "14", "2_e", "x_e", "7_e", "=_e", "14_e", 
		"2", "x", "8", "=", "16", "2_e", "x_e", "8_e", "=_e", "16_e", 
		"2", "x", "9", "=", "18", "2_e", "x_e", "9_e", "=_e", "18_e", 
		};
		public final static String[] CourseData1_2 = {
		"2", "x", "4", "=", "8", "2_e", "x_e", "4_e", "=_e", "8_e", 
		"2", "x", "5", "=", "10", "2_e", "x_e", "5_e", "=_e", "10_e", 
		"2", "x", "6", "=", "12", "2_e", "x_e", "6_e", "=_e", "12_e", 
		Const.COURSE_BREAK,
		"2", "x", "7", "=", "14", "2_e", "x_e", "7_e", "=_e", "14_e", 
		"2", "x", "8", "=", "16", "2_e", "x_e", "8_e", "=_e", "16_e", 
		"2", "x", "9", "=", "18", "2_e", "x_e", "9_e", "=_e", "18_e", 
		Const.COURSE_BREAK,
		"3", "x", "1", "=", "3", "3_e", "x_e", "1_e", "=_e", "3_e", 
		"3", "x", "2", "=", "6", "3_e", "x_e", "2_e", "=_e", "6_e", 
		"3", "x", "3", "=", "9", "3_e", "x_e", "3_e", "=_e", "9_e", 
		};
		public final static String[] CourseData1_3 = {
		"2", "x", "7", "=", "14", "2_e", "x_e", "7_e", "=_e", "14_e", 
		"2", "x", "8", "=", "16", "2_e", "x_e", "8_e", "=_e", "16_e", 
		"2", "x", "9", "=", "18", "2_e", "x_e", "9_e", "=_e", "18_e", 
		Const.COURSE_BREAK,
		"3", "x", "1", "=", "3", "3_e", "x_e", "1_e", "=_e", "3_e", 
		"3", "x", "2", "=", "6", "3_e", "x_e", "2_e", "=_e", "6_e", 
		"3", "x", "3", "=", "9", "3_e", "x_e", "3_e", "=_e", "9_e", 
		Const.COURSE_BREAK,
		"3", "x", "4", "=", "12", "3_e", "x_e", "4_e", "=_e", "12_e", 
		"3", "x", "5", "=", "15", "3_e", "x_e", "5_e", "=_e", "15_e", 
		"3", "x", "6", "=", "18", "3_e", "x_e", "6_e", "=_e", "18_e", 
		};
		public final static String[] CourseData2_1 = {
		"3", "x", "1", "=", "3", "3_e", "x_e", "1_e", "=_e", "3_e", 
		"3", "x", "2", "=", "6", "3_e", "x_e", "2_e", "=_e", "6_e", 
		"3", "x", "3", "=", "9", "3_e", "x_e", "3_e", "=_e", "9_e", 
		Const.COURSE_BREAK,
		"3", "x", "4", "=", "12", "3_e", "x_e", "4_e", "=_e", "12_e", 
		"3", "x", "5", "=", "15", "3_e", "x_e", "5_e", "=_e", "15_e", 
		"3", "x", "6", "=", "18", "3_e", "x_e", "6_e", "=_e", "18_e", 
		Const.COURSE_BREAK,
		"3", "x", "7", "=", "21", "3_e", "x_e", "7_e", "=_e", "21_e", 
		"3", "x", "8", "=", "24", "3_e", "x_e", "8_e", "=_e", "24_e", 
		"3", "x", "9", "=", "27", "3_e", "x_e", "9_e", "=_e", "27_e", 
		};
		public final static String[] CourseData2_2 = {
		"3", "x", "4", "=", "12", "3_e", "x_e", "4_e", "=_e", "12_e", 
		"3", "x", "5", "=", "15", "3_e", "x_e", "5_e", "=_e", "15_e", 
		"3", "x", "6", "=", "18", "3_e", "x_e", "6_e", "=_e", "18_e", 
		Const.COURSE_BREAK,
		"3", "x", "7", "=", "21", "3_e", "x_e", "7_e", "=_e", "21_e", 
		"3", "x", "8", "=", "24", "3_e", "x_e", "8_e", "=_e", "24_e", 
		"3", "x", "9", "=", "27", "3_e", "x_e", "9_e", "=_e", "27_e", 
		Const.COURSE_BREAK,
		"4", "x", "1", "=", "4", "4_e", "x_e", "1_e", "=_e", "4_e", 
		"4", "x", "2", "=", "8", "4_e", "x_e", "2_e", "=_e", "8_e", 
		"4", "x", "3", "=", "12", "4_e", "x_e", "3_e", "=_e", "12_e", 
		};
		public final static String[] CourseData2_3 = {
		"3", "x", "7", "=", "21", "3_e", "x_e", "7_e", "=_e", "21_e", 
		"3", "x", "8", "=", "24", "3_e", "x_e", "8_e", "=_e", "24_e", 
		"3", "x", "9", "=", "27", "3_e", "x_e", "9_e", "=_e", "27_e", 
		Const.COURSE_BREAK,
		"4", "x", "1", "=", "4", "4_e", "x_e", "1_e", "=_e", "4_e", 
		"4", "x", "2", "=", "8", "4_e", "x_e", "2_e", "=_e", "8_e", 
		"4", "x", "3", "=", "12", "4_e", "x_e", "3_e", "=_e", "12_e", 
		Const.COURSE_BREAK,
		"4", "x", "4", "=", "16", "4_e", "x_e", "4_e", "=_e", "16_e", 
		"4", "x", "5", "=", "20", "4_e", "x_e", "5_e", "=_e", "20_e", 
		"4", "x", "6", "=", "24", "4_e", "x_e", "6_e", "=_e", "24_e", 
		};
		public final static String[] CourseData3_1 = {
		"4", "x", "1", "=", "4", "4_e", "x_e", "1_e", "=_e", "4_e", 
		"4", "x", "2", "=", "8", "4_e", "x_e", "2_e", "=_e", "8_e", 
		"4", "x", "3", "=", "12", "4_e", "x_e", "3_e", "=_e", "12_e", 
		Const.COURSE_BREAK,
		"4", "x", "4", "=", "16", "4_e", "x_e", "4_e", "=_e", "16_e", 
		"4", "x", "5", "=", "20", "4_e", "x_e", "5_e", "=_e", "20_e", 
		"4", "x", "6", "=", "24", "4_e", "x_e", "6_e", "=_e", "24_e", 
		Const.COURSE_BREAK,
		"4", "x", "7", "=", "28", "4_e", "x_e", "7_e", "=_e", "28_e", 
		"4", "x", "8", "=", "32", "4_e", "x_e", "8_e", "=_e", "32_e", 
		"4", "x", "9", "=", "36", "4_e", "x_e", "9_e", "=_e", "36_e", 
		};
		public final static String[] CourseData3_2 = {
		"4", "x", "4", "=", "16", "4_e", "x_e", "4_e", "=_e", "16_e", 
		"4", "x", "5", "=", "20", "4_e", "x_e", "5_e", "=_e", "20_e", 
		"4", "x", "6", "=", "24", "4_e", "x_e", "6_e", "=_e", "24_e", 
		Const.COURSE_BREAK,
		"4", "x", "7", "=", "28", "4_e", "x_e", "7_e", "=_e", "28_e", 
		"4", "x", "8", "=", "32", "4_e", "x_e", "8_e", "=_e", "32_e", 
		"4", "x", "9", "=", "36", "4_e", "x_e", "9_e", "=_e", "36_e", 
		Const.COURSE_BREAK,
		"5", "x", "1", "=", "5", "5_e", "x_e", "1_e", "=_e", "5_e", 
		"6", "x", "1", "=", "6", "6_e", "x_e", "1_e", "=_e", "6_e", 
		"7", "x", "1", "=", "7", "7_e", "x_e", "1_e", "=_e", "7_e", 
		};
		public final static String[] CourseData3_3 = {
		"4", "x", "7", "=", "28", "4_e", "x_e", "7_e", "=_e", "28_e", 
		"4", "x", "8", "=", "32", "4_e", "x_e", "8_e", "=_e", "32_e", 
		"4", "x", "9", "=", "36", "4_e", "x_e", "9_e", "=_e", "36_e", 
		Const.COURSE_BREAK,
		"5", "x", "1", "=", "5", "5_e", "x_e", "1_e", "=_e", "5_e", 
		"6", "x", "1", "=", "6", "6_e", "x_e", "1_e", "=_e", "6_e", 
		"7", "x", "1", "=", "7", "7_e", "x_e", "1_e", "=_e", "7_e", 
		Const.COURSE_BREAK,
		"6", "x", "3", "=", "18", "6_e", "x_e", "3_e", "=_e", "18_e", 
		"5", "x", "5", "=", "25", "5_e", "x_e", "5_e", "=_e", "25_e", 
		"6", "x", "4", "=", "24", "6_e", "x_e", "4_e", "=_e", "24_e", 
		};
		public final static String[] CourseData4_1 = {
		"5", "x", "1", "=", "5", "5_e", "x_e", "1_e", "=_e", "5_e", 
		"6", "x", "1", "=", "6", "6_e", "x_e", "1_e", "=_e", "6_e", 
		"7", "x", "1", "=", "7", "7_e", "x_e", "1_e", "=_e", "7_e", 
		Const.COURSE_BREAK,
		"6", "x", "3", "=", "18", "6_e", "x_e", "3_e", "=_e", "18_e", 
		"5", "x", "5", "=", "25", "5_e", "x_e", "5_e", "=_e", "25_e", 
		"6", "x", "4", "=", "24", "6_e", "x_e", "4_e", "=_e", "24_e", 
		Const.COURSE_BREAK,
		"7", "x", "5", "=", "35", "7_e", "x_e", "5_e", "=_e", "35_e", 
		"5", "x", "7", "=", "35", "5_e", "x_e", "7_e", "=_e", "35_e", 
		"6", "x", "5", "=", "30", "6_e", "x_e", "5_e", "=_e", "30_e", 
		};
		public final static String[] CourseData4_2 = {
		"6", "x", "3", "=", "18", "6_e", "x_e", "3_e", "=_e", "18_e", 
		"5", "x", "5", "=", "25", "5_e", "x_e", "5_e", "=_e", "25_e", 
		"6", "x", "4", "=", "24", "6_e", "x_e", "4_e", "=_e", "24_e", 
		Const.COURSE_BREAK,
		"7", "x", "5", "=", "35", "7_e", "x_e", "5_e", "=_e", "35_e", 
		"5", "x", "7", "=", "35", "5_e", "x_e", "7_e", "=_e", "35_e", 
		"6", "x", "5", "=", "30", "6_e", "x_e", "5_e", "=_e", "30_e", 
		Const.COURSE_BREAK,
		"6", "x", "6", "=", "36", "6_e", "x_e", "6_e", "=_e", "36_e", 
		"5", "x", "2", "=", "10", "5_e", "x_e", "2_e", "=_e", "10_e", 
		"6", "x", "2", "=", "12", "6_e", "x_e", "2_e", "=_e", "12_e", 
		};
		public final static String[] CourseData4_3 = {
		"7", "x", "5", "=", "35", "7_e", "x_e", "5_e", "=_e", "35_e", 
		"5", "x", "7", "=", "35", "5_e", "x_e", "7_e", "=_e", "35_e", 
		"6", "x", "5", "=", "30", "6_e", "x_e", "5_e", "=_e", "30_e", 
		Const.COURSE_BREAK,
		"6", "x", "6", "=", "36", "6_e", "x_e", "6_e", "=_e", "36_e", 
		"5", "x", "2", "=", "10", "5_e", "x_e", "2_e", "=_e", "10_e", 
		"6", "x", "2", "=", "12", "6_e", "x_e", "2_e", "=_e", "12_e", 
		Const.COURSE_BREAK,
		"7", "x", "2", "=", "14", "7_e", "x_e", "2_e", "=_e", "14_e", 
		"6", "x", "7", "=", "42", "6_e", "x_e", "7_e", "=_e", "42_e", 
		"7", "x", "4", "=", "28", "7_e", "x_e", "4_e", "=_e", "28_e", 
		};
		public final static String[] CourseData5_1 = {
		"6", "x", "6", "=", "36", "6_e", "x_e", "6_e", "=_e", "36_e", 
		"5", "x", "2", "=", "10", "5_e", "x_e", "2_e", "=_e", "10_e", 
		"6", "x", "2", "=", "12", "6_e", "x_e", "2_e", "=_e", "12_e", 
		Const.COURSE_BREAK,
		"7", "x", "2", "=", "14", "7_e", "x_e", "2_e", "=_e", "14_e", 
		"6", "x", "7", "=", "42", "6_e", "x_e", "7_e", "=_e", "42_e", 
		"7", "x", "4", "=", "28", "7_e", "x_e", "4_e", "=_e", "28_e", 
		Const.COURSE_BREAK,
		"5", "x", "8", "=", "40", "5_e", "x_e", "8_e", "=_e", "40_e", 
		"7", "x", "6", "=", "42", "7_e", "x_e", "6_e", "=_e", "42_e", 
		"7", "x", "7", "=", "49", "7_e", "x_e", "7_e", "=_e", "49_e", 
		};
		public final static String[] CourseData5_2 = {
		"7", "x", "2", "=", "14", "7_e", "x_e", "2_e", "=_e", "14_e", 
		"6", "x", "7", "=", "42", "6_e", "x_e", "7_e", "=_e", "42_e", 
		"7", "x", "4", "=", "28", "7_e", "x_e", "4_e", "=_e", "28_e", 
		Const.COURSE_BREAK,
		"5", "x", "8", "=", "40", "5_e", "x_e", "8_e", "=_e", "40_e", 
		"7", "x", "6", "=", "42", "7_e", "x_e", "6_e", "=_e", "42_e", 
		"7", "x", "7", "=", "49", "7_e", "x_e", "7_e", "=_e", "49_e", 
		Const.COURSE_BREAK,
		"6", "x", "8", "=", "48", "6_e", "x_e", "8_e", "=_e", "48_e", 
		"8", "x", "1", "=", "8", "8_e", "x_e", "1_e", "=_e", "8_e", 
		"5", "x", "3", "=", "15", "5_e", "x_e", "3_e", "=_e", "15_e", 
		};
		public final static String[] CourseData5_3 = {
		"5", "x", "8", "=", "40", "5_e", "x_e", "8_e", "=_e", "40_e", 
		"7", "x", "6", "=", "42", "7_e", "x_e", "6_e", "=_e", "42_e", 
		"7", "x", "7", "=", "49", "7_e", "x_e", "7_e", "=_e", "49_e", 
		Const.COURSE_BREAK,
		"6", "x", "8", "=", "48", "6_e", "x_e", "8_e", "=_e", "48_e", 
		"8", "x", "1", "=", "8", "8_e", "x_e", "1_e", "=_e", "8_e", 
		"5", "x", "3", "=", "15", "5_e", "x_e", "3_e", "=_e", "15_e", 
		Const.COURSE_BREAK,
		"8", "x", "2", "=", "16", "8_e", "x_e", "2_e", "=_e", "16_e", 
		"7", "x", "3", "=", "21", "7_e", "x_e", "3_e", "=_e", "21_e", 
		"5", "x", "6", "=", "30", "5_e", "x_e", "6_e", "=_e", "30_e", 
		};
		public final static String[] CourseData6_1 = {
		"6", "x", "8", "=", "48", "6_e", "x_e", "8_e", "=_e", "48_e", 
		"8", "x", "1", "=", "8", "8_e", "x_e", "1_e", "=_e", "8_e", 
		"5", "x", "3", "=", "15", "5_e", "x_e", "3_e", "=_e", "15_e", 
		Const.COURSE_BREAK,
		"8", "x", "2", "=", "16", "8_e", "x_e", "2_e", "=_e", "16_e", 
		"7", "x", "3", "=", "21", "7_e", "x_e", "3_e", "=_e", "21_e", 
		"5", "x", "6", "=", "30", "5_e", "x_e", "6_e", "=_e", "30_e", 
		Const.COURSE_BREAK,
		"6", "x", "9", "=", "54", "6_e", "x_e", "9_e", "=_e", "54_e", 
		"8", "x", "3", "=", "24", "8_e", "x_e", "3_e", "=_e", "24_e", 
		"5", "x", "9", "=", "45", "5_e", "x_e", "9_e", "=_e", "45_e", 
		};
		public final static String[] CourseData6_2 = {
		"8", "x", "2", "=", "16", "8_e", "x_e", "2_e", "=_e", "16_e", 
		"7", "x", "3", "=", "21", "7_e", "x_e", "3_e", "=_e", "21_e", 
		"5", "x", "6", "=", "30", "5_e", "x_e", "6_e", "=_e", "30_e", 
		Const.COURSE_BREAK,
		"6", "x", "9", "=", "54", "6_e", "x_e", "9_e", "=_e", "54_e", 
		"8", "x", "3", "=", "24", "8_e", "x_e", "3_e", "=_e", "24_e", 
		"5", "x", "9", "=", "45", "5_e", "x_e", "9_e", "=_e", "45_e", 
		Const.COURSE_BREAK,
		"8", "x", "4", "=", "32", "8_e", "x_e", "4_e", "=_e", "32_e", 
		"9", "x", "1", "=", "9", "9_e", "x_e", "1_e", "=_e", "9_e", 
		"9", "x", "8", "=", "72", "9_e", "x_e", "8_e", "=_e", "72_e", 
		};
		public final static String[] CourseData6_3 = {
		"6", "x", "9", "=", "54", "6_e", "x_e", "9_e", "=_e", "54_e", 
		"8", "x", "3", "=", "24", "8_e", "x_e", "3_e", "=_e", "24_e", 
		"5", "x", "9", "=", "45", "5_e", "x_e", "9_e", "=_e", "45_e", 
		Const.COURSE_BREAK,
		"8", "x", "4", "=", "32", "8_e", "x_e", "4_e", "=_e", "32_e", 
		"9", "x", "1", "=", "9", "9_e", "x_e", "1_e", "=_e", "9_e", 
		"9", "x", "8", "=", "72", "9_e", "x_e", "8_e", "=_e", "72_e", 
		Const.COURSE_BREAK,
		"5", "x", "4", "=", "20", "5_e", "x_e", "4_e", "=_e", "20_e", 
		"8", "x", "5", "=", "40", "8_e", "x_e", "5_e", "=_e", "40_e", 
		"9", "x", "2", "=", "18", "9_e", "x_e", "2_e", "=_e", "18_e", 
		};
		public final static String[] CourseData7_1 = {
		"8", "x", "4", "=", "32", "8_e", "x_e", "4_e", "=_e", "32_e", 
		"9", "x", "1", "=", "9", "9_e", "x_e", "1_e", "=_e", "9_e", 
		"9", "x", "8", "=", "72", "9_e", "x_e", "8_e", "=_e", "72_e", 
		Const.COURSE_BREAK,
		"5", "x", "4", "=", "20", "5_e", "x_e", "4_e", "=_e", "20_e", 
		"8", "x", "5", "=", "40", "8_e", "x_e", "5_e", "=_e", "40_e", 
		"9", "x", "2", "=", "18", "9_e", "x_e", "2_e", "=_e", "18_e", 
		Const.COURSE_BREAK,
		"8", "x", "6", "=", "48", "8_e", "x_e", "6_e", "=_e", "48_e", 
		"9", "x", "3", "=", "27", "9_e", "x_e", "3_e", "=_e", "27_e", 
		"9", "x", "7", "=", "63", "9_e", "x_e", "7_e", "=_e", "63_e", 
		};
		public final static String[] CourseData7_2 = {
		"5", "x", "4", "=", "20", "5_e", "x_e", "4_e", "=_e", "20_e", 
		"8", "x", "5", "=", "40", "8_e", "x_e", "5_e", "=_e", "40_e", 
		"9", "x", "2", "=", "18", "9_e", "x_e", "2_e", "=_e", "18_e", 
		Const.COURSE_BREAK,
		"8", "x", "6", "=", "48", "8_e", "x_e", "6_e", "=_e", "48_e", 
		"9", "x", "3", "=", "27", "9_e", "x_e", "3_e", "=_e", "27_e", 
		"9", "x", "7", "=", "63", "9_e", "x_e", "7_e", "=_e", "63_e", 
		Const.COURSE_BREAK,
		"10", "x", "2", "=", "20", "10_e", "x_e", "2_e", "=_e", "20_e", 
		"9", "x", "4", "=", "36", "9_e", "x_e", "4_e", "=_e", "36_e", 
		"8", "x", "7", "=", "56", "8_e", "x_e", "7_e", "=_e", "56_e", 
		};
		public final static String[] CourseData7_3 = {
		"8", "x", "6", "=", "48", "8_e", "x_e", "6_e", "=_e", "48_e", 
		"9", "x", "3", "=", "27", "9_e", "x_e", "3_e", "=_e", "27_e", 
		"9", "x", "7", "=", "63", "9_e", "x_e", "7_e", "=_e", "63_e", 
		Const.COURSE_BREAK,
		"10", "x", "2", "=", "20", "10_e", "x_e", "2_e", "=_e", "20_e", 
		"9", "x", "4", "=", "36", "9_e", "x_e", "4_e", "=_e", "36_e", 
		"8", "x", "7", "=", "56", "8_e", "x_e", "7_e", "=_e", "56_e", 
		Const.COURSE_BREAK,
		"9", "x", "6", "=", "54", "9_e", "x_e", "6_e", "=_e", "54_e", 
		"8", "x", "8", "=", "64", "8_e", "x_e", "8_e", "=_e", "64_e", 
		"2", "x", "2", "=", "4", "2_e", "x_e", "2_e", "=_e", "4_e", 
		};
		public final static String[] CourseData8_1 = {
		"10", "x", "2", "=", "20", "10_e", "x_e", "2_e", "=_e", "20_e", 
		"9", "x", "4", "=", "36", "9_e", "x_e", "4_e", "=_e", "36_e", 
		"8", "x", "7", "=", "56", "8_e", "x_e", "7_e", "=_e", "56_e", 
		Const.COURSE_BREAK,
		"9", "x", "6", "=", "54", "9_e", "x_e", "6_e", "=_e", "54_e", 
		"8", "x", "8", "=", "64", "8_e", "x_e", "8_e", "=_e", "64_e", 
		"2", "x", "2", "=", "4", "2_e", "x_e", "2_e", "=_e", "4_e", 
		Const.COURSE_BREAK,
		"9", "x", "5", "=", "45", "9_e", "x_e", "5_e", "=_e", "45_e", 
		"8", "x", "9", "=", "72", "8_e", "x_e", "9_e", "=_e", "72_e", 
		"9", "x", "9", "=", "81", "9_e", "x_e", "9_e", "=_e", "81_e", 
		};
		public final static String[] CourseData8_2 = {
		"9", "x", "6", "=", "54", "9_e", "x_e", "6_e", "=_e", "54_e", 
		"8", "x", "8", "=", "64", "8_e", "x_e", "8_e", "=_e", "64_e", 
		"2", "x", "2", "=", "4", "2_e", "x_e", "2_e", "=_e", "4_e", 
		Const.COURSE_BREAK,
		"9", "x", "5", "=", "45", "9_e", "x_e", "5_e", "=_e", "45_e", 
		"8", "x", "9", "=", "72", "8_e", "x_e", "9_e", "=_e", "72_e", 
		"9", "x", "9", "=", "81", "9_e", "x_e", "9_e", "=_e", "81_e", 
		Const.COURSE_BREAK,
		"15", "x", "2", "=", "30", "15_e", "x_e", "2_e", "=_e", "30_e", 
		"20", "x", "1", "=", "20", "20_e", "x_e", "1_e", "=_e", "20_e", 
		"16", "x", "4", "=", "64", "16_e", "x_e", "4_e", "=_e", "64_e", 
		};
		public final static String[] CourseData8_3 = {
		"9", "x", "5", "=", "45", "9_e", "x_e", "5_e", "=_e", "45_e", 
		"8", "x", "9", "=", "72", "8_e", "x_e", "9_e", "=_e", "72_e", 
		"9", "x", "9", "=", "81", "9_e", "x_e", "9_e", "=_e", "81_e", 
		Const.COURSE_BREAK,
		"15", "x", "2", "=", "30", "15_e", "x_e", "2_e", "=_e", "30_e", 
		"20", "x", "1", "=", "20", "20_e", "x_e", "1_e", "=_e", "20_e", 
		"16", "x", "4", "=", "64", "16_e", "x_e", "4_e", "=_e", "64_e", 
		Const.COURSE_BREAK,
		"16", "x", "5", "=", "80", "16_e", "x_e", "5_e", "=_e", "80_e", 
		"12", "x", "6", "=", "72", "12_e", "x_e", "6_e", "=_e", "72_e", 
		"10", "x", "8", "=", "80", "10_e", "x_e", "8_e", "=_e", "80_e", 
		};
		public final static String[] CourseData9_1 = {
		"15", "x", "2", "=", "30", "15_e", "x_e", "2_e", "=_e", "30_e", 
		"20", "x", "1", "=", "20", "20_e", "x_e", "1_e", "=_e", "20_e", 
		"16", "x", "4", "=", "64", "16_e", "x_e", "4_e", "=_e", "64_e", 
		Const.COURSE_BREAK,
		"16", "x", "5", "=", "80", "16_e", "x_e", "5_e", "=_e", "80_e", 
		"12", "x", "6", "=", "72", "12_e", "x_e", "6_e", "=_e", "72_e", 
		"10", "x", "8", "=", "80", "10_e", "x_e", "8_e", "=_e", "80_e", 
		Const.COURSE_BREAK,
		"11", "x", "7", "=", "77", "11_e", "x_e", "7_e", "=_e", "77_e", 
		"23", "x", "3", "=", "69", "23_e", "x_e", "3_e", "=_e", "69_e", 
		"8", "x", "9", "=", "72", "8_e", "x_e", "9_e", "=_e", "72_e", 
		};
		public final static String[] CourseData9_2 = {
		"16", "x", "5", "=", "80", "16_e", "x_e", "5_e", "=_e", "80_e", 
		"12", "x", "6", "=", "72", "12_e", "x_e", "6_e", "=_e", "72_e", 
		"10", "x", "8", "=", "80", "10_e", "x_e", "8_e", "=_e", "80_e", 
		Const.COURSE_BREAK,
		"11", "x", "7", "=", "77", "11_e", "x_e", "7_e", "=_e", "77_e", 
		"23", "x", "3", "=", "69", "23_e", "x_e", "3_e", "=_e", "69_e", 
		"8", "x", "9", "=", "72", "8_e", "x_e", "9_e", "=_e", "72_e", 
		Const.COURSE_BREAK,
		"2", "x", "1", "=", "2", "2_e", "x_e", "1_e", "=_e", "2_e", 
		"2", "x", "2", "=", "4", "2_e", "x_e", "2_e", "=_e", "4_e", 
		"2", "x", "3", "=", "6", "2_e", "x_e", "3_e", "=_e", "6_e", 
		};
		public final static String[] CourseData9_3 = {
		"11", "x", "7", "=", "77", "11_e", "x_e", "7_e", "=_e", "77_e", 
		"23", "x", "3", "=", "69", "23_e", "x_e", "3_e", "=_e", "69_e", 
		"8", "x", "9", "=", "72", "8_e", "x_e", "9_e", "=_e", "72_e", 
		Const.COURSE_BREAK,
		"2", "x", "1", "=", "2", "2_e", "x_e", "1_e", "=_e", "2_e", 
		"2", "x", "2", "=", "4", "2_e", "x_e", "2_e", "=_e", "4_e", 
		"2", "x", "3", "=", "6", "2_e", "x_e", "3_e", "=_e", "6_e", 
		Const.COURSE_BREAK,
		"2", "x", "4", "=", "8", "2_e", "x_e", "4_e", "=_e", "8_e", 
		"2", "x", "5", "=", "10", "2_e", "x_e", "5_e", "=_e", "10_e", 
		"2", "x", "6", "=", "12", "2_e", "x_e", "6_e", "=_e", "12_e",
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
			put("14", R.raw.sound014);
			put("15", R.raw.sound015);
			put("16", R.raw.sound016);
			put("18", R.raw.sound018);
			put("20", R.raw.sound020);
			put("21", R.raw.sound021);
			put("23", R.raw.sound023_e); //
			put("24", R.raw.sound024);
			put("25", R.raw.sound025);
			put("27", R.raw.sound027);
			put("28", R.raw.sound028);
			put("30", R.raw.sound030);
			put("32", R.raw.sound032);
			put("35", R.raw.sound035);
			put("36", R.raw.sound036);
			put("40", R.raw.sound040);
			put("42", R.raw.sound042);
			put("45", R.raw.sound045);
			put("48", R.raw.sound048);
			put("49", R.raw.sound049);
			put("54", R.raw.sound054);
			put("56", R.raw.sound056);
			put("63", R.raw.sound063);
			put("64", R.raw.sound064);
			put("69", R.raw.sound069);
			put("72", R.raw.sound072);
			put("77", R.raw.sound077);
			put("80", R.raw.sound080);
			put("81", R.raw.sound081);
			put("=", R.raw.equal);
			put("x", R.raw.multi);
			
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
			put("14_e", R.raw.sound014_e);
			put("15_e", R.raw.sound015_e);
			put("16_e", R.raw.sound016_e);
			put("18_e", R.raw.sound018_e);
			put("20_e", R.raw.sound020_e);
			put("21_e", R.raw.sound021_e);
			put("23_e", R.raw.sound023_e);
			put("24_e", R.raw.sound024_e);
			put("25_e", R.raw.sound025_e);
			put("27_e", R.raw.sound027_e);
			put("28_e", R.raw.sound028_e);
			put("30_e", R.raw.sound030_e);
			put("32_e", R.raw.sound032_e);
			put("35_e", R.raw.sound035_e);
			put("36_e", R.raw.sound036_e);
			put("40_e", R.raw.sound040_e);
			put("42_e", R.raw.sound042_e);
			put("45_e", R.raw.sound045_e);
			put("48_e", R.raw.sound048_e);
			put("49_e", R.raw.sound049_e);
			put("54_e", R.raw.sound054_e);
			put("56_e", R.raw.sound056_e);
			put("63_e", R.raw.sound063_e);
			put("64_e", R.raw.sound064_e);
			put("69_e", R.raw.sound069_e);
			put("72_e", R.raw.sound072_e);
			put("77_e", R.raw.sound077_e);
			put("80_e", R.raw.sound080_e);
			put("81_e", R.raw.sound081_e);
			put("=_e", R.raw.equal_e);
			put("x_e", R.raw.multi_e);
		}
	};
	
	public static final HashMap<String, Integer> mImageMap = new HashMap<String, Integer>() {
		{
			put("1", R.drawable.pic_001);
			put("2", R.drawable.pic_002);
			put("3", R.drawable.pic_003);
			put("4", R.drawable.pic_004);
			put("5", R.drawable.pic_005);
			put("6", R.drawable.pic_006);
			put("7", R.drawable.pic_007);
			put("8", R.drawable.pic_008);
			put("9", R.drawable.pic_009);
			put("10", R.drawable.pic_010);
			put("11", R.drawable.pic_011);
			put("12", R.drawable.pic_012);
			put("14", R.drawable.pic_014);
			put("15", R.drawable.pic_015);
			put("16", R.drawable.pic_016);
			put("18", R.drawable.pic_018);
			put("20", R.drawable.pic_020);
			put("21", R.drawable.pic_021);
			put("23", R.drawable.pic_023);
			put("24", R.drawable.pic_024);
			put("25", R.drawable.pic_025);
			put("27", R.drawable.pic_027);
			put("28", R.drawable.pic_028);
			put("30", R.drawable.pic_030);
			put("32", R.drawable.pic_032);
			put("35", R.drawable.pic_035);
			put("36", R.drawable.pic_036);
			put("40", R.drawable.pic_040);
			put("42", R.drawable.pic_042);
			put("45", R.drawable.pic_045);
			put("48", R.drawable.pic_048);
			put("49", R.drawable.pic_049);
			put("54", R.drawable.pic_054);
			put("56", R.drawable.pic_056);
			put("63", R.drawable.pic_063);
			put("64", R.drawable.pic_064);
			put("69", R.drawable.pic_069);
			put("72", R.drawable.pic_072);
			put("77", R.drawable.pic_077);
			put("80", R.drawable.pic_080);
			put("81", R.drawable.pic_081);
			
			put("=", R.drawable.blank);
			put("x", R.drawable.blank);
			
			put("1_e", R.drawable.pic_001);
			put("2_e", R.drawable.pic_002);
			put("3_e", R.drawable.pic_003);
			put("4_e", R.drawable.pic_004);
			put("5_e", R.drawable.pic_005);
			put("6_e", R.drawable.pic_006);
			put("7_e", R.drawable.pic_007);
			put("8_e", R.drawable.pic_008);
			put("9_e", R.drawable.pic_009);
			put("10_e", R.drawable.pic_010);
			put("11_e", R.drawable.pic_011);
			put("12_e", R.drawable.pic_012);
			put("14_e", R.drawable.pic_014);
			put("15_e", R.drawable.pic_015);
			put("16_e", R.drawable.pic_016);
			put("18_e", R.drawable.pic_018);
			put("20_e", R.drawable.pic_020);
			put("21_e", R.drawable.pic_021);
			put("23_e", R.drawable.pic_023);
			put("24_e", R.drawable.pic_024);
			put("25_e", R.drawable.pic_025);
			put("27_e", R.drawable.pic_027);
			put("28_e", R.drawable.pic_028);
			put("30_e", R.drawable.pic_030);
			put("32_e", R.drawable.pic_032);
			put("35_e", R.drawable.pic_035);
			put("36_e", R.drawable.pic_036);
			put("40_e", R.drawable.pic_040);
			put("42_e", R.drawable.pic_042);
			put("45_e", R.drawable.pic_045);
			put("48_e", R.drawable.pic_048);
			put("49_e", R.drawable.pic_049);
			put("54_e", R.drawable.pic_054);
			put("56_e", R.drawable.pic_056);
			put("63_e", R.drawable.pic_063);
			put("64_e", R.drawable.pic_064);
			put("69_e", R.drawable.pic_069);
			put("72_e", R.drawable.pic_072);
			put("77_e", R.drawable.pic_077);
			put("80_e", R.drawable.pic_080);
			put("81_e", R.drawable.pic_081);
			
			put("=_e", R.drawable.blank);
			put("x_e", R.drawable.blank);
		}
	};
}
