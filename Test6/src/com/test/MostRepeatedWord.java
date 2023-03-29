package com.test;

import java.util.Scanner;

public class MostRepeatedWord {

	public static void findDuplicateWords(String str) {
		int count, maxCount = 0;

		str = str.toLowerCase();
		String[] words = str.split("\\s");
		System.out.println("Duplicate words in a string:");
		for (int i = 0; i < words.length; i++) {
			count = 1;
			if (words[i].equals(" ") || (words[i].equals("visited")))
				continue;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "visited";
				}
			}
			if (count > maxCount) {

				maxCount = count;
				String word = words[i];
				System.out.println(words[i] + ":" + word);
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		findDuplicateWords(str);
		sc.close();

	}
}