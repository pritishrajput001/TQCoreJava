package com.demo4mam;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Department:");
		Department d1 = new Department();

		System.out.println("Enter the department id:");
		d1.setDid(sc.nextInt());

		System.out.println("Enter department name:");
		d1.setDname(sc.next());

		System.out.println("Location:");
		d1.setLocation(sc.next());

		Department d2 = new Department();

		System.out.println("Enter the department id:");
		d2.setDid(sc.nextInt());

		System.out.println("Enter department name:");
		d2.setDname(sc.next());

		System.out.println("Location:");
		d2.setLocation(sc.next());

		System.out.println("------Employee--------");

		Employee e1 = new Employee();
		System.out.println("Enter the employee id:");
		e1.setEid(sc.nextInt());

		System.out.println("Enter the employee name:");
		e1.setEname(sc.next());

		System.out.println("Enter salary:");
		e1.setSalary(sc.nextFloat());

		System.out.println("Enter the department id :");
		int deptid = sc.nextInt();
		if (deptid == d1.getDid()) {
			e1.setDept(d1);
		}
		if (deptid == d2.getDid()) {
			e1.setDept(d2);
		}

		System.out.println(e1);

	}

}
