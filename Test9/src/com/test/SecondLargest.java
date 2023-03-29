package com.test;

//Q2.  Given an array of integers, write a function to find the second largest element in the array.
// #	input: [64,56,3,5,12,44,63,65]
// #	output: 64

public class SecondLargest {

	public static void findSecondLargest(int[] arr) {
		int largest = arr[0];
		int secondLargest = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
			} else if (arr[i] > secondLargest && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		System.out.println("SecondLargest Number:" + secondLargest);

	}

	public static void main(String[] args) {
		int arr[] = { 64, 56, 3, 5, 12, 44, 63, 65 };
		findSecondLargest(arr);
	}
}