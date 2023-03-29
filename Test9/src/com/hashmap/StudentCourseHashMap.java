package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class StudentCourseHashMap {

	public static void createAuthorBookMap(ArrayList<Student> al) {
		HashMap<Course, ArrayList<String>> coursemap = new HashMap<>();

		Iterator<Student> itr = al.iterator();
		ArrayList<String> stdlist;

		while (itr.hasNext()) {
			Student s = itr.next();
			if (!coursemap.containsKey(s.getCourse())) {
				stdlist = new ArrayList<>();
				// booklist.add(b.getBname());
				// authmap.put(b.getAuthor(), booklist);
			} else {
				stdlist = coursemap.get(s.getCourse());
				// booklist.add(b.getBname());
				// authmap.put(b.getAuthor(), booklist);
			}
			stdlist.add(s.getName());
			coursemap.put(s.getCourse(), stdlist);

		}

		for (Map.Entry<Course, ArrayList<String>> en : coursemap.entrySet()) {

			System.out.println(en.getKey());
			System.out.println("Book List:");
			stdlist = en.getValue();
			for (String s : stdlist) {
				System.out.print(s + "  ");
			}
			System.out.println();
			System.out.println("===========================================================");
		}

	}

	public static void main(String args[]) {
		ArrayList<Student> std = new ArrayList<>();

		std.add(new Student(101, "Sagar", 28, new Course(11, "Java")));
		std.add(new Student(102, "Pritish", 23, new Course(12, "Python")));
		std.add(new Student(103, "Gaurav", 26, new Course(22, "DotNet")));
		std.add(new Student(201, "Adinath", 22, new Course(11, "Java")));
		std.add(new Student(202, "Sairaj", 21, new Course(22, "DotNet")));
		std.add(new Student(204, "Sushil", 24, new Course(16, "Core Java")));
		std.add(new Student(208, "Suraj", 25, new Course(16, "Core Java")));
		std.add(new Student(205, "Raj", 24, new Course(16, "Core Java")));

		createAuthorBookMap(std);

	}

}
