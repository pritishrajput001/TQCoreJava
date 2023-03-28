package com.demo;

public class ExceptionDemo1 {
	public static void main(String args[]) {

		int num1 = 89;
		int num2 = 0;
		{
			try {
				int result = num1 / num2;
				System.out.println("Result: " + result);
			} catch (ArithmeticException e) {
				System.out.println("Exception occured: " + e.getMessage());
			}
			System.out.println("Hello Java");
		}
	}
}
