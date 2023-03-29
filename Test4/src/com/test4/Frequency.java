package com.test4;

//Q4. Write a program to count the frequency of digit in a number
import java.util.Scanner;

public class Frequency {
	public static void main(String args[]) {
		int num, count, digit, origNum;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number: ");
		num = sc.nextInt();
		System.out.println("Digit\tFrequency");
		for (int i = 0; i <= 9; i++) {
			count = 0;
			origNum = num;
			while (origNum > 0) {
				digit = origNum % 10;
				if (digit == i) {
					count++;
				}
				origNum = origNum / 10;
				// System.out.println(+origNum);
			}
			if (count > 0) {
				System.out.println(i + "\t" + count);
			}
			sc.close();
		}
	}

}
