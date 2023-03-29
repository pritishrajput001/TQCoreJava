package com.hashmap2;

//Q9
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class StudentCourseHashMap {

	public static void sortKey(HashMap<Student, Course> map) {
		ArrayList<Student> list = new ArrayList<>(map.keySet());

		// Collections.sort(list);
		Collections.sort(list, Collections.reverseOrder());

		LinkedHashMap<Student, Course> lhm = new LinkedHashMap<>();
		for (Student s : list) {
			lhm.put(s, map.get(s));
		}

		for (Map.Entry<Student, Course> en : lhm.entrySet()) {
			System.out.println(en.getKey() + "  >>" + en.getValue());
		}

	}

	public static void main(String args[]) {
		Course c1 = new Course(1, "Java", 6000);
		Course c2 = new Course(2, "Python", 5000);
		Course c3 = new Course(3, "Angular", 9000);
		Course c4 = new Course(4, "NodeJs", 7000);

		HashMap<Student, Course> smap = new HashMap<>();

		smap.put(new Student(101, "Pritish", 89f), c1);
		smap.put(new Student(102, "Adinath", 89f), c3);
		smap.put(new Student(103, "Sagar", 89f), c2);
		smap.put(new Student(104, "Nikhil", 89f), c4);
		smap.put(new Student(105, "Saurabh", 89f), c1);

		sortKey(smap);
	}

}
