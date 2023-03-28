package com.demo;

import java.util.Scanner;

public class MaxMinArray {

	static void checkMax(int ar[]) {
		int max = ar[0];
		for (int x : ar) {
			if (max < x) {
				max = x;
			}
		}

		System.out.println("Maximum number:" + max);
	}

	static void checkMin(int ar[]) {
		int min = ar[0];
		for (int x : ar) {
			if (min > x) {
				min = x;
			}
		}

		System.out.println("Minimum number:" + min);
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array:");
		int n = sc.nextInt();

		int arr[] = new int[n];
		System.out.println("Enter elements:");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		checkMax(arr);
		checkMin(arr);
		sc.close();

		/*
		 * System.out.println("-------------------------------");
		 * 
		 * for(int i:arr) { System.out.println(i); }
		 */

	}

}
