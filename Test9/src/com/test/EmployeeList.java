package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList<Employee> emp = new ArrayList<>();

		emp.add(new Employee(1, "yogesh", 50000f));
		emp.add(new Employee(2, "saurabh", 43000f));
		emp.add(new Employee(3, "pritish", 80000f));
		emp.add(new Employee(5, "rohit", 53000f));
		emp.add(new Employee(7, "gaurav", 46000f));
		emp.add(new Employee(9, "sagar", 80000f));

		for (Employee e1 : emp) {
			System.out.println(e1);
		}
		System.out.println("-----------------------------------------");

		Collections.sort(emp, new SalaryCom());
		Iterator<Employee> iterator = new emp.iterator();
		while(iterator.hasNext())
		{
			Employee emp = iterator.next();
			if
		}
		
	}

}
