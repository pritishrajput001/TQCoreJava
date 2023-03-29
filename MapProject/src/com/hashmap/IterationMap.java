package com.hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class IterationMap {

	public static void main(String[] args) {

		HashMap<String, Double> smap = new HashMap<>();

		smap.put("Suyog", 99.0);
		smap.put("Bhushan", 78.4);
		smap.put("Aditya", 87.0);
		smap.put("Rohan", 56.4);
		smap.put(null, null);
		smap.put("Shruti", null);

		////
		System.out.println("////////////////////////");
		System.out.println(smap);

		System.out.println("//////////////////////////////////");

		System.out.println("-------------AllKeys--------------------");

		Set<String> keySet = smap.keySet();

		for (String key : keySet) {
			System.out.println(key);
		}

		System.out.println("//////////////////////////////////");

		System.out.println("-------------AllValues--------------------");

		Collection<Double> marks = smap.values();

		for (Double m : marks) {
			System.out.println(m);
		}

		////////////////////////////////////////////////////////////////////////

		System.out.println("//////////////////////////////////");

		System.out.println("-------------KeyValue Pairs--------------------");

		Set<String> keys1 = smap.keySet();
		Iterator<String> itr = keys1.iterator();

		while (itr.hasNext()) {
			String k = itr.next();
			System.out.println(k + "  " + smap.get(k));
		}

		////////////////////////////////////////////////////////////////////////

		System.out.println("//////////////////////////////////");

		System.out.println("-------------KeyValue Pairs--------------------");

		Set<Entry<String, Double>> entrySet = smap.entrySet();

		for (Entry<String, Double> en : entrySet) {
			System.out.println(en.getKey() + "  " + en.getValue());
		}

		//// size of map

		System.out.println("Size:" + smap.size());

		// checks key

		System.out.println(smap.containsKey("Bhushan"));

		// check value

		System.out.println(smap.containsValue(80.6));

		// add if the key is not present

		smap.putIfAbsent("Rohit", 80.6);

		System.out.println(smap);

		smap.putIfAbsent("Rohit", 83.6);

		System.out.println(smap);

		/////////////////// remove

		smap.remove("Rohit");

		System.out.println(smap);

		smap.remove("Suyog", 98.0);// it is not removed

		System.out.println(smap);

		System.out.println(smap.replace("Suyog", 99.0, 98.0)); // returns boolean
		System.out.println(smap);

	}

}