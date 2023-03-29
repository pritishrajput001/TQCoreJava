package com.hw2;

import java.util.Scanner;

public class VowelChangeCase {
	public static void toVowelUpp(char[] str) {

		for (int i = 0; i < str.length; i++) {
			if (str[i] == 'a' || str[i] == 'e' || str[i] == 'i' || str[i] == 'o' || str[i] == 'u') {
				char c = Character.toUpperCase(str[i]);
				str[i] = c;
			}
		}
		for (char c : str) {
			System.out.print(c);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string:");
		String str = sc.nextLine();
		toVowelUpp(str.toCharArray());
	}

}
