package com.nestedassignment;

import java.util.Scanner;

public class Qn2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("rows pattern?");

		int rows = sc.nextInt();

		System.out.println("your pattern....!!!");

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		for (int i = rows - 1; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}

			System.out.println();
		}

		sc.close();
	}
}