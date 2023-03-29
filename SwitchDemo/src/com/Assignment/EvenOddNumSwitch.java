//Write a Java program to check whether a 
//number is even or odd using switch case 
package com.Assignment;

import java.util.Scanner;

public class EvenOddNumSwitch {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		switch (num % 2) {
		case 0:
			System.out.println(num + " is Even Number");
			break;
		case 1:
			System.out.println(num + " is Odd Number");
		}
	}

}
