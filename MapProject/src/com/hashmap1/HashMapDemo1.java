package com.hashmap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo1 {

	public static void main(String args[]) {
		HashMap<Integer, String> map1 = new HashMap<>();

		map1.put(1, "Java");
		map1.put(2, "c");
		map1.put(3, "Python");
		map1.put(4, "Angular");
		map1.put(5, "Java");
		map1.put(6, "Java");

		Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();

		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());

		}
		/*
		 * not recommended while(itr.hasNext()) {
		 * 
		 * System.out.println(itr.next().getKey()+"  "+itr.next().getValue());
		 * 
		 * 
		 * }
		 */

		System.out.println("////////////////////////////////");

		for (Map.Entry<Integer, String> en : map1.entrySet()) {
			System.out.println(en.getKey() + "  " + en.getValue());
		}
	}

}
