package com.logical;

import java.util.ArrayList;
import java.util.Collections;

public class StringSort {
	public static void sortString(ArrayList<String> list) {
		String temp;
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (phones.get(i) > list.get(j)) {
					temp = list.get(i);
					list.set(i, list.get(j));
					list.set(j, temp);
				}

			}
		}

	}

	public static void main(String args[]) {
		ArrayList<String> phones = new ArrayList<>();
		phones.add("Samsung");
		phones.add("Xiaomi");
		phones.add("Realme");
		phones.add("Redmi");
		phones.add("Apple");
		phones.add("Micromax");

		System.out.println(phones);
		Collections.sortString(phones);

		System.out.println(phones);

	}

}
