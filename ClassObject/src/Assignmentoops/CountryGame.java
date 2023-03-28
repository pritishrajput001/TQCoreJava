package Assignmentoops;

import java.util.Scanner;

public class CountryGame {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter country");
		String country = sc.next();
		String game;
		switch (country) {

		case "India":
			game = "Hockey";
			break;

		case "China":
			game = "Table Tennis";
			break;

		case "Bangladesh":
			game = "Kabaddi";
			break;

		case "Italy":
			game = "Foot ball";
			break;

		case "United States":
			game = "Base Ball";
			break;

		default:
			game = "Invalid";

		}
		System.out.println("Game is " + game);

	}

}
