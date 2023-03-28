package com.demo4;

import java.util.Arrays;

public class HalfSortArray {
	static void printSort(int[] arr, int n) {
		Arrays.sort(arr);
		for (int i = 0; i < n / 2; i++) {
			System.out.print(arr[i] + " ");
		}
		for (int j = n - 1; j >= n / 2; j--) {
			System.out.print(arr[j] + " ");
		}
	}

	public static void main(String args[]) {
		int[] arr = { 2, 4, 1, 6, 8, 3 };
		int n = arr.length;
		printSort(arr, n);
	}

}
