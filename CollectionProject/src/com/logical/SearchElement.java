package com.logical;

import java.util.ArrayList;

public class SearchElement {

	public static void search(ArrayList<Integer> list) {
		boolean status = false;
		int val = 55;
		for (Integer i : list) {
			if (i == val) {
				System.out.println("Element found");
				status = true;
				break;
			}
		}

		if (!status) // status==false
		{
			System.out.println("Element not found");
		}

	}

	public static void main(String[] args) {

		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(23);
		list1.add(89);
		list1.add(45);
		list1.add(56);

		search(list1);

	}

}
