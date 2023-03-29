package com.test8;

import java.util.ArrayList;

public class SearchElement {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		list.add("Orange");
		list.add("dhan");
		list.add("blue");
		list.add("yogesh");
		list.add("sanket");

		if (list.contains("dhan")) {
			System.out.println("found element");
		} else {
			System.out.println("not found element");
		}

	}
}