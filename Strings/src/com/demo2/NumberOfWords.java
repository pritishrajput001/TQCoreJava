package com.demo2;

public class NumberOfWords {

	public static void main(String[] args) {
		String str = "Welcome to Strings topic";

		int count = 1;

		for (int i = 0; i < str.length() - 1; i++) {
			if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
				count++;
			}
		}
		System.out.println("Number of words in a string : " + count);
	}
}
