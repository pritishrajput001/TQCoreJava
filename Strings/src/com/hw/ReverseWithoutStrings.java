package com.hw;

import java.util.Scanner;

public class ReverseWithoutStrings {
	public static String revesreString(String str) {
		if (str.isEmpty()) {
			return str;
		} else {
			return revesreString(str.substring(1)) + str.charAt(0);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string value");
		String str = sc.next();
		String result = ReverseWithoutStrings.revesreString(str);
		System.out.println(result);

	}

}
