package com.assignmentnested;

public class NumPyramid {
	public static void main(String args[]) {
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");

			}
			for (int k = 1; k <= i; k++) {
				System.out.print(i + " ");

			}
			System.out.println();

		}
	}

}
