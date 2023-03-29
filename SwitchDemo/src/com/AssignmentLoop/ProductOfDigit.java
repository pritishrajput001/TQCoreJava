//9.	 Write a Java program to calculate product of digits of any number.
package com.AssignmentLoop;

import java.util.Scanner;

public class ProductOfDigit {
	public static void main(String args[]) {
		int num, temp, product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		temp = num;
		while (temp != 0) {
			product = product * (temp % 10);
			temp = temp / 10;
		}
		System.out.println("Product of all digits in a num is " + product);
	}

}
