package com.logical;

import java.util.Scanner;

public class Anagram {

	public static void sortArray(char[] ch) {
		char temp;
		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}
			}
		}

	}

	public static boolean equalArray(char[] ch1, char[] ch2) {
		boolean isEqual = true;
		for (int i = 0; i < ch1.length; i++) {
			if (ch1[i] != ch2[i]) {
				isEqual = false;
				break;
			}

		}
		return isEqual;

	}

	public static boolean checkAnagram(String s1, String s2) {
		boolean flag = false;

		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();

		if (s1.length() == s2.length()) {
			char ch1[] = s1.toCharArray();
			char ch2[] = s2.toCharArray();

			// sort
			/*
			 * Arrays.sort(ch1); Arrays.sort(ch2);
			 */

			sortArray(ch1);
			sortArray(ch2);
			/*
			 * if(Arrays.equals(ch1, ch2)) flag=true;
			 */

			if (equalArray(ch1, ch2))
				flag = true;
		}

		return flag;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter first string:");
		String str1 = sc.next();

		System.out.println("Enter second string:");
		String str2 = sc.next();

		boolean status = checkAnagram(str1, str2);

		if (status) {
			System.out.println("The strings are anagram");
		} else {
			System.out.println("The strings are not anagram");
		}

	}

}
