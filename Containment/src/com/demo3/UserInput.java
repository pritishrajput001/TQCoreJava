package com.demo3;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Department");

		Department d1 = new Department();
		System.out.println("Enter department id");
		d1.setDepId(sc.nextInt());

		System.out.println("Enter department name");
		d1.setDepName(sc.next());

		System.out.println("Location");
		d1.setLocation(sc.next());

		Department d2 = new Department();
		System.out.println("Enter department id");
		d2.setDepId(sc.nextInt());

		System.out.println("Enter department name");
		d2.setDepName(sc.next());

		System.out.println("Location");
		d2.setLocation(sc.next());

		System.out.println("....___________EMPLOYEE__________...");
		Employee e1 = new Employee();
		System.out.println("Enter employee id");
		e1.setId(sc.nextInt());

		System.out.println("Enter employee name");
		e1.setName(sc.next());

		System.out.println("Enter salary");
		e1.setSalary(sc.nextFloat());

		System.out.println("Enter the department id: ");
		int depId = sc.nextInt();
		if (depId == d1.getDepId()) {
			e1.setDept(d1);

		}
		if (depId == d2.getDepId()) {
			e1.setDept(d2);
		}

	}

}
