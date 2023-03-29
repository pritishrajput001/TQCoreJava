package com.hw2;

public class VowelSymbolReplace {

	public static String replaceVowels2(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || (str.charAt(i) == 'I') || (str.charAt(i) == 'O')
					|| (str.charAt(i) == 'U') || (str.charAt(i) == 'a') || (str.charAt(i) == 'e')
					|| (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
				str = str.replace(str.charAt(i), '$');
			}
		}

		return str;
	}

	public static void main(String[] args) {

		String s1 = "Java is fun";
		String s2 = "My name is Pritish";
		// replaceVowels(s1);
		System.out.println(s1);

		s1 = replaceVowels2(s1);
		s2 = replaceVowels2(s2);
		System.out.println(s1);
		System.out.println(s2);

	}
}