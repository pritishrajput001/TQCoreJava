package com.test8;

import java.util.ArrayList;
import java.util.Iterator;

public class Numbers50 {

	public static void evenNum(ArrayList<Integer> all) {

		for (int i = 1; i <= 50; i++) {
			if ((i) % 2 == 0) {
				System.out.println(i);
			}

		}

	}

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr);
		}
		evenNum(al);
	}

}
