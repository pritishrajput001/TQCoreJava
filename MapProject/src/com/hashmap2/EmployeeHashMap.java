package com.hashmap2;

import java.util.HashMap;
import java.util.Map.Entry;

public class EmployeeHashMap {
	public static void main(String args[]) {
		HashMap<Employee, String> emap = new HashMap<>();

		emap.put(new Employee(101, "Saurabh", 87387f), "Softech");
		emap.put(new Employee(102, "Yogesh", 874596f), "Lanncetech");
		emap.put(new Employee(103, "Amit", 84576f), "TechLol");
		emap.put(new Employee(104, "Shubham", 82387f), "BayTech");
		emap.put(new Employee(105, "Arav", 81387f), "Passion");

		for (Entry<Employee, String> e1 : emap.entrySet()) {
			System.out.println(e1.getKey());
		}

	}

}
