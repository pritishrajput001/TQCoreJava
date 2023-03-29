package com.test4;

class EmployeeChain {
	private String name;
	private int empID;
	private int age;

	// 1st constructor
	public EmployeeChain() {
		// default
	}

	// 2nd constructor
	public EmployeeChain(String name, int age) {
		this.name = name;
		this.age = age;
	}

	// 3rd constructor
	public EmployeeChain(String name, int empID, int age) { // full parameterized constructor
		this(name, age);
		this.empID = empID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpID() {
		return empID;
	}

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String toString() {
		return "Employee details:" + empID + " " + name + " " + age;
	}
}
