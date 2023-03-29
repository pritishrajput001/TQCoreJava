package com.loop;

import java.util.Scanner;

public class SumEvenOdd {

	public static void main(String[] args) {

		int num, i, sumEv = 0, sumOd = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		num = sc.nextInt();
		for (i = 1; i <= num; i++) {
			if (i % 2 == 0) {
				sumEv = sumEv + i;
			} else {
				sumOd = sumOd + i;
			}

		}
		System.out.println("Sum of even numer" + sumEv);
		System.out.println("Sum of odd numer" + sumOd);

	}
}