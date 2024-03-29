package com.test;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private float salary;

	Employee() {
		super();
	}

	Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String toString() {
		return "[id: " + id + " name: " + name + " salary: " + salary + "]";
	}

}
