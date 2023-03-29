package com.objectdemo;

public class Test {
	int a;

	Test() {

	}

	Test(int a) {
		this.a = a;
	}

	void display() {
		System.out.println("Hello");
	}

	public static void main(String args[]) {
		Test t1 = new Test();
		// Test t2; Only applicable when runtime object is available or created
		System.out.println("Class:" + t1.getClass());
		System.out.println("Object name:" + t1.getClass().getName());
		System.out.println("Constructor:" + t1.getClass().getConstructors());
		System.out.println("Fields:" + t1.getClass());
		System.out.println("Methods:" + t1.getClass().getMethods());

	}

}
