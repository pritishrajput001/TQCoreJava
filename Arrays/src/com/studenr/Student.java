package com.studenr;

import java.util.Arrays;

public class Student {
	private int id;
	private String name;
	private float marks[];

	public Student() {

	}

	public Student(int id, String name, float marks[]) {
		this();
		this.id = id;
		this.name = name;
		this.marks = marks;

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

	public float[] getMarks() {
		return marks;
	}

	public void setMarks(float marks[]) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [Id=" + id + ",Name= " + name + ", Marks=" + Arrays.toString(marks) + "]";

	}

}
