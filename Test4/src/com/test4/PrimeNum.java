package com.test4;

import java.util.Scanner;

public class PrimeNum {
	static void checkPrimeNumber(int num) {
		boolean flag = true;
		if (num == 0 || num == 1) {
			System.out.println(num + " Not a prime number");
		} else {
			for (int i = 2; i <= num / 2; i++) {
				if (num % i == 0) {
					System.out.println(num + "Not a prime number");
					flag = false;
					break;
				}
			}
		}
		if (flag = true)

		{
			System.out.println(num + "is a prime number");
		}

	}

	public static void main(String args[]) {
		int num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		checkPrimeNumber(num = sc.nextInt());
		sc.close();

	}

}
