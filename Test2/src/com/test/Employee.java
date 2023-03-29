package com.test;

public class Employee {
	public int id;
	public String name;
	public double salary;
	public int age;
	public int experience;

	public Employee() {
		System.out.println("In Deafault");

	}

	public Employee(int id, String name, double salary, int age) {
		this.experience = 0;

	}

	public Employee(int id, String name, double salary) {

	}

	public void display() {

		System.out.println("Employee id is: " + id + "Employee name is: " + name + "Employee salary is: " + salary
				+ "Age of employee is: " + age + "Employee has experience :" + experience);
		System.out.println("================================================");
	}

	public Employee(int id, String name, double salary, int age, int experience) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.age = age;
		this.experience = experience;

	}

}
