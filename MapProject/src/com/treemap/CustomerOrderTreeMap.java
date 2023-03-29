package com.treemap;

import java.util.NavigableSet;
import java.util.TreeMap;

public class CustomerOrderTreeMap {

	public static void main(String args[]) {

		TreeMap<Customer, Order> cmap = new TreeMap<>();
		cmap.put(new Customer(101, "Pritish", 98345), new Order(5, "Pendrive", 780f));
		cmap.put(new Customer(100, "Sagar", 79845), new Order(2, "Laptop", 78000f));
		cmap.put(new Customer(99, "Saurabh", 98456), new Order(1, "Earphones", 12000f));

		System.out.println(cmap);

		// compareTo calls containskey

		/*
		 * //for custome keys we need to override hashcode and equals HashMap<Customer,
		 * String> hm = new HashMap<>(); hm.put(new Customer(101, "Pritish", 98745),
		 * "Pendrive"); hm.put(new Customer(101, "Pritish", 98456), "Lpatop");
		 * System.out.println(
		 * "--------------------------------------------------------------------------")
		 * ; System.out.println(hm);
		 */

		NavigableSet<Customer> ns = cmap.navigableKeySet();

		for (Customer c : ns) {
			System.out.println("----------------------------");
			System.out.println(c);
			System.out.println(cmap.get(c));
			System.out.println("----------------------------");

		}
		System.out.println("/////////////////////////////////////");

		NavigableSet<Customer> nv = cmap.descendingKeySet();
		for (Customer c : ns) {
			System.out.println("-----------------------------");
			System.out.println(c);
			System.out.println(cmap.get(c));
			System.out.println("-----------------------------");
		}
	}

}
