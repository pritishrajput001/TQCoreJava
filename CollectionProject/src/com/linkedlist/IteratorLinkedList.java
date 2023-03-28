package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class IteratorLinkedList {
	public static void main(String args[]) {

		LinkedList<String> llist = new LinkedList<>();
		llist.add("Java");
		llist.add("Python");
		llist.add("Html");
		llist.add("SpringBoot");

		Iterator<String> itr = llist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

		System.out.println("=================================");

		Iterator<String> itr1 = llist.descendingIterator();

		while (itr1.hasNext()) {
			System.out.println("");
		}
		System.out.println("=======================");

		ListIterator<String> litr = llist.listIterator(llist.size());
		while (litr.hasPrevious()) {
			System.out.println(litr.previous());
		}
	}

}
