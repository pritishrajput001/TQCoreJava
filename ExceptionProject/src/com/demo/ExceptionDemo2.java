package com.demo;

public class ExceptionDemo2 {
	public static void main(String args[]) {
		int ar[] = { 4, 5, 7, 0, 3 };
		try {
			for (int i = 0; i < ar.length; i++) {
				ar[i] = ar[i] / ar[i + 1];
				System.out.println(ar[i]);
			}
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero not alowed");

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Check your array index");
		} catch (Exception e) {
			System.out.println("Exception:" + e.getMessage());
		}
		System.out.println("Hello");

	}

}
