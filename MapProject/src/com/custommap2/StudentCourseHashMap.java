package com.custommap2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentCourseHashMap {

	public static void createCourseNameStudentMap(ArrayList<Student> sl) {

		HashMap<Course, ArrayList<String>> coursemap = new HashMap<>();
		Iterator<Student> itr = sl.iterator();

		ArrayList<String> courseList;

		while (itr.hasNext()) {
			Student s = itr.next();
			if (!coursemap.containsKey(s.getCourse())) {
				courseList = new ArrayList<>();

			} else {
				courseList = coursemap.get(s.getCourse());
			}
			courseList.add(s.getName());
			coursemap.put(s.getCourse(), courseList);

		}
		for (Map.Entry<Course, ArrayList<String>> en : coursemap.entrySet()) {
			System.out.println(en.getKey());
		}
		System.out.println("----------------------------------------");
	}

	public static void countStudentCourse(ArrayList<Student> st) {
		HashMap<Course, Integer> coursemap = new HashMap<>();

		Iterator<Student> itr = st.iterator();
		int count;
		while (itr.hasNext()) {
			count = 1;
			Student s = itr.next();
			if (!coursemap.containsKey(s.getCourse())) {
				coursemap.put(s.getCourse(), count);

			} else {
				count = coursemap.get(s.getCourse());
				coursemap.put(s.getCourse(), count + 1);
			}
		}
		for (Map.Entry<Course, Integer> en : coursemap.entrySet()) {

			System.out.println(en.getKey().getName() + " " + en.getValue());
		}

	}

	public static void main(String args[]) {
		ArrayList<Student> std = new ArrayList<>();

		std.add(new Student(101, "Sagar", 28, new Course(11, "Java")));
		std.add(new Student(102, "Pritish", 23, new Course(12, "Python")));
		std.add(new Student(103, "Gaurav", 26, new Course(22, "DotNet")));
		std.add(new Student(201, "Adinath", 22, new Course(11, "Java")));
		std.add(new Student(202, "Sairaj", 21, new Course(22, "DotNet")));
		std.add(new Student(204, "Sushil", 24, new Course(16, "Core Java")));
		std.add(new Student(208, "Suraj", 25, new Course(16, "Core Java")));
		std.add(new Student(205, "Raj", 24, new Course(16, "Core Java")));

		createCourseNameStudentMap(std);
		countStudentCourse(std);
	}

}
