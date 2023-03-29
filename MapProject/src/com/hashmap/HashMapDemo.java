package com.hashmap;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {

		HashMap<Integer, String> map1 = new HashMap<>();

		System.out.println("Value of 91 key:" + map1.put(91, "India"));

		map1.put(44, "UK");
		map1.put(49, "Germany");
		map1.put(27, "SouthAfrica");

		map1.put(null, "Unknown");
		System.out.println(map1.put(null, "No")); // replaces unknown by no

		System.out.println(map1);

		map1.put(34, null);
		map1.put(65, null);

		System.out.println("Value of 91 key:" + map1.put(91, "Indonesia"));

		System.out.println(map1);

		System.out.println("Value of 49:" + map1.get(49));

		///////////////////////////////////////////////////////////

	}

}
