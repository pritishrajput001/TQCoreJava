package com.hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EmployeeDepartmentHashMap {

	/*
	 * public static void createDepartmentNumberEmployeeMap(ArrayList<Employee> al)
	 * { HashMap<Department, Integer> deptmap = new HashMap<>();
	 * 
	 * Iterator<Employee> itr = al.iterator(); int count; while (itr.hasNext()) {
	 * count = 1; Employee e = itr.next(); if (!deptmap.containsKey(e.getDept())) {
	 * deptmap.put(e.getDept(), count); } else { count = deptmap.get(e.getDept());
	 * deptmap.put(e.getDept(), count + 1); }
	 * 
	 * }
	 * 
	 * for (Map.Entry<Department, Integer> en : deptmap.entrySet()) {
	 * 
	 * System.out.println(en.getKey().getDname() + " :" + en.getValue());
	 * 
	 * System.out.println(); System.out.println(
	 * "==========================================================="); }
	 * 
	 * }
	 */

	public static void createDepartmentEmployee(ArrayList<Employee> al) {
		HashMap<Department, ArrayList<String>> deptmap = new HashMap<>();

		Iterator<Employee> itr = al.iterator();
		ArrayList<String> emplist;

		while (itr.hasNext()) {
			Employee e = itr.next();
			if (!deptmap.containsKey(e.getDept())) {
				emplist = new ArrayList<>();

			} else {
				emplist = deptmap.get(e.getDept());
			}
			emplist.add(e.getName());
			deptmap.put(e.getDept(), emplist);
		}
		for (Map.Entry<Department, ArrayList<String>> en : deptmap.entrySet()) {
			System.out.println(en.getKey());
			System.out.println("Employee list:");
			emplist = en.getValue();
			for (String s : emplist) {
				System.out.println(s + " ");

			}
			System.out.println();

		}
	}

	public static void main(String args[]) {
		ArrayList<Employee> emp = new ArrayList<>();

		emp.add(new Employee(101, "Pritish", 84299, new Department(11, "HR")));
		emp.add(new Employee(102, "Shivam", 87634, new Department(32, "SALES")));
		emp.add(new Employee(103, "Shubham", 87458, new Department(11, "HR")));
		emp.add(new Employee(104, "Nikhil", 76345, new Department(66, "BUSINESS")));
		emp.add(new Employee(105, "Sanket", 87634, new Department(11, "HR")));
		emp.add(new Employee(106, "Chetan", 97349, new Department(66, "BUSINESS")));
		emp.add(new Employee(107, "Raj", 86345, new Department(21, "MARKETING")));

		// createDepartmentNumberEmployeeMap(emp);
		createDepartmentEmployee(emp);

	}

}
