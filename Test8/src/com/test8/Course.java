package com.test8;

public class Course {
	private String name;
	private int fees;

	public Course() {

	}

	public Course(String name, int fees) {
		super();
		this.name = name;
		this.fees = fees;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "Course [name=" + name + ", fees=" + fees + "]";
	}

}
