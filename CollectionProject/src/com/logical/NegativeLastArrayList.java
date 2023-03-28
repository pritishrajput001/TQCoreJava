package com.logical;

import java.util.ArrayList;
import java.util.Collections;

public class NegativeLastArrayList {

	public static void main(String args[]) {
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(1);
		list1.add(5);
		list1.add(-3);
		list1.add(-9);
		list1.add(5);
		list1.add(-7);
		list1.add(10);
		list1.add(12);

		System.out.println(list1);

		// sortValue(list1);
		Collections.sort(list1);

		System.out.println(list1);

	}

}
