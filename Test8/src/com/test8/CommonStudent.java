package com.test8;

import java.util.ArrayList;
import java.util.Collections;

public class CommonStudent {
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
		ArrayList<String> stud1 = new ArrayList<>();

		stud1.add("pritish");
		stud1.add("dhanashri");
		stud1.add("yoges ");
		stud1.add("rahul");

		ArrayList<String> stud2 = new ArrayList<>();

		stud2.add("gaurav");
		stud2.add("pritish");
		stud2.add("dhanashri");
		stud2.add("saurabh");

		commonElements(stud1, stud2);

		Collections.sort(stud1);
		System.out.println(stud1);

	}

}
