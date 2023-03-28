package com.demo4;

import java.util.Scanner;

public class ArrayPrime {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Total numbers : ");
		int n = sc.nextInt();
		boolean isPrime = true;
		int result = 0;
		System.out.println("Enter the Numbers : ");
		int[] numbers = new int[n];

		for (int i = 0; i < n; i++) {
			numbers[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			for (int j = 2; j * j < numbers[i]; j++) {
				if (numbers[i] % j == 0) {
					isPrime = false;
					break;
				}
			}
		}
		if (isPrime) {
			int i = 0;
			System.out.println("The Prime Numbers : " + numbers[i]);
		}
	}

}