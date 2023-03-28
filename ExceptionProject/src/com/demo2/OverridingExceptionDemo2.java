package com.demo2;

class Parent1 {
	int val = 90;

	void printValue() throws Exception {
		System.out.println(val / 2);
	}
}

class Child1 extends Parent1 {
	int a, b;
	{
		a = 89;
		b = 0;
	}

	void printValue() throws ArithmeticException {
		System.out.println(a / b);
	}
}

public class OverridingExceptionDemo2 {
	public static void main(String args[]) {
		Child1 c = new Child1();
		c.printValue();
	}

}
