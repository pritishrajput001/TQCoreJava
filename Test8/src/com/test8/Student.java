package com.test8;

public class Student {
	private int id;
	private String name;
	private boolean isSpecial;
	private Course course;

	public Student() {

	}

	public Student(int id, String name, boolean isSpecial, Course course) {
		super();
		this.id = id;
		this.name = name;
		this.isSpecial = isSpecial;
		this.course = course;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isSpecial() {
		return isSpecial;
	}

	public void setSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", isSpecial=" + isSpecial + "]";
	}

}
