package com.demo2;

import java.util.Scanner;

public class AllOccurences {

	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}

	}

	public static void searchArrayPos(int ar[], int value) {
		boolean status = false;

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] == value) {
				status = true;
				System.out.println("Element is present at position:" + i);
			}
		}

		if (!status) {
			System.out.println("Element is  not present");
		}
	}

	public static void main(String[] args) {

		System.out.println("Enter the size:");
		int size = sc.nextInt();

		int myarray[] = new int[size];

		System.out.println("Enter array elements:");
		enterArray(myarray);

		System.out.println("--------------------------");
		System.out.println("Enter the element to be searched:");

		int ele = sc.nextInt();

		searchArrayPos(myarray, ele);

	}

}
