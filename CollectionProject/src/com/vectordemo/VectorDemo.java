package com.vectordemo;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {

		Vector<String> names = new Vector<>(4);
		System.out.println(names.size()); // number of elements
		System.out.println(names.capacity());

		names.addElement("Vaishanvi"); // legacy method
		names.add("Sagar");
		names.add("Rahul");
		names.add("Rohan");

		System.out.println(names.size()); // number of elements
		System.out.println(names.capacity());

		names.add("Omkar");
		System.out.println("////////////////////////");

		System.out.println(names.size()); // number of elements
		System.out.println(names.capacity());// increment 100%

		// specific position element

		System.out.println(names.get(2));

		System.out.println(names.elementAt(2));

		// value
		System.out.println(names);

		System.out.println("Element at 2:" + names.set(2, "Rina")); // return old element

		names.setElementAt("Tejas", 3);

		System.out.println(names);

		System.out.println(names.removeElement("Rina")); // return boolean

		System.out.println(names);

		System.out.println(names.remove("Tejas"));// return boolean

		System.out.println(names);

	}

}