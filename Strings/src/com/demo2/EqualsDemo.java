package com.demo2;

public class EqualsDemo {
	public static void main(String ars[]) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = "Python";

		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));

		System.out.println("==========================");
		System.out.println(s1 == s3);
		System.out.println(s1.equals(s3));

		System.out.println("==========================");

		String s4 = new String("Java");
		System.out.println(s1 == s4);
		System.out.println(s1.equals(s4));
		System.out.println("==========================");

		String s5 = new String("Java");
		System.out.println(s4 == s5);
		System.out.println(s4.equals(s5));

		s1 = s1.concat("Programs");
		System.out.println(s1);

	}

}
