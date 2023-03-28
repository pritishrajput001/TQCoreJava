package com.logical;

import java.util.ArrayList;

public class ListFrequency {

	public static void countFrequency(ArrayList<String> list) {
		int count;
		for (int i = 0; i < list.size(); i++) {
			count = 1;
			if (list.get(i).equals("visited"))
				continue;
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i).equals(list.get(j))) {
					list.set(j, "visited");
					count++;
				}

			}
		}

	}

	public static void main(String args[]) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("A");

	}

}
