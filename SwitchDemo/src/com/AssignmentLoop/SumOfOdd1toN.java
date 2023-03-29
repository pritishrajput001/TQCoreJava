//Write a Java program to find sum of all odd numbers between 1 to n.
package com.AssignmentLoop;

import java.util.Scanner;

class SumOfOdd1toN {
	public static void main(String args[]) {
		int num, i, sum = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		num = in.nextInt();

		for (i = 0; i <= num; i++) {
			if ((i % 2) == 1) {
				sum += i;
			}
		}

		System.out.print("Sum of all odd numbers between 0 to " + num + " = " + sum);
	}
}