package com.demo2;

public class NumberOfCharacter {
	public static void main(String args[]) {
		String str = "I will improve";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) != ' ')
				count++;
		}
		System.out.println("Total number of characters in string:" + count);
	}

}
