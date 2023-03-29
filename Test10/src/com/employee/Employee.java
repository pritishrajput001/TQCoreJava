package com.employee;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Employee {
	private int emp_id;
	private String emp_name;
	private int emp_salary;

	public Employee(int emp_id, String emp_name, int emp_salary) {
		this.emp_id = emp_id;
		this.emp_name = emp_name;
		this.emp_salary = emp_salary;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public int getEmp_salary() {
		return emp_salary;
	}

	public void setEmp_salary(int emp_salary) {
		this.emp_salary = emp_salary;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Employee employee = (Employee) o;
		return emp_salary == employee.emp_salary;
	}

	@Override
	public int hashCode() {
		return Objects.hash(emp_salary);
	}
}

class EmpTest {
	public static void main(String[] args) {
		// Create the hashmap to store employees as keys and strings as values
		Map<Employee, String> employeeMap = new HashMap<>();

		// Add employees to the map
		Employee emp1 = new Employee(11, "Sagar", 98345);
		Employee emp2 = new Employee(13, "Pritish", 87634);
		Employee emp3 = new Employee(12, "Adinath", 98345);

		employeeMap.put(emp1, "Employee 1");
		employeeMap.put(emp2, "Employee 2");
		employeeMap.put(emp3, "Employee 3");

		// Print the contents of the map
		for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
			System.out.println(
					entry.getKey().getEmp_name() + " - " + entry.getKey().getEmp_salary() + " - " + entry.getValue());
		}
	}
}