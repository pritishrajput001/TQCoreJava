package com.test3;

public class EmployeeConTest {
	public static void main(String args[]) {

		Department d1 = new Department(777, "BUSINESS", "Pune");
		Department d2 = new Department(555, "Marketing", "Mumbai");
		Department d3 = new Department(666, "HR", "New Mumbai");

		EmployeeCon e1 = new EmployeeCon(11, "Pritish", 77000, 2, 23, "Developer", d3);
		EmployeeCon e2 = new EmployeeCon(22, "Shubham", 55000, 1, 23, "Analyst", d1);
		EmployeeCon e3 = new EmployeeCon(33, "Saurabh", 88000, 3, 24, "Executive", d2);
		EmployeeCon e4 = new EmployeeCon(44, "Yogesh", 125000, 2, 25, "Manager", d3);
		EmployeeCon e5 = new EmployeeCon(55, "Gaurav", 67000, 1, 24, "Marketer", d2);

		System.out.println(e1);
		System.out.println("______________________________________________________");
		System.out.println(e2);
		System.out.println("______________________________________________________");
		System.out.println(e3);
		System.out.println("______________________________________________________");
		System.out.println(e4);
		System.out.println("______________________________________________________");
		System.out.println(e5);

	}

}
