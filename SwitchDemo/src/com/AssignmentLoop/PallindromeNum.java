//18.	check no is palimdrom or not
package com.AssignmentLoop;

import java.util.Scanner;

public class PallindromeNum {
	public static void main(String args[]) {
		int num, rem, rev = 0, temp;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		temp = num;
		for (; num > 0;) {
			rem = num % 10;
			rev = (rev * 10) + rem;
			num = num / 10;
		}
		if (temp == rev) {
			System.out.println("Pallindrome no.");
		} else {
			System.out.println("It is snot pallindrome no.");
		}

	}

}
