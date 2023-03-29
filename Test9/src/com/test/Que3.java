package com.test;

//Q3
import java.util.ArrayList;
import java.util.List;

public class Que3 {

	public static void reduceToSingleDigit(List<Integer> list) {
		int sum = 0;

		// Calculate the sum of the input list
		for (int num : list) {
			sum += num;
		}

		// Keep reducing the sum until it's a single digit number
		while (sum > 9) {
			int newSum = 0;
			while (sum > 0) {
				newSum += sum % 10;
				sum /= 10;
			}
			sum = newSum;
		}
		System.out.println(sum);

	}

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		reduceToSingleDigit(list);

	}

}
