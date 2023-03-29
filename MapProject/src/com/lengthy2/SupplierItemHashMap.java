package com.lengthy2;

import java.util.ArrayList;
import java.util.HashMap;

public class SupplierItemHashMap {

	public static void main(String args[]) {

		ArrayList<Item> list1 = new ArrayList<>();
		list1.add(new Item(11, "Pendrive"));
		list1.add(new Item(22, "HardDisk"));
		list1.add(new Item(33, "Wireless"));
		list1.add(new Item(44, "Mouse"));

		HashMap<Supplier, ArrayList<Item>> hm = new HashMap<>();

		hm.put(new Supplier(501, "Shlok Electronics"), list1);

		ArrayList<Item> list2 = new ArrayList<>();

		list2.add(new Item(21, "SSD"));
		list2.add(new Item(31, "WebCAM"));
		list2.add(new Item(41, "Adaptor"));
		list2.add(new Item(51, "KeyBoard"));

		hm.put(new Supplier(601, "Rohni Electronics"), list2);

	}

}
