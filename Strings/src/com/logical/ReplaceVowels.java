package com.logical;

public class ReplaceVowels {

	public static void replaceVowels(String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || (str.charAt(i) == 'I') || (str.charAt(i) == 'O')
					|| (str.charAt(i) == 'U') || (str.charAt(i) == 'a') || (str.charAt(i) == 'e')
					|| (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
				str = str.replace(str.charAt(i), '$');
			}
		}

		System.out.println(str);
	}

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

	public static void replaceVowels1(String str) {
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == 'A' || str.charAt(i) == 'E' || (str.charAt(i) == 'I') || (str.charAt(i) == 'O')
					|| (str.charAt(i) == 'U') || (str.charAt(i) == 'a') || (str.charAt(i) == 'e')
					|| (str.charAt(i) == 'i') || (str.charAt(i) == 'o') || (str.charAt(i) == 'u')) {
				ch[i] = '$';
			}
		}

		// str= Arrays.toString(ch);

		str = new String(ch);
		System.out.println(str);
	}

	public static void main(String[] args) {

		String s1 = "Java is fun";
		replaceVowels(s1);
		System.out.println(s1);

		s1 = replaceVowels2(s1);
		System.out.println(s1);

	}

}
