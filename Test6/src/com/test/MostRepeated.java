package com.test;

public class MostRepeated {

	public static void main(String... strings) {
		String str = "Paris in the the spring.Not that that is related.Why are you laughing? Are my my regular expressions THAT bad??";
		String[] words = str.split("\\s+");
		int finalCount = 0;
		int tempCount = 0;
		String mostlyUsedWord = null;
		for (String word : words) {
			tempCount = 0;
			for (String w : words) {
				if (word.equalsIgnoreCase(w)) {
					tempCount++;
				}
			}
			if (tempCount >= finalCount) {
				finalCount = tempCount;
				mostlyUsedWord = word;
			}
		}
		System.out.println("Most Repeated word: = " + mostlyUsedWord + " ,count:: = " + finalCount);
	}
}