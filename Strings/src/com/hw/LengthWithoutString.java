package com.hw;

import java.util.Scanner;

public class LengthWithoutString {
	public static String withoutString(String str) {
		System.out.println(str);
		int i = 0;
		for (char c : str.toCharArray()) {
			i++;
		}
		System.out.println("Length of the given string:" + i);
		return str;
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string ");
		String str = sc.next();
		String s1 = withoutString(str);
		System.out.println(s1);
	}

}
