package com.loop;

import java.util.Scanner;

class ExtractDigit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		long num = sc.nextLong();
		int count = 0;

		while (num != 0) {
			num = num / 10;
			count++;
		}
		System.out.println(count);
	}
}