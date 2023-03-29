package com.demo3;

import java.util.Scanner;

public class SplitString {
	public static void splitMethod(String st) {
		int noOfWords = 0;
		String words[] = st.split(" ");
		for (String w : words) {
			System.out.println(w);
			noOfWords++;
		}
		System.out.println("Number of words:" + noOfWords);

	}

	public static void splitWithoutMethod(String st) {
		String word = "";
		String splitstr[] = new String[20];
		int temp = 0;// to store the index
		st = st + ' ';// to get the last word;

		for (int i = 0; i < st.length(); i++) {
			if (st.charAt(i) != ' ') {
				word = word + st.charAt(i);

			} else// found a space
			{
				// to store the word
				splitstr[temp] = word;
				temp++;
				word = "";
			}

		}
		for (int i = 0; i < temp; i++) {
			System.out.println(splitstr[i]);
		}

		System.out.println("Number of words" + temp);

	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		// splitMethod(str);

		splitWithoutMethod(str);
		sc.close();
	}

}
