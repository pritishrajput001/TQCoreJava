package com.hw2;

public class LengthConcateReverse {

	public static void length(String str) {

		int count = 0;
		char[] ch = str.toCharArray();
		for (int i = 0; i <= str.length() - 1; i++) {
			count++;
		}
		System.out.println("Length of string is: " + count);

	}

	public static void concat(String str1, String str2) {

		String str = str1.concat(str2);

		System.out.println("After concatination: " + str);
	}

	public static void rev(String str1) {
		String rev = "";
		for (int i = str1.length() - 1; i >= 0; i--) {
			rev = rev + str1.charAt(i);
		}
		System.out.println("The reverse string are:  " + rev);
	}

	public static void main(String[] args) {

		String str1 = "Zanjad Suyog";
		String str2 = "__Zanjad Suyog";

		length(str1);
		System.out.println("_________________________________");
		concat(str1, str2);
		System.out.println("_________________________________");
		rev(str1);

	}

}
