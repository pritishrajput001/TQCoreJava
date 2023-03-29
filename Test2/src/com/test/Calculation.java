package com.test;

//AnonymousObject 
public class Calculation {
//Declare instance variable. 
	int num1;

//Declaration of one parameter constructor. 
	Calculation(int num2) {
		num1 = num2;
	}

//Declaration of instance methods. 
	void area() {
		int area = num1 * num1;
		System.out.println("Area of square: " + area);
	}

	void perimeter(int num3) {
		int peri = 4 * num3;
		System.out.println("Perimeter of square: " + peri);
	}

	public static void main(String[] args) {
//Create anonymous object. 
		new Calculation(50).area();
		new Calculation(10).perimeter(100);
		new Calculation(20).area();
		new Calculation(30).perimeter(200);
	}
}