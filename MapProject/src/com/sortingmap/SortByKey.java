package com.sortingmap;

import java.util.ArrayList;
import java.util.HashMap;

public class SortByKey {

	public static void sortKey(HashMap<Integer, String> map) {
		ArrayList<Integer> list = new ArrayList<>(map.keySet());
	}

	public static void main(String args[]) {
		HashMap<Integer, String> map1 = new HashMap<>();

		map1.put(1, "Java");
		map1.put(7, "c");
		map1.put(6, "Python");
		map1.put(4, "Angular");
		map1.put(3, "SpringBoot");
		map1.put(2, "Html");

	}

}
