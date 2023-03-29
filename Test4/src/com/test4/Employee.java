package com.test4;

public class Employee {
	private int eid;
	private String name;
	private float salary;

	public Employee() {

	}

	public Employee(int eid, String name, float salary) {

		this.eid = eid;
		this.name = name;
		this.salary = salary;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
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
		return "Employee Id:-" + eid + "\nEmployee Name:-" + name + "\nEmployee Salary:-" + salary;
	}

}