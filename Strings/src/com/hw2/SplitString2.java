package com.hw2;

import java.util.Arrays;

public class SplitString2 {
	public static void divideStrings(String str) {
		int len = str.length();
		int n = 4;
		int noOfchar = len / n;

		String[] splitstr = new String[n];
		int temp = 0; // index of substring
		if (len % n != 0) {
			System.out.println("Can not divide string in equal parts");

		} else {
			for (int i = 0; i < str.length(); i += noOfchar) {
				splitstr[temp] = str.substring(i, i + noOfchar);
				temp++;
			}
		}
		System.out.println(Arrays.toString(splitstr));
	}

	public static void main(String args[]) {
		String str = "Programmings";
		divideStrings(str);

	}

}
