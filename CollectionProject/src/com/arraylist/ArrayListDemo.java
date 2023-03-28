package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
	public static void main(String args[]) {
		List list1 = new ArrayList();

		list1.add("Pritish");
		list1.add(98);
		list1.add(45.7f);
		list1.add('d');

		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
	}

}
