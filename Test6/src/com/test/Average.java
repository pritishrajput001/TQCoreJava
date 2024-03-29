package com.test;

import java.util.Scanner;

public class Average {
	public static void main(String[] args) {
		int number;
		float average = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("what is your number?");
		number = sc.nextInt();
		average = avDigits(number);
		System.out.println("The average is " + average);
	}

	private static float avDigits(int number) {
		int digits = 0;
		float sum = 0.0F;
		while (number > 0) {
			digits += 1;
			sum += number % 10;
			number /= 10;
		}
		return (sum / digits);
	}
}