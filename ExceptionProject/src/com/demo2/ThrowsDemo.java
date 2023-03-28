package com.demo2;

public class ThrowsDemo {
	static void inputName() throws NullPointerException {
		String s = null;
		System.out.println(s.length());
	}

	public static void main(String args[]) {
		try {
			inputName();
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
