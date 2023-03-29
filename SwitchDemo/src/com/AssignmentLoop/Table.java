//WAP to print table of given no
package com.AssignmentLoop;

import java.util.Scanner;

public class Table {
	public static void main(String args[]) {
		int i, num;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number");
		num = s.nextInt();
		for (i = 1; i <= 10; i++) {
			System.out.println(num + " x " + i + " = " + num * i);
		}
	}

}
