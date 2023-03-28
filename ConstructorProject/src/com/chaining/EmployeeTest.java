package com.chaining;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		System.out.println("Employee Name: " + e1.getName());
		System.out.println("Employee ID: " + e1.getEmpID());
		Employee e2 = new Employee("Pritish",54664);
		System.out.println("Employee Name: " + e1.getName());
		System.out.println("Employee ID: " + e1.getEmpID());

	}

}
