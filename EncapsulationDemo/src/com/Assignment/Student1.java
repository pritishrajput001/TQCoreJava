package com.Assignment;

public class Student1 {
	public static void main(String args[]) {

		Student s1 = new Student();
		Student s2 = new Student();

		s1.rollno = 79;
		s1.admissionno = 9784359;
		s1.age = 23;
		s1.course = "java";

		s2.rollno = 34;
		s2.admissionno = 36363;
		s2.age = 21;
		s2.course = "python";

		System.out.println("Roll no. is " + s1.rollno);
		System.out.println("Admission no. is " + s1.admissionno);
		System.out.println("Age of student is " + s1.age);
		System.out.println("Course of Student is" + s1.course);
		System.out.println("Roll no. is " + s2.rollno);
		System.out.println("Admission no. is " + s2.admissionno);
		System.out.println("Age of student is " + s2.age);
		System.out.println("Course of Student is" + s2.course);

	}

}
