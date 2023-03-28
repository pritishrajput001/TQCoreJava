package com.chaining;

class Employee {
	private String name;
	private int empID;

	// 1st constructor
	public Employee() {
		// default
	}

	// 2nd constructor
	public Employee(String name) {
		this.name = name;
	}

	// 3rd constructor
	public Employee(String name, int empID) { // full parameterized constructor
		this.name = name;
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public int getEmpID() {
		return empID;
	}
}
