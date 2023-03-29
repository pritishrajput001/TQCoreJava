package com.hw2;

import java.util.Scanner;

public class ReverseStringWo {
	public static String reverseString(String str) {
		System.out.print("After reverse string is: ");
		for (int i = str.length(); i > 0; --i) // i is the length of the string
		{
			System.out.print(str.charAt(i - 1));
		}
		return str;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String: ");
		String str = sc.nextLine();
		reverseString(str);
	}

}
