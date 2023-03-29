package com.hashmap2;

//Q7
import java.util.ArrayList;

public class EmployeeTest {
	public static void main(String[] args) {

		ArrayList<Employee> employees = new ArrayList<>();

		// Add Employees to ArrayList
		employees.add(new Employee("Vivek", 1, 12000.0));
		employees.add(new Employee("Adinath", 2, 9000.0));
		employees.add(new Employee("Nikhil", 3, 15000.0));
		employees.add(new Employee("Saurabh", 4, 8000.0));

		for (Employee emp : employees) {
			if (emp.getSalary() > 10000) {
				System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getSalary());
			}
		}
	}

}