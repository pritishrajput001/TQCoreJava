package com.treemap;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapIteratorDemo {

	public void main(String args[]) {
		TreeMap<Customer, Order> cmap = new TreeMap<>();
		cmap.put(new Customer(101, "Pritish", 987569), new Order(5, "Pendrive", 780f));
		cmap.put(new Customer(100, "Sagar", 987369), new Order(2, "Laptop", 78000f));
		cmap.put(new Customer(99, "Priya", 796042), new Order(1, "Earphones", 1200f));

		NavigableMap<Customer, Order> nmap = cmap.descendingMap();
		for (Map.Entry<Customer, Order> en : nmap.entrySet()) {
			System.out.println(en.getValue());
			System.out.println(en.getKey());
		}

	}

}
