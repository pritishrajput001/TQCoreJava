package com.hw3s;

import java.util.Scanner;

public class CountDuplicate {
	
	public static void countDuplicate(String str1) {
		System.out.println(str1);
		str1 = str1.toLowerCase();
		char ch[] = str1.toCharArray();
		int count = 0;
		int dcount = 0;
		for (int i = 0; i < ch.length; i++) {
			count = 1;
			if (ch[i] == ' ' || ch[i] == '\0')
				continue;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
					ch[j] = '\0';

				}

			}
			if (count > 1) {

				dcount++;
				System.out.println(ch[i] + ": " + count);
			}

		}
		System.out.println("number of duplicate char:" + dcount);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String : ");
		String str =sc.nextLine();
		countDuplicate(str);
	}
}
