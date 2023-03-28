package com.arraylist2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeList {
	public static void main(String[] args) {
		ArrayList<Employee> employees = new ArrayList<>();
		employees.add(new Employee(345, "sagar", 15000));
		employees.add(new Employee(464, "bhushan", 8000));
		employees.add(new Employee(364, "suyog", 12000));
		employees.add(new Employee(345, "chinamy", 10000));
		employees.add(new Employee(523, "pritish", 20000));

		Collections.sort(employees, new SalaryComparator());

		Iterator<Employee> iterator = employees.iterator();
		while (iterator.hasNext()) {
			Employee employee = iterator.next();
			if (employee.getSalary() > 10000) {
				System.out.println(employee);
			}
		}
	}
}