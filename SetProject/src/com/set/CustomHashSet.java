package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class CustomHashSet {

	public static void main(String args[]) {
		LinkedHashSet<Student> hs = new LinkedHashSet<>();

		hs.add(new Student(101, "Pritish", 89f));
		hs.add(new Student(102, "Sagar", 95f));
		hs.add(new Student(103, "Krutika", 86f));
		hs.add(new Student(104, "Saks", 98f));
		hs.add(new Student(104, "Saks", 98f));

		System.out.println(hs);

		Iterator<Student> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
