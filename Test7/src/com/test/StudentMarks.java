package com.test;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String args[]) throws InvalidMarksException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter subject marks:");

		int marks = sc.nextInt();
		try {
			if (marks < 0 || marks > 100) {
				throw new InvalidMarksException("The marks must be between 0 to 100");
			}

		} catch (InvalidMarksException e) {
			System.out.println(e);
		}

		System.out.println("Subject marks: " + marks);
	}

}
