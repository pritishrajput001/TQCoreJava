package com.arraylistlogical2;

import java.util.ArrayList;
import java.util.Collections;

public class CommonElements {
	public static void commonElements(ArrayList<String> list1, ArrayList<String> list2) {
		System.out.println(list1);
		System.out.println(list2);

		System.out.println("Common elements are..");
		for (int i = 0; i < list1.size(); i++) {
			if (list2.contains(list1.get(i))) {
				System.out.println(list1.get(i));
			}
		}
	}

	public static void main(String args[]) {
		ArrayList<String> lang1 = new ArrayList<>();

		lang1.add("Java");
		lang1.add("Angular");
		lang1.add("Python");
		lang1.add("C");

		ArrayList<String> lang2 = new ArrayList<>();

		lang2.add("Spring");
		lang2.add("Java");
		lang2.add("Html");
		lang2.add("Angular");

		// commonElements(lang1, lang2);

		Collections.sort(lang1);
		System.out.println(lang1);

	}

}
