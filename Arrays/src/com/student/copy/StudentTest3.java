package com.student.copy;

import java.util.Scanner;

public class StudentTest3 {
	static Scanner sc = new Scanner(System.in);

	public static void enterStudentDetails(Student s) {
		System.out.println("Enter id:");
		s.setId(sc.nextInt());

		System.out.println("Enter name");
		s.setName(sc.next());

		System.out.println("Enter marks");
		s.setMarks(sc.nextFloat());

	}

	public static void main(String args[]) {
		Student stud[] = new Student[10];
		int i = 0;
		int choice = 0;

		do {
			stud[i] = new Student();
			enterStudentDetails(stud[i]);
			i++;
			System.out.println("Do you want to enter more student(1-yes/0-no");
			choice = sc.nextInt();

		} while (choice == 1 && i < 10);

		// System.out.println(Arrays.toString(stud));
		// print all the students
		for (Student st : stud) {
			System.out.println(st);
		}
		System.out.println("Number of students:" + Student.scount);
	}

}
