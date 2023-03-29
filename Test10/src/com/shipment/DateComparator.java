package com.shipment;

import java.util.Comparator;

public class DateComparator implements Comparator<Shipment> {

	public int compare(Shipment s1, Shipment s2) {
		return s1.getMydate().getDate().compareTo(s2.getMydate().getDate());
	}

}