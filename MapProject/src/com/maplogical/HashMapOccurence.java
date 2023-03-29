package com.maplogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapOccurence {

	public static void occurenceMap(ArrayList<String> list) {
		HashMap<String, Integer> map = new HashMap<>();
		int count;

		for (String s : list) {
			count = 1;
			if (map.containsKey(s)) 
			{
				count = map.get(s);
				map.put(s, count + 1);
			} 
			else
				map.put(s, count);
		}
		
		for (Map.Entry<String, Integer> en : map.entrySet()) 
		{
			System.out.println(en.getKey() + " " + en.getValue());
		}
	}

	public static void main(String args[]) {
		ArrayList<String> al = new ArrayList<>();
		al.add("Pritish");
		al.add("Sagar");
		al.add("Suyog");
		al.add("Pritish");
		al.add("Sagar");
		
		occurenceMap(al);
	}
}
