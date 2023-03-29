// Find greatest between two numbers:
package com.Assignment;

import java.util.Scanner;

class GreatestNumber {
	public static void main(String args[]) {
		int numf, nums;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		numf = sc.nextInt();
		System.out.println("Enter 2nd number");
		nums = sc.nextInt();

		if (numf > nums) {
			System.out.println(numf + " is grater");
		} else {
			System.out.println(nums + " is grater");
		}

	}

}
