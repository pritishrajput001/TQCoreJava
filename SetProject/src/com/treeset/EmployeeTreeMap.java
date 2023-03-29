package com.treeset;

import java.util.Iterator;
import java.util.TreeMap;

import com.set.Student;

public class EmployeeTreeMap {

	public static void main(String args[]) {

		TreeMap<Employee, String> emp = new TreeMap<>();

		emp.put(new Employee(11, "Pritish", 876348), "HR");
		emp.put(new Employee(133, "Dhanashri", 734869), "Sales Dept");
		emp.put(new Employee(155, "Saurabh", 986985), null);

		for (Employee s : emp) {
			System.out.println(s);
		}

		System.out.println("--------------------------------");

		Iterator<Student> itr = emp.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
