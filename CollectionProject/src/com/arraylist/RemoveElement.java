package com.arraylist;

import java.util.ArrayList;

public class RemoveElement {
	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Pritish");
		list.add("Saurabh");
		list.add("8094");
		list.add("Saksilk");

		System.out.println(list);

		list.remove("8094");
		System.out.println(list);

	}

}
