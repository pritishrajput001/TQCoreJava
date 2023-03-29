package com.set;

import java.util.HashSet;
import java.util.Iterator;

public class StudentHashSetDemo {

	public static void main(String args[]) {

		HashSet<Student> hs = new HashSet<>();

		hs.add(new Student(11, "Pritish", 77f));
		hs.add(new Student(22, "Nikhil", 88f));
		hs.add(new Student(33, "Suraj", 74f));
		hs.add(new Student(44, "Sagar", 78f));

		// Override equals and hashcode

		for (Student s : hs) {
			System.out.println(s);
		}

		System.out.println("--------------------------------");

		Iterator<Student> itr = hs.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
