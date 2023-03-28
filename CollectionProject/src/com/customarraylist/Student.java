package com.customarraylist;

public class Student implements Comparable<Student> {
	private int id;
	private String name;
	private float marks;

	public Student() {

	}

	public Student(int id, String name, float marks) {
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

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String toString() {
		return "Student [id=" + id + ", name " + name + ", marks " + marks + "]";
	}

	public int compareTo(Student o) {
		if (marks == o.marks) {
			return (name.compareTo(o.name));
		} else {

			if (marks < o.marks)
				return 1;
			else
				return -1;
		}
		// return (name.compareTo(o.name));

	}

}
