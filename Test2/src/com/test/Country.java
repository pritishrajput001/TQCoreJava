package com.test;

import java.util.Scanner;

public class Country {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the country");
		String country = sc.next();
		switch (country) {
		case "India":
			System.out.println("Capital is Delhi");
			System.out.println("Area is Asia");
			System.out.println("Pin code 15216");
			break;

		case "Portugal":
			System.out.println("Capital is Lisbon");
			System.out.println("Area is Europe");
			System.out.println("Pin code 54611");
			break;

		case "Srilanka":
			System.out.println("Capital is Kolombo");
			System.out.println("Area is Asia");
			System.out.println("Pin code 36146");
			break;

		case "Japan":
			System.out.println("Capital is Tokyo");
			System.out.println("Area is Asia");
			System.out.println("Pin code 23651");
			break;

		case "Aregentina":
			System.out.println("Capital is Buenos Airse");
			System.out.println("Area is Europe");
			System.out.println("Pin code 68921");
			break;

		case "Italy":
			System.out.println("Capital is Rome");
			System.out.println("Area is Europe");
			System.out.println("Pin code 68754");
			break;

		case "Russia":
			System.out.println("Capital is Moscow");
			System.out.println("Area is Russia");
			System.out.println("Pin code 43532");
			break;

		case "Spain":
			System.out.println("Capital is Madrid");
			System.out.println("Area is Europe");
			System.out.println("Pin code 56532");
			break;

		case "Taiwan":
			System.out.println("Capital is Taipei");
			System.out.println("Area is Asia");
			System.out.println("Pin code 59068");
			break;

		case "Poland":
			System.out.println("Capital is Wrsaw");
			System.out.println("Area is Europe");
			System.out.println("Pin code 24412");
			break;

		default:
			System.out.println("Info not available");
		}

	}

}
