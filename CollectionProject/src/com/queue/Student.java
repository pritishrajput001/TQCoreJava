package com.queue;

public class Student implements Comparable<Student> {

	private int id;
	private String name;
	private float marks;
	private int age;

	public Student() {

	}

	public Student(int id, String name, int age, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.age = age;

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Student [id=" + id + ", name= " + name + ", marks= " + marks + ",age= " + age + "] ";
	}

	public int compareTo(Student o) {
		return name.compareTo(o.name);
	}

}
