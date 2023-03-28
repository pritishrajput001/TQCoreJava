package com.logical;

import java.util.ArrayList;
import java.util.Collections;

public class SortingIntValues {

	public static void sortValue(ArrayList<Integer> list) {
		Integer temp;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}
			}
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(23);
		list1.add(39);
		list1.add(45);
		list1.add(56);
		list1.add(35);

		System.out.println(list1);

		// sortValue(list1);
		Collections.sort(list1);

		System.out.println(list1);

	}

}
