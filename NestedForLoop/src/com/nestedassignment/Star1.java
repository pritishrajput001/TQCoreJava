package com.nestedassignment;

public class Star1 {
	public static void main(String[] args) {
		int row = 7;
		// inner loop
		for (int i = row - 1; i >= 0; i--) {
			// outer loop
			for (int j = 0; j <= i; j++) {
				// prints star and space
				System.out.print("*" + " ");
			}
			// throws the cursor in the next line after printing each line
			System.out.println();
		}
	}
}
