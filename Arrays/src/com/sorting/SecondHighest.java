package com.sorting;

import java.util.Arrays;

public class SecondHighest {
	public static void sortArray(int arr[]) {
		int temp;
		int size = arr.length;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j])// ascending
				{
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
		System.out.println("Second Highest:" + arr[size - 2]);
		System.out.println("Second Smallest:" + arr[1]);
	}

	public static void main(String[] args) {
		int myarr[] = { 2, 4, 5, 1, 7, 6 };
		System.out.println("Before sorting:");
		System.out.println(Arrays.toString(myarr));
		sortArray(myarr);

		System.out.println("After sorting:");
		System.out.println(Arrays.toString(myarr));

	}
}
