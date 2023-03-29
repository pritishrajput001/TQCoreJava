package com.hw2;

import java.util.Scanner;

public class LengthStringWo {
	public static String calculateLength(String str) {
		int i = 0;
		for (char ch : str.toCharArray()) {
			i++;
		}
		System.out.println("Length of the given string ::" + i);
		return str;
	}

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your string");
		String str = sc.nextLine();
		calculateLength(str);

	}
}
