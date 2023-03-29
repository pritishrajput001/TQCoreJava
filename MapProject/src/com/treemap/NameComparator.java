package com.treemap;

import java.util.Comparator;

public class NameComparator implements Comparator<Customer> {

	public int compare(Customer o1, Customer o2) {
		return o1.getName().compareTo(o2.getName());
	}
}
