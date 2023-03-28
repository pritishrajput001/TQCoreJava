package com.comparatordem;

import java.util.ArrayList;
import java.util.Collections;

public class StudentList {

	public static void main(String args[]) {

		ArrayList<Student> slist = new ArrayList<>();

		slist.add(new Student(101, "Pritish ", 23, 87f));
		slist.add(new Student(102, "Yogesh", 24, 87f));
		slist.add(new Student(103, "Saurabh", 23, 93f));
		slist.add(new Student(104, "Shubham", 23, 88f));
		slist.add(new Student(105, "Dhan", 22, 94f));

		for (Student s : slist) {
			System.out.println(s);
		}

		Collections.sort(slist, new NameComparator());
		Collections.sort(slist, new MarksComparator());

		System.out.println("=================================");

	}

}
