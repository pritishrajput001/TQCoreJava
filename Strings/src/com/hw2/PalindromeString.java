package com.hw2;

public class PalindromeString {
	public static boolean checkPalindrome(String str) {
		String rev = "";
		boolean ans = false;

		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		if (str.equals(rev)) {
			ans = true;
		}
		return ans;
	}

	public static void main(String args[]) {
		String str = "mamam";
		str = str.toLowerCase();
		boolean b = checkPalindrome(str);
		System.out.println(b);
	}

}
