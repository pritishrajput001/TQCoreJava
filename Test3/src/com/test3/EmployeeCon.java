package com.test3;

public class EmployeeCon {
	private int id;
	private String name;
	private float salary;
	private int exp;
	private int age;
	private String role;
	Department dept;

	public EmployeeCon() {

	}

	public EmployeeCon(int id, String name, float salary, int exp, int age, String role, Department dept) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.exp = exp;
		this.age = age;
		this.role = role;
		this.dept = dept;
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

	public void setDept(Department dept) {
		this.dept = dept;
	}

	public String toString() {
		return "Employee details:  Employee id is " + id + " Employee name is " + name + " salary of employee is  "
				+ salary + " experience " + exp + " age is  " + age + " role is " + role + " department " + dept;
	}

}