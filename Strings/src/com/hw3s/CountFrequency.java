package com.hw3s;

import java.util.Scanner;

public class CountFrequency {
	public static void countfrequency(String str) {

		System.out.println(str);
		str = str.toUpperCase();
		char[] c1 = str.toCharArray();
		int count;

		for (int i = 0; i < str.length(); i++) {
			count = 1;
			if ((c1[i] == ' ') || (c1[i] == '\0')) {
				continue;
			}
			for (int j = i + 1; j < str.length(); j++) {
				if (c1[i] == c1[j]) {
					count++;
					c1[j] = '\0';
				}
              }
			System.out.println(c1[i] + " :" + count);
		}

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String str = s.next();
		countfrequency(str);

	}
}
