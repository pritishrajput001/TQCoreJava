package com.hw3s;

import java.util.Scanner;

public class PrintNextAlphabate {

	public static void nextchar(String str) {
		char ch[] = str.toCharArray();

		for (int i = 0; i < str.length(); i++) {
          ch[i]++;
		}
	  System.out.println(ch);
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String str = input.nextLine();

		nextchar(str);

	}
}
