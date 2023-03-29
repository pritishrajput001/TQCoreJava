package com.loop;

import java.util.Scanner;

class ExtractNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();

		while (num != 0) {

			int rem = num % 10;

			System.out.println(rem);

			num = num / 10;
		}
	}
}