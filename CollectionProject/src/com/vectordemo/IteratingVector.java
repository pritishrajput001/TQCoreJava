package com.vectordemo;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class IteratingVector {

	public static void main(String args[]) {
		Vector<String> names = new Vector<>();

		System.out.println(names.size()); // no of elements

		System.out.println(names.capacity());

		names.addElement("Pritish"); // legacy method
		names.add("Vaishnavi");
		names.add("Sagar");
		names.add("Rohan");
		names.add("Sairaj");
		names.add("Adinath");

		System.out.println(names);
		System.out.println("--------------------------");

		Iterator<String> itr = names.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.hasNext());

		}
		System.out.println("======================");

		ListIterator<String> litr = names.listIterator(names.size());

		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}

		System.out.println("--------------------");

		Enumeration<String> en = names.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
	}

}
