//Write a Java program to input any alphabet 
//and check whether it is vowel or consonant 
package com.Assignment;

import java.util.Scanner;

public class VowelConsonantSwitch {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter character");
		char ch = sc.next().charAt(0);

		int flag = 0;
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It is vowel");
			flag = 1;
			break;

		}
		if (flag == 0) {
			System.out.println("It is consonant");
		}

	}

}
