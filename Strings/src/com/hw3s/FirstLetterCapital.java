package com.hw3s;

public class FirstLetterCapital {

	public static String capitalizeFirstLetter(String input) {
		String[] words = input.split("\\s+");
		StringBuilder output = new StringBuilder();
		for (String word : words) {
			if (!word.isEmpty()) {
				output.append(Character.toUpperCase(word.charAt(0)));
				if (word.length() > 1) {
					output.append(word.substring(1));
				}
			}
			output.append(" ");
		}
		return output.toString().trim();
	}

	public static void main(String[] args) {
		String input = "this is a sample string";
		String output = capitalizeFirstLetter(input);
		System.out.println(output); // Output: This Is A Sample String
	}

}
