package com.hw;

import java.util.Scanner;

public class UniqueCharacter {
	public static void findUnique(String str, String ch) {
		// Invoking the index of method
		int i = str.indexOf(ch);
		if (i != -1) {
			System.out.println("Sting contains the specified character");
		} else {
			System.out.println("String doesn’t contain the specified character");
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the required String: ");
		String str = sc.next();
		System.out.println("Enter the required character: ");
		char ch = sc.next().toCharArray()[0];
	}

}
