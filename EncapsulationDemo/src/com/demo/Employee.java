package com.demo;

class Employee {

	private int empid;
	private String name;
	private double salary;

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getEmpid() {
		return this.empid;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getSalary() {
		return this.salary;
	}

	public static void main(String args[]) {

		Employee e1 = new Employee();
		Employee e2 = new Employee();

		e1.empid = 686;
		e1.name = "KJHWF";
		e1.salary = 15660;

		e2.empid = 939;
		e2.name = "guyrgb";
		e2.salary = 64351;

	}

}
