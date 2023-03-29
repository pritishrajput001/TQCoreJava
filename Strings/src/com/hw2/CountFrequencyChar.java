package com.hw2;

import java.util.Scanner;

public class CountFrequencyChar {
	public static void countFrequency(String str) {
		System.out.println(str);
		str = str.toLowerCase();
		int count;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if ((ch[i] == ' ') || ch[i] == '\0')
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';
				}
			}
			System.out.println(ch[i] + ":" + count);

		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		countFrequency(s1);
		sc.close();
	}

}
