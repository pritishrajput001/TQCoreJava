package com.test;

public class CountCharactersWords {

	public static int countChar(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;
		}
		return count;

	}

	public static int countWords(String s) {
		int ct = 1;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ')
				ct++;
		}

		return ct;
	}

	public static void main(String args[]) {
		String s1 = "Welcome to Java";
		int count = countChar(s1);

		System.out.println(s1);
		System.out.println("Number of characters: " + count);
		int count2 = countWords(s1);
		System.out.println(s1);
		System.out.println("Number of words:" + count2);
	}

}
