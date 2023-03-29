package com.hw2;

import java.util.Scanner;

public class NextCharacter {
	public static char nextCharacterInAlphabet(char character, int step) {
		char nextChar;
		int ascii = (int) character;

		if (ascii == 32) // ascii code for a space is 32
			/*
			 * space stays space that separates the different strings seperated by the
			 * spaces
			 */
			nextChar = (char) ascii;
		/*
		 * at ascii 104=h remainder goes to zero so i have to add 104, have to add 104
		 * till ascii=122=z
		 */
		else if ((ascii + step) % 26 >= 0 && (ascii + step) % 26 <= 18) {
			nextChar = (char) (((ascii + step) % 26) + 104);
		} else
			nextChar = (char) (((ascii + step) % 26) + 78);
		/*
		 * first character is the 'a' with ascii value 97. Remainder of 97%26 is 19 so
		 * to come up with 97 you have to add 78 to get the value for a. The same
		 * applies if you increase the number of positions you want the chars to move
		 * forward, have to this till it reaches ascii =104 where the remainder gets to
		 * 0 and have to add 104
		 */
		return nextChar;
	}

	public static void main(String[] args) {

		Scanner inputChars = new Scanner(System.in);

		Scanner inputSteps = new Scanner(System.in);

		StringBuilder sb = new StringBuilder();

		System.out.println("Please enter the characters ");
		String characterString = inputChars.nextLine();

		System.out.println("Please enter the number of positions you want each character to move forward");
		int numberOfMovesForward = inputSteps.nextInt();
		for (char c : characterString.toCharArray()) {
			sb.append(nextCharacterInAlphabet(c, numberOfMovesForward));
		}
		System.out.println(sb.toString());

	}

}
