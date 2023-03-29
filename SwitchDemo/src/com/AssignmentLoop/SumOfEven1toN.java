//Write a Java program to find sum of all even numbers between 1 to n. 
package com.AssignmentLoop;

import java.util.Scanner;

public class SumOfEven1toN {
	public static void main(String args[]) {
		int num, i, sum = 0;

		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number");
		num = in.nextInt();

		for (i = 0; i <= num; i++) {
			if ((i % 2) == 0) {
				sum += i;
			}
		}

		System.out.print("Sum of all even numbers between 0 to " + num + " = " + sum);
	}
}