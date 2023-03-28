package com.arraylist;

import java.util.ArrayList;

public class MethodsArrayList3 {
	public static void main(String args[]) {
		ArrayList<String> stud = new ArrayList<>();

		stud.add("Pritish");
		stud.add("Yogesh");
		stud.add(null);
		stud.add("Sanket");
		stud.add("Sonai");
		stud.add(null);
		stud.add("Yogesh");

		System.out.println(stud);

		for (int i = 0; i < stud.size(); i++) {
			if (stud.get(i) == ("Yogesh")) {
				stud.remove(i);
			}
		}
		System.out.println(stud);

	}

}
