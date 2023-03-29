package com.test;

public class StudentTest {
	public static void main(String args[]) {

		Student s1 = new Student();
		s1.getdetails();
		/*
		 * Student s2 = new Student(); s2.getdetails(); Student s3 = new Student();
		 * s3.getdetails();
		 */
		System.out.println("====================================");
		System.out.println("Details of accounts as follows...");
		System.out.println(s1.toString());
		// System.out.println(s2.toString());
		// System.out.println(s3.toString());

	}

}
