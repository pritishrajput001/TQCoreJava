package com.demo2;

public class CountCharacters {
	public static int countChar(String s) {
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ')
				count++;
		}
		return count;

	}

	public static void main(String args[]) {
		String s1 = "Welcome to Java";
		int count = countChar(s1);
		System.out.println(s1);
		System.out.println("Number of characters: " + count);
	}

}
