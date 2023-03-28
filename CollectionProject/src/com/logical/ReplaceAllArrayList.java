package com.logical;

import java.util.ArrayList;

public class ReplaceAllArrayList {

	public static void replace(ArrayList<Integer> list) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i) < 40) {
				list.set(i, 40);
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

		replace(list1);

		System.out.println("========================");
		System.out.println(list1);

	}

}
