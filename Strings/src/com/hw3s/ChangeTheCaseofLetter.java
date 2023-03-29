package com.hw3s;

import java.util.Scanner;

public class ChangeTheCaseofLetter {

	public static void changecase(String str) {

		System.out.println(str = str.toLowerCase());
		System.out.println(str = str.toUpperCase());

	}

	public static void main(String[] args) {

		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = s1.next();

		changecase(str);

	}

}
