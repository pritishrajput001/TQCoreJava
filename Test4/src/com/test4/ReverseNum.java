package com.test4;

import java.util.Scanner;

//Q3. Write a program to reverse a number and print it
public class ReverseNum {
	// int res = 0;

	static void reverse(int num) {
		int rem;
		int res = 0;
		while (num != 0) {
			rem = num % 10;
			res = (res * 10) + rem;
			num = num / 10;
			reverse(num);
			// System.out.println("reverse of a number is" + res);
		}
		System.out.println("reverse of a number is" + res);

	}

	public static void main(String[] arg) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num;
		reverse(num = sc.nextInt());

	}
}
