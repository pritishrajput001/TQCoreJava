package com.treemap;

import java.util.Comparator;

public class PriceComparator implements Comparator<Order> {

	public int compare(Order o1, Order o2) {
		return (int) (o2.getPrice() - o1.getPrice());
	}

}
