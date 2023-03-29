package com.hashtable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {
	
	public static void main(String args[]) {
		Hashtable<Integer,String> hs= new Hashtable<>();
		hs.put(1, "Pritish");
		hs.put(2, "Suyog");
		hs.put(3, "Dhan");
		
		Enumeration<Integer> en=hs.keys();
		while(en.hasMoreElements())
		{
			int key=en.nextElement();
			System.out.println(key+" "+hs.get(key));
		}
		 
		
	}

}
