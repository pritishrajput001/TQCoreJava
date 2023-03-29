package com.test3;

public class StudentTest {
	public static void main(String args[]) {

		Student s1 = new Student(11, "Pritish Rajput", 79f);
		Student s2 = new Student(58, "Yogesh", 22, 85f);

		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Total no of students raegistered: " + Student.studentCount);

	}

}
