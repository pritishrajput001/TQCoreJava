package com.customarraylist;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

	public static void main(String args[]) {
		ArrayList<Student> slist = new ArrayList<>();
		slist.add(new Student(101, "Pritish", 89f));
		slist.add(new Student(102, "Suyog", 78f));
		slist.add(new Student(103, "Vivek", 89f));
		slist.add(new Student(104, "Aditya", 76f));
		slist.add(new Student(105, "Dhanashri", 57f));

		for (Student s : slist) {
			System.out.println(s);
		}

		Collections.sort(slist);
		// Collections.reverse(slist);

		System.out.println("================================================");

		for (Student s : slist) {
			System.out.println(s);
		}

		Collections.sort(slist, Collections.reverseOrder());

		System.out.println("================================================");

		for (Student s : slist) {
			System.out.println(s);
		}

	}

}
