package com.test4;

//Q10. Write a program to count the number of student registered in a school.
public class Student {
	int id;
	String name;
	float marks;
	int age;

	static String schoolName = "MPS";
	static int studentCount = 0;

	// instance
	{
		studentCount++;
	}

	public Student() {

	}

	public Student(int id, String name, float marks, int age) {
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
		return "The details are:=>" + " id=>" + id + " name= " + name + " marks=> " + marks + " Age:" + age;
	}

}
