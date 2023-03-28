package com.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class IteratingArrayList {

	public static void main(String[] args) {

		ArrayList<String> stud = new ArrayList<>();

		stud.add("Pritish");
		stud.add("Chinmay");
		stud.add("Shuruti");
		stud.add("Priya");
		stud.add("Vaishnavi");
		stud.add("Priya");// duplicate allowed
		stud.add("Adinath");

		System.out.println(stud);

		System.out.println("Normal for loop:---------------------------");

		for (int i = 0; i < stud.size(); i++) {
			System.out.println(stud.get(i));
		}

		System.out.println("Enhanced for loop-----------------------------");

		for (String s : stud) {
			System.out.println(s);
		}

		System.out.println("Iterator-----------------------------");

		Iterator<String> itr = stud.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("ListIterator(forward):-------------------------------");

		// forward:

		ListIterator<String> listitr = stud.listIterator();

		while (listitr.hasNext()) {
			System.out.println(listitr.next());
		}

		System.out.println("ListIterator(backward):-------------------------------");

		// forward:

		ListIterator<String> listitr1 = stud.listIterator(stud.size());

		while (listitr1.hasPrevious()) {
			System.out.println(listitr1.previous());
		}

	}

}
