package com.test4;

//Q1. Write a program to display the number divisible by 3 from 1 to n numbers.
import java.util.Scanner;

public class Num3 {
	static void checkDivisible(int num) {
		int num1 = 0;
		for (int i = 0; i <= num; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number limit ");
		int num;
		checkDivisible(num = sc.nextInt());

	}
}
