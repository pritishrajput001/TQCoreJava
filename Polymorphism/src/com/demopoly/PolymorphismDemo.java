package com.demopoly;

public class PolymorphismDemo {
	int x;
	int y;
	int z;

	int add(int x, int y) {
		System.out.println("Addition of two numbers: ");
		return (x + y);
	}

	float add(float x, float y) {
		System.out.println("Addition of two numbers: ");
		return (x + y);

	}

	int add(int x, int y, int z) {
		System.out.println("Addition of three numbers: ");
		return (x + y + z);
	}

	float add(float x, float y, float z) {
		System.out.println("Addition of two numbers: ");
		return (x + y + z);
	}

	public static void main(String args[]) {
		PolymorphismDemo pd1 = new PolymorphismDemo();
		System.out.println("Sum of numbers is " + pd1.add(5, 9));

		PolymorphismDemo pd2 = new PolymorphismDemo();
		System.out.println("Sum of numbers is " + pd2.add(4.5f, 6.5f));

		PolymorphismDemo pd3 = new PolymorphismDemo();
		System.out.println("Sum of numbers is " + pd3.add(15, 20, 66));

		PolymorphismDemo pd4 = new PolymorphismDemo();
		System.out.println("Sum of numbers is " + pd4.add(2.5f, 3.5f, 4.5f));

	}

}
