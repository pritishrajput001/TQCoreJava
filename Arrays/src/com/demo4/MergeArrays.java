package com.demo4;

import java.util.Scanner;

public class MergeArrays {
	static Scanner sc = new Scanner(System.in);

	public static void enterArray(int ar[]) {
		System.out.println("Enter array elements");
		for (int i = 0; i < ar.length; i++) {
			ar[i] = sc.nextInt();
		}
	}

	public static void printArray(int ar[]) {
		for (int i : ar) {
			System.out.println(i + " ");
		}
		System.out.println();
	}

	public static int[] mergeArray(int ar1[], int ar2[]) {
		int size1 = ar1.length;
		int size2 = ar2.length;

		int mar[] = new int[size1 + size2];

		int k = 0;
		int i, j;
		for (i = 0, j = 0; i < size1 && j < size2; i++, j++) {
			mar[k++] = ar1[i];
			mar[k++] = ar2[j];
		}
		while (i < size1) {
			mar[k++] = ar1[i++];
		}
		while (j < size2) {
			mar[k++] = ar2[j++];
		}
		return mar;
	}

	public static int[] mergeAlternateArray(int ar1[], int ar2[]) {
		int size1 = ar1.length;
		int size2 = ar2.length;
		int mar[] = new int[size1];

		/*
		 * if(size1>size2) { mar= new int[size1]; } else { mar= new int[size2]; }
		 */
		int k;
		int i, j;
		k = 0;

		for (i = 0, j = 0; i < size1; i += 2, j += 2) {
			mar[k] = ar1[i];
			k += 2;
		}

		// System.out.println(Arrays.toString(mar));

		k = 1;
		for (i = 0, j = 1; i < size1; i += 2, j += 2) {
			mar[k] = ar2[j];
			k += 2;
		}

		// System.out.println(Arrays.toString(mar));
		// System.out.println(i);
		// System.out.println(k);
		// remaianing elements

		return mar;

	}

	public static void main(String[] args) {

		System.out.println("Enter size of array:");
		int n1 = sc.nextInt();

		int arr1[] = new int[n1];
		enterArray(arr1);

		int arr2[] = new int[n1];

		enterArray(arr2);

		int marr[] = mergeAlternateArray(arr1, arr2);

		printArray(marr);

	}
}
