package com.test8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ConversionArrayList {

	public static void main(String args[]) {
		String subjects[] = { "English", "Maths", "Computers", "Science" };

		List<String> sub = Arrays.asList(subjects);

		System.out.println(sub);

		List<String> sub1 = new ArrayList(Arrays.asList(subjects));
		System.out.println(sub1);

		ArrayList<String> sub3 = new ArrayList<>();
		Collections.addAll(sub3, subjects);

		System.out.println(sub3);
	}
}
