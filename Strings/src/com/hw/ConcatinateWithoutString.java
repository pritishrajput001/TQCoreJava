package com.hw;

import java.util.Scanner;

public class ConcatinateWithoutString {
	public static String concatenateString(String first, String second) {
		int len = second.length();
		for (int i = 0; i < len; i++) {
			first = first + second.charAt(i);
		}
		return first;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string");
		String first = sc.nextLine();
		System.out.println("Enter second string");
		String second = sc.nextLine();
		String s1 = concatenateString(first, second);

	}

}
