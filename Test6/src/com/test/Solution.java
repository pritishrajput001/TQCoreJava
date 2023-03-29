package com.test;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		AdvancedArithmetic myCalculator = new Calculator();
		int sum = myCalculator.divisor_Sum(n);
		System.out.println("I implemented: AdvancedArithmetic\n" + sum);
		sc.close();
	}
}
