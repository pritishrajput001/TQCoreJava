package com.demo2;

public class MethodOfString1 {
	public static void main(String args[]) {
		String s1 = "Java is fun";
		char ch = s1.charAt(2);// index
		System.out.println(ch);

		ch = s1.charAt(s1.length() - 1);
		System.out.println(ch);
		String sub1 = s1.substring(1, 3);
		System.out.println(sub1);

		System.out.println(s1.contains("his"));

		String str1 = "Java";
		String str2 = "Java";

		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

		System.out.println(str1.equalsIgnoreCase(str2));

		System.out.println(str1.toLowerCase());
		System.out.println(str1);

		System.out.println(str1.toUpperCase());
		System.out.println(str1);

		System.out.println(str1.toUpperCase());

		System.out.println(str1.lastIndexOf('a'));

	}

}
