package com.loop;

import java.util.Scanner;

public class SumNum {
	public static void main(String args[]) {
		int num, sum = 0, i;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		for (i = 1; i <= num; ++i) {
			sum = sum + i;

		}
		System.out.println("Sum = " + sum);
	}

}
