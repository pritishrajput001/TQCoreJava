package com.test4;

import java.util.Scanner;

class Prime {

	static boolean isPrime(int num) {
		boolean flag = true;

		// Check if number is <= 1
		if (num <= 1) {
			flag = false;
			return flag;
		}

		// Check for factors
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}

		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		if (isPrime(num)) {
			System.out.println("The number is prime");
		} else {
			System.out.println("The number is not prime");
		}
		sc.close();
	}
}