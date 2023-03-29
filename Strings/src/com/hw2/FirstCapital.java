package com.hw2;

import java.util.Scanner;

public class FirstCapital {
	public static String makeCapitalFirst(String str) {

		String words[] = str.split("\\s");
		String newString = "";

		for (String w : words) {
			String first = w.substring(0, 1);
			String rest = w.substring(1);
			newString += first.toUpperCase() + rest + " ";

		}
		System.out.println(newString.trim());
		return str;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Sentence:");
		String str = sc.nextLine();
		makeCapitalFirst(str);

	}
}
