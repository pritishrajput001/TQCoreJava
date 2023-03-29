package com.treemap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeMap;

public class SortedByValuesTreeMap {

	public static void sortByPrice(TreeMap<Customer, Order> tm) {
		ArrayList<Order> al = new ArrayList<>(tm.values());
		Collections.sort(al, new PriceComparator());
	}

	public static void main(String args[]) {

	}

}
