package com.test;

public class ShiftEvenOdd {

	public static int[] shiftEvenOdd(int arr[]) {
		int left = 0;
		int right = arr.length;
		for (int i = 0; i < arr.length; i++) {
			while (arr[left] % 2 == 0) {
				left++;
			}
			while (arr[right] % 2 != 0) {
				right--;
			}
			if (left < right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
			}
		}
		return arr;

	}

	public static void main(String args[]) {
		int arr[] = { 12, 15, 14, 55, 93, 70, 58, 8, 3 };
		System.out.println("Original array");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
		arr = shiftEvenOdd(arr);
		System.out.println("Array agter seperating even odd");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " ");
		}
	}

}
