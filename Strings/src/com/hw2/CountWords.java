package com.hw2;

import java.util.Scanner;

public class CountWords {
	public static int countWords(String s) {
		int ct = 1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				ct++;
		}

		return ct;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter sentence");
		String s1 = sc.nextLine();
		int count = countWords(s1);
		System.out.println(s1);
		System.out.println("Number of words:" + count);
		sc.close();

	}

}
