package com.Assignment;

import java.util.Scanner;

public class StudentGrade {
	public static void main(String args[]) {
		int sub1, sub2, sub3, sub4, sub5, total;
		double percentage;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of 5 subject ");
		sub1 = sc.nextInt();
		sub2 = sc.nextInt();
		sub3 = sc.nextInt();
		sub4 = sc.nextInt();
		sub5 = sc.nextInt();

		total = sub1 + sub2 + sub3 + sub4 + sub5;
		percentage = (total / 5);
		System.out.println("Percentage = " + percentage);

		if (percentage >= 85) {
			System.out.println("Excellent.....!  You are OverGrade");
			System.out.println("A Grade");
		} else if (percentage >= 70) {
			System.out.println("Very Good..!");
			System.out.println("B Grade");
		} else if (percentage >= 60) {
			System.out.println("Good..!");
			System.out.println("C Grade");
		} else if (percentage >= 40) {
			System.out.println("Average");
			System.out.println("D Grade");
		} else if (percentage < 40) {
			System.out.println("Fail!");
		}
	}

}
