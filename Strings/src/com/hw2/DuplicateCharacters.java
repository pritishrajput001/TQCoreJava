package com.hw2;

import java.util.Scanner;

public class DuplicateCharacters {
	public static String findDuplicate(String str) {
		int count;
		System.out.println("The duplicate characters in string are:");

		char ch[] = str.toCharArray();
		for (int i = 0; i < str.length(); i++) {
			count = 1;
			for (int j = i + 1; j < str.length(); j++) {
				if (ch[i] == ch[j] && ch[i] != ' ') {
					count++;
					ch[j] = '0';
				}
			}
			if (count > 1 && ch[i] != '0') {
				System.out.println(ch[i]);
			}

		}
		return str;

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		findDuplicate(str);

	}

}
