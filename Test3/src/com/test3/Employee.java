package com.test3;

public class Employee {
	private int id;
	private String name;
	private float salary;
	private int exp;
	private int age;
	private String role;

	public void display(String name, float salary, int exp) {
		System.out.println("Employee details are: " + id + " " + name + "  " + salary + " " + exp);

	}

	public void display(int id, String name, float salary, int exp, int age, String role) {
		System.out.println(
				"Employee details are: " + id + " " + name + "  " + salary + " " + exp + " " + age + " " + role);
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

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public void display() {
		System.out.println(name + "  " + salary + " " + exp);
	}

}
