package com.Assignment;

public class Student {
	public int rollno;
	protected int admissionno;
	int age;
	String course;
	// private String course;(After taking this the course is not visible in main
	// class

	public void takeInput(int r, int an, int ag, String co) {
		rollno = r;
		admissionno = an;
		age = ag;
		course = co;
	}
}