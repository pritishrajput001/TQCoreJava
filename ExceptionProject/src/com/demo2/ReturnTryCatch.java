package com.demo2;

public class ReturnTryCatch {

	@SuppressWarnings("finally")
	static float returnValue(int a, int b) {
		float div = 0.0f;
		try {
			div = a / b;
			System.out.println("The division is");
			// return div;
		} catch (Exception e) {
			System.out.println(e);
			// return 0.0f;
		} finally {
			return div;
		}
	}

	static int returnValue1() {
		int value = 0;
		try {
			int a = 90 / 0;
			value = 34;
		} catch (Exception e) {
			value = 334;
			System.out.println(e);
		} finally {
			value = 56;
		}
		return value;

	}

	public static void main(String args[]) {
		System.out.println(returnValue(10, 0));
		System.out.println(returnValue1());
	}

}
