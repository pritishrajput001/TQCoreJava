package com.demopoly;

public class Cirlce {
	static void area(float radius) {
		System.out.println("Area of circle is " + 3.14 * radius * radius);
	}

	static void area(int side) {
		System.out.println("Area of square is " + side * side);
	}

	static void area(int length, float breadth) {
		System.out.println("Area of rectangle is " + length * breadth);
	}

	static void area(float base, int height) {
		System.out.println("Area of triangle is " + (1 / 2) * base * height);
	}

	public static void main(String args[]) {
		Cirlce.area(5.8f);
		Cirlce.area(5);
		Cirlce.area(10, 9.8f);
		Cirlce.area(5.3f, 5);
	}
}
