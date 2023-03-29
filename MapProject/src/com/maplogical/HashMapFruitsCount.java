package com.maplogical;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class HashMapFruitsCount {
	
	public static void occurenceCount(ArrayList<String> list) {
		HashMap<String,Integer> map = new HashMap<>();
		int count;
		for(String st: list)
		{
			count =1;
			if(map.containsKey(st))
			{
				count=map.get(st);
				map.put(st, count++);
			}
			else
				map.put(st, count);
		}
		for(Map.Entry<String, Integer> en  : map.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
		}
	}

	public static void main(String args[]) {
		ArrayList<String> fruits = new ArrayList<>();

		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pinapple");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Mango");
		fruits.add("Apple");
		occurenceCount(fruits);
		

	}

}
