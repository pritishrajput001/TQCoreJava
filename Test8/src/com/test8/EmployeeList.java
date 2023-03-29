package com.test8;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeList {

	public static void main(String[] args) {

		ArrayList<Employee> list = new ArrayList<>();

		list.add(new Employee(1, "yogesh", 50000f));
		list.add(new Employee(2, "saurabh", 43000f));
		list.add(new Employee(3, "pritish", 80000f));
		list.add(new Employee(5, "rohit", 53000f));
		list.add(new Employee(7, "gaurav", 46000f));
		list.add(new Employee(9, "sagar", 80000f));

		for (Employee e1 : list) {
			System.out.println(e1);
		}
		System.out.println("-----------------------------------------");

		Collections.sort(list, new SalaryCom());
		for (Employee e1 : list) {
			System.out.println(e1);
		}

	}

}