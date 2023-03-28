package com.course;

public class Student {
	private int sid;
	private String name;
	private int marks;
	private Course course;

	public Student(int sid, String name, int marks, Course course) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
		this.course = course;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", name=" + name + ", marks=" + marks + ", course=" + course + "]";
	}

}
