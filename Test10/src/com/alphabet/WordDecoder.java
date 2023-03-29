package com.alphabet;

import java.util.Arrays;
import java.util.Scanner;

public class WordDecoder {
	public static int[] calculatePotentials(String[] words) {
		int[] potentials = new int[words.length];

		for (int i = 0; i < words.length; i++) {
			String word = words[i].toUpperCase();
			int potential = 0;
			for (int j = 0; j < word.length(); j++) {
				potential += word.charAt(j) - 'A' + 1;
			}
			potentials[i] = potential;
		}

		return potentials;
	}

	public static String getWordWithPotential(String[] words, int potential) {
		for (String word : words) {
			String upperCaseWord = word.toUpperCase();
			int wordPotential = 0;
			for (int j = 0; j < upperCaseWord.length(); j++) {
				wordPotential += upperCaseWord.charAt(j) - 'A' + 1;
			}
			if (wordPotential == potential) {
				return word;
			}
		}
		return "";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String s = sc.nextLine();

		String[] words = s.split("\\s+");
		int[] potentials = calculatePotentials(words);

		Arrays.sort(potentials);

		System.out.println("Words in ascending order of potential:");
		for (int potential : potentials) {
			String word = getWordWithPotential(words, potential);
			System.out.println(word);
		}
	}

}
