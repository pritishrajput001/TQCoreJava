package com.loop;

import java.util.Scanner;

public class Factorial {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		int i, fact = 1;
		for (i = 1; i <= num; i++) {
			fact = fact * i;
			if (i > 1) {
				System.out.println(i + "*" + i + "=" + fact);
			}
		}

	}

}
