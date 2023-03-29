package com.test8;

import java.util.ArrayList;
import java.util.Iterator;

public class ColourA {

	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<>();

		al.add("red");
		al.add("green");
		al.add("blue");
		al.add("white");

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
