package com.loosecoupling;

class Student {
	int id;
	String name;
	double fees;
	int age;

	Student() {

	}

	Student(int id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.fees = 0.0;

	}

	void calcFees(double fees, int months) {
		this.fees = fees * months;
		System.out.println("Fees to be paid is:" + this.fees);
	}

	public String toString() {
		return id + " " + name + " " + fees;
	}
}

class CollegeStudent extends Student {
	String course;

	CollegeStudent() {

	}

	public CollegeStudent(int id, String name, int age, String course) {
		super(id, name, age);
		this.course = course;

	}

	void scholarship(double fees, int months, float sc) {
		this.fees = fees;
		calcFees(fees, months);
	}

	public String toString() {
		return super.toString() + " " + course;
	}
}

public class TightCouplingDemo {
	public static void main(String args[]) {
		CollegeStudent c1 = new CollegeStudent(1, "Pritish", 23, "Btech");
		c1.scholarship(3500, 4, 10);
		System.out.println(c1);

	}

}
