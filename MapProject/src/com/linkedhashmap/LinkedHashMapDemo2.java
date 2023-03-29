package com.linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo2 {
	
	public static void main(String args[]) {
		LinkedHashMap<String,Double> lmap = new LinkedHashMap<>(10,0.75f,true);
		lmap.put("Pritish",66.5);
		lmap.put("Shubham", 76.4);
		lmap.put("Vivek", 85.4);
		lmap.put("Sagar", 83.5);
		
		for(Map.Entry<String, Double> en: lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
			
		}
		
		System.out.println("-------------------------------------");
		double m=lmap.get("Vivek");
		m=lmap.get("Shubham");
		
		for(Map.Entry<String, Double> en: lmap.entrySet())
		{
			System.out.println(en.getKey()+" "+en.getValue());
			
		}
	}

}
