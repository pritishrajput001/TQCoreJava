//write java program for switch expression
//is of string type
package com.Assignment;

import java.util.Scanner;

public class SwitchExpression {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day");
		String typeOfDay = sc.next();
		switch (typeOfDay) {
		case "Monday":
			System.out.println("Start of week");
			break;
		case "Tuesday":
		case "Wednesday":
		case "Thursday":
			System.out.println("Mid of week");
			break;
		case "Friday":
			System.out.println("End of work week");
			break;
		case "Saturday":
		case "Sunday":
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Invalid day");
		}

	}

}
