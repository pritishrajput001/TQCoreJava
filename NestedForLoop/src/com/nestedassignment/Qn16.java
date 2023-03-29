package com.nestedassignment;

import java.util.Scanner;

public class Qn16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Taking rows value from the user

		System.out.println("Enter no. of rows ");

		int rows = sc.nextInt();

		System.out.println("your pattern....!!!");

		int alphabet = 65; // ASCII value of alphabet 'A'

		for (int i = 0; i <= rows - 1; i++) {
			for (int j = rows - 1; j > i; j--) {
				System.out.print(" ");
			}
			for (int k = 0; k <= i; k++) {
				System.out.print((char) (alphabet + k) + " ");
			}
			System.out.println();
		}

		sc.close();
	}
}
