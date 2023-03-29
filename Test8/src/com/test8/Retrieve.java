package com.test8;

import java.util.ArrayList;

//Write a Java program to retrieve an element (at a specified index) from a given array list
public class Retrieve {

	public static void main(String[] args) {

		ArrayList<Integer> al = new ArrayList<>();

		al.add(1);
		al.add(20);
		al.add(12);
		al.add(21);
		al.add(11);

		System.out.println(al.get(3));
		System.out.println(al.get(0));

	}

}