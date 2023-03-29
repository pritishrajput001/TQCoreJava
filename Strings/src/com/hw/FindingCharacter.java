package com.hw;

import java.util.Scanner;

public class FindingCharacter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the required String: ");
		String str = sc.next();
		System.out.println("Enter the required character: ");
		char ch = sc.next().toCharArray()[0];
		// Converting the String to char array
		char charArray[] = str.toCharArray();
		boolean flag = false;
		for (int i = 0; i < charArray.length; i++) {
			flag = true;
		}
		if (flag) {
			System.out.println("Sting contains the specified character");
		} else {
			System.out.println("String doesnt conatin the specified character");
		}
	}
}