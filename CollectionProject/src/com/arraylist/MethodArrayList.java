package com.arraylist;

import java.util.ArrayList;

public class MethodArrayList {
	public static void main(String args) {

		ArrayList<String> stud = new ArrayList<>();

		stud.add("Bhushan");
		stud.add("Chinmya");
		stud.add(null);
		stud.add("Chinmya");
		stud.add("krrg");
		stud.add("yogya");
		stud.add(null);

		System.out.println(stud);

		stud.add(2, "Rupali");
		System.out.println("----------------After adding Rupali------------");
		System.out.println(stud);

		stud.add("Sagar");
		System.out.println("----------------After adding Sagar------------");
		System.out.println(stud);

		ArrayList<String> stud1 = new ArrayList<>();
		stud1.add("Uday");
		stud1.add("Pratik");
		stud1.add("Suyog");

		System.out.println(stud1);

		System.out.println("--------After adding collection---------");

		stud.addAll(2, stud1);// specifc pos
		// stud.addAll(stud1); // at end

		System.out.println(stud);

		System.out.println("----------Removing priya-----------");
		stud.remove("Priya"); // removes first occurence

		System.out.println(stud);

		System.out.println("---------Removing collection stud 1-----------");
		stud.removeAll(stud1);

		System.out.println(stud);

		stud.addAll(stud1);

		System.out.println("----------Retains all--------------------");

		stud.retainAll(stud1);

		System.out.println(stud);

		System.out.println("Size:" + stud.size());

		System.out.println("Empty:" + stud.isEmpty());

	}

}
