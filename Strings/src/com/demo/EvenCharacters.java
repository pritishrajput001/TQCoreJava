package com.demo;

public class EvenCharacters {
	public static void printEvenChar(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (i % 2 == 0) {
				System.out.println(s.charAt(i));
			}
		}
	}

	public static void main(String args[]) {

		String s1 = "Java is fun";
		System.out.print(s1);
		printEvenChar(s1);
	}
}
