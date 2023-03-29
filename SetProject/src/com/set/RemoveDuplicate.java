package com.set;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {

	public static void main(String args[]) {

		ArrayList<String> al = new ArrayList<>();

		al.add("Pritish");
		al.add("Sagar");
		al.add("Rupali");
		al.add("Vaibhav");
		al.add("SaiRaj");
		al.add("Adinath");
		al.add("Tejas");
		System.out.println(al);

		HashSet<String> hs = new HashSet<>(al);
		System.out.println(hs);

	}

}
