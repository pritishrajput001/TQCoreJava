package com.demo3;

public class EmployeeTest {
	public static void main(String args[]) {

		Department d1 = new Department(777, "BUSINESS", "Pune");
		Department d2 = new Department(555, "Marketing", "Mumbai");
		Department d3 = new Department(666, "Hr", "New Mumbai");

		Employee e1 = new Employee(1, "Pritish", 78000f, d1);
		Employee e2 = new Employee(22, "Suyog", 98598f, d1);
		Employee e3 = new Employee(33, "Tejas", 97845f, d2);
		Employee e4 = new Employee(55, "Gaurav", 85339f, d3);

		if (e1.getSalary() > 50000) {
			System.out.println(e1);
		}
		if (e2.getSalary() > 50000) {
			System.out.println(e2);
		}
		if (e3.getSalary() > 50000) {
			System.out.println(e3);
		}
		if (e4.getSalary() > 50000) {
			System.out.println(e4);
		}

	}

}
