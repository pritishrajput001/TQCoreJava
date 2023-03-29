package com.hashmap1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ReplaceValue {
	public static void main(String args[]) {

		HashMap<Integer, String> map1 = new HashMap<>();
		map1.put(1, "Angular");
		map1.put(2, "Python");
		map1.put(3, "Java");
		map1.put(4, "Cpp");

		System.out.println(map1);

		Set<Map.Entry<Integer, String>> entrySet = map1.entrySet();

		Iterator<Map.Entry<Integer, String>> itr = entrySet.iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();

			if (entry.getValue().equals("Java"))
				entry.setValue("Core JAVA");

			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
