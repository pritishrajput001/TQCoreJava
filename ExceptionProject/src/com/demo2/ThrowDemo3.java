package com.demo2;

import java.util.Scanner;

public class ThrowDemo3 {
	static void calGrade(float m) {
		System.out.println("Grade calculated");
	}

	static void validate(float m) throws ArithmeticException {
		if ((m < 0) || (m > 100)) {
			throw new ArithmeticException("Marks should be between 0 and 100");
		} else {
			calGrade(m);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the marks");
		float marks = sc.nextFloat();
		validate(marks);
		sc.close();
	}

}
