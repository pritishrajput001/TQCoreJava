package com.demo2;

public class ExceptionCheckedProp {
	static void inputName() {
		// String s = "Pritish";
		String s = null;
		System.out.println(s.length());
	}

	static void checkName() {
		inputName();

	}

	static void acceptName() {
		try {
			checkName();

		} catch (Exception e) {
			System.out.println("String is null:CheckName ");
		}
	}

	public static void main(String args[]) {
		acceptName();
	}

}
