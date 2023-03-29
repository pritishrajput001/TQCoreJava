package com.test4;

//Q10. Write a program to count the number of student registered in a school.
public class StudentTest {
	public static void main(String args[]) {
		Student s1 = new Student(42, "Sohan", 78, 13);
		System.out.println(s1);
		Student s2 = new Student(21, "Aryan", 66, 12);
		System.out.println(s2);
		Student s3 = new Student(44, "Toran", 80, 14);
		System.out.println(s3);
		System.out.println("Total no. of students are:" + Student.studentCount);

	}

}