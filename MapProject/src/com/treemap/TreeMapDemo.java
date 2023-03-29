package com.treemap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {

		TreeMap<Integer, String> map1 = new TreeMap<>();
		// natural order.. asc of key

		map1.put(7, "C");
		map1.put(6, "Python");
		map1.put(4, "Angular");
		map1.put(1, "Java");
		map1.put(8, null);
		map1.put(3, "SpringBoot");
		map1.put(2, "HTML");
		// map1.put(null, "Kotlin"); >> Exception

		for (Map.Entry<Integer, String> en : map1.entrySet()) {
			System.out.println(en.getKey() + "  " + en.getValue());
		}

		// method from Sorted Map

		System.out.println("First key:" + map1.firstKey());
		System.out.println("Last Key:" + map1.lastKey());

		SortedMap<Integer, String> sm = map1.headMap(6); // map less than key 6
		System.out.println(sm);

		SortedMap<Integer, String> sm1 = map1.tailMap(6); // map greater than and equal to key 6
		System.out.println(sm1);

		SortedMap<Integer, String> sm2 = map1.subMap(2, 6); // map including 2 but excluding 6
		System.out.println(sm2);

		System.out.println(map1.keySet());

		// methods of Navigable map

		System.out.println("Lower key: " + map1.higherKey(7)); // strictly less than 7
		System.out.println("Floor key: " + map1.floorKey(7)); // less than or equal to

		System.out.println("Higher key: " + map1.higherKey(7)); // Strictly higher
		System.out.println("Ceiling key: " + map1.ceilingKey(7));// higher or equal to

		SortedMap<Integer, String> sm5 = map1.headMap(6); // map less than key 6
		System.out.println(sm5);

		SortedMap<Integer, String> nm1 = map1.headMap(6, true); // map less than equal to 6
		System.out.println(nm1);

		SortedMap<Integer, String> sm11 = map1.tailMap(6); // map greater than equal to key 6
		System.out.println(sm11);

	}

}
