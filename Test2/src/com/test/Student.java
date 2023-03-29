package com.test;

import java.util.Scanner;

public class Student {
	int studentId;
	String studentName;
	private float marks;

	public int getstudentId() {
		return studentId;
	}

	public void setstudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getstudentName() {
		return studentName;
	}

	public void setstudentName(String studentName) {
		this.studentName = studentName;
	}

	public float getmarks() {
		return marks;
	}

	public void setmarks(float marks) {
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Details:- " + "id= " + studentId + "  name=  " + studentName + "  marks=  " + marks;
	}

	public void getdetails() {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Details for 1st student=>");
		System.out.println("Enter student id: ");
		this.studentId = sc.nextInt();
		System.out.println("Enter student name: ");
		this.studentName = sc.next();

		System.out.println("Enter student marks: ");
		this.marks = sc.nextFloat();
	}

}