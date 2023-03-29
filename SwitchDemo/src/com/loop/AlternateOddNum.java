package com.loop;

import java.util.Scanner;

public class AlternateOddNum {
	public static void main(String args[]) {
		int i, num;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
				i += 2;
			}
		}
	}

}
