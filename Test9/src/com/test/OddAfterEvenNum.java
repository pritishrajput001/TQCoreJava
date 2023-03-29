package com.test;

//Q1. Write a program to shift all odd number after even number in an array.
import java.util.Arrays;

public class OddAfterEvenNum {

	public static void shiftOddAfterEven(int[] arr) {
		int temp;
		int i = 0;
		int j = arr.length - 1;
		while (i < j) {
			while (arr[i] % 2 == 0 && i < j) {
				i++;
			}
			while (arr[j] % 2 != 0 && i < j) {
				j--;
			}
			if (i < j) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

	public static void main(String[] args) {
		int[] arr = { 11, 26, 37, 48, 51, 62, 77, 84, 93 };
		shiftOddAfterEven(arr);
		System.out.println(Arrays.toString(arr));

	}

}
