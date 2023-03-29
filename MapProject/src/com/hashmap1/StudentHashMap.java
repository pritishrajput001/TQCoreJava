package com.hashmap1;

import java.util.HashMap;
import java.util.Map.Entry;

public class StudentHashMap {

	public static void main(String args[]) {

		HashMap<Student, String> hp1 = new HashMap<>();

		hp1.put(new Student(11, "Pritish", 89.5f), "Java");
		hp1.put(new Student(21, "Shubham", 78.6f), "JavaScript");
		hp1.put(new Student(31, "Pratham", 84.3f), "SAP");
		hp1.put(new Student(41, "Prasanna", 81f), "Python");
		hp1.put(new Student(51, "Yogesh", 77f), "Catia");

		for (Entry<Student, String> h1 : hp1.entrySet()) {
			System.out.println(h1.getKey());
		}
	}

}
