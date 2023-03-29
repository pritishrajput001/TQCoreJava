package com.hw;

public class Duplicate {
	public static String findDuplicate(String str) {
		char[] myArr = str.toCharArray();
		System.out.println("The string is str:" + str);
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (myArr[i] == myArr[j]) {
					System.out.println(myArr[j] + " ");
				}
			}
		}
		return str;
	}

	public static void main(String args[]) {
		String s1 = "I love India";
		String str = findDuplicate(s1);

	}

}
