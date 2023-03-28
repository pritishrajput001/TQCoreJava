package com.demo2;

import java.io.IOException;

class Parent {
	int val = 90;

	void printValue() throws IOException {
		System.out.println(val / 2);
	}

}

class Child extends Parent {

	int a, b;

	{
		a = 89;
		b = 0;
	}

	void printValue() throws ArithmeticException, IOException {

		System.out.println(a / b);
		throw new IOException("Input error");

	}

}

public class ExceptionOverriding {

	public static void main(String[] args) throws ArithmeticException, IOException {

		Child c = new Child();
		c.printValue();

	}

}
