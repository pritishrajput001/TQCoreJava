package com.demo;

import java.util.ArrayList;

public class StudentCourseHashMap {

	public static void main(String args[]) {

		ArrayList<Student> std = new ArrayList<>();

		std.add(new Student(101, "Pritish", 88f, new Course(11, "Java", 15400)));
		std.add(new Student(102, "Saurabh", 78f, new Course(22, "Python", 54000)));
		std.add(new Student(103, "Dhanashri", 68f, new Course(11, "Java", 15400)));
		std.add(new Student(104, "Neha", 98f, new Course(11, "Java", 15400)));
		std.add(new Student(105, "Shubham", 74f, new Course(11, "Java", 15400)));

	}

}
