package com.test;

import java.util.Scanner;

class UserNum {
	private int num;

	public UserNum(int num) throws NegativeNumberException {
		if (num < 0) {
			throw new NegativeNumberException("Entered number is negative...!");
		} else {
			System.out.println("Entered number is positive...");
		}

		// this.num = num;

	}
}

public class NegativeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = sc.nextInt();
		try {
			UserNum us = new UserNum(num);
		} catch (NegativeNumberException ex) {
			System.out.println(ex.getMessage());
		}
		sc.close();

	}
}