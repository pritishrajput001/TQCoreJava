package com.demo3;

import java.util.Arrays;

public class FrequencyOfWords {
	public static void frequencyOfWords(String str) {
		str = str.toLowerCase();
		String words[] = str.split(" ");
		int count;

		for (int i = 0; i < words.length; i++) {
			if (words[i].equals("visited"))
				continue;
			count = 1;
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(words[j])) {
					count++;
					words[j] = "Visited";

				}
			}
			System.out.println(words[i] + ":" + count);
		}
	}

	public static void splitWords1(String str) {
		str = str.toLowerCase();
		String lines[] = str.split("\\.");
		System.out.println(Arrays.toString(lines));
		String words[] = null;
		String splitstr[] = new String[15];
		int temp = 0;
		for (int i = 0; i < lines.length; i++) {
			words = lines[i].split(" ");
			System.out.println(Arrays.toString(words));

			for (int j = 0; j < words.length; j++) {
				splitstr[temp++] = words[j];

			}
		}
		System.out.println(Arrays.toString(splitstr));
		for (int k = 0; k < temp; k++) {
			System.out.println(splitstr[k]);
		}
	}

	public static void main(String args[]) {
		String s1 = ("Java is a program. We code logics in java.Code is important");
		splitWords1(s1);
	}

}
