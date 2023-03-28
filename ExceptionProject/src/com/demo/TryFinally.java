package com.demo;

public class TryFinally {
	public static void main(String args[]) {
		int ar[] = { 4, 5, 7, 0, 3 };
		try {
			for (int i = 0; i < ar.length; i++) {
				ar[i] = ar[i] / ar[i + 1];
				System.out.println(ar[i]);

			}
		} finally {
			System.out.println("Close the array");
		}
	}

}
