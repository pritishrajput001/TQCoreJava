//Write a Java program to create Simple Calculator
//using switch case Menu Driven 
package com.Assignment;

import java.util.Scanner;

public class SimpleCalculatorSwitch {

	public static void main(String[] args) {

		char operation;
		Double number1, number2, result;

		Scanner input = new Scanner(System.in);

		System.out.println("Choose an operator: +, -, *,/");
		operation = input.next().charAt(0);

		System.out.println("Enter first number");
		number1 = input.nextDouble();

		System.out.println("Enter second number");
		number2 = input.nextDouble();

		switch (operation) {

		case '+':
			result = number1 + number2;
			System.out.println(number1 + " + " + number2 + " = " + result);
			break;

		case '-':
			result = number1 - number2;
			System.out.println(number1 + " - " + number2 + " = " + result);
			break;

		case '*':
			result = number1 * number2;
			System.out.println(number1 + " * " + number2 + " = " + result);
			break;

		case '/':
			result = number1 / number2;
			System.out.println(number1 + " / " + number2 + " = " + result);
			break;

		default:
			System.out.println("Invalid operator!");
			break;
		}

		input.close();
	}

}
