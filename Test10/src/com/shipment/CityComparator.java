package com.shipment;

import java.util.Comparator;

public class CityComparator implements Comparator<Shipment> {

	@Override
	public int compare(Shipment s1, Shipment s2) {
		return s1.getAddress().getCity().compareTo(s2.getAddress().getCity());
	}

}