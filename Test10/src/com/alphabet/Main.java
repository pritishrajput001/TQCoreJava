package com.alphabet;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// Create the ArrayList of strings
		ArrayList<String> list = new ArrayList<>();
		list.add("A+2");
		list.add("B+12");
		list.add("D+4");
		list.add("DD+5");

		Map<Character, Integer> map = new HashMap<>();

		for (String str : list) {
			String[] parts = str.split("\\+");
			char alphabet = parts[0].charAt(0);
			int num = Integer.parseInt(parts[1]);

			if (map.containsKey(alphabet)) {
				int oldValue = map.get(alphabet);
				map.put(alphabet, oldValue + num);
			} else {
				map.put(alphabet, num);
			}
		}

		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
}