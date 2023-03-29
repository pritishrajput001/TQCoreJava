package com.test3;
//Create a Car class having carid, brand, modelnumber, price, fuel. Create overloaded method to enter car details:

//enterDetails(carid, brand, modelnumber)
//enterDetails(carid, brand, modelnumber, price)
//enterDetails(carid,brand,modelnumber,price,fuel.

public class Employeeee {

	public int eid;
	public String ename;
	public float salary;
	public float exp;
	public float age;
	public String role;

	public void Employeeee(int eid, String ename, float salary, float exp, float age, String role) {

		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.exp = exp;
		this.age = age;
		this.role = role;
	}

	public void Employeeee(String ename, float salary, float exp) {

		this.ename = ename;
		this.salary = salary;
		this.exp = exp;

	}

	public void displayEmployeeee() {
		System.out.println("Employeename:-" + ename + "\nEmployee Salary:-" + salary + "\nEmployee Experience" + exp);
	}

	public void display(int id) {
		System.out.println("Employee ID:-" + eid + "\nEmployeename:-" + ename + "\nEmployee Salary:-" + salary
				+ "\nEmployee Experience" + exp + "\nEmployee Age:-" + age + "\nEmployee Role:-" + role);
	}

	public static void main(String[] args) {
		Employeeee e = new Employeeee();
		Employeeee e1 = new Employeeee();
		e.Employeeee("sagar", 300000.00f, 5.80f);
		e.displayEmployeeee();
		System.out.println("------------------------");
		e1.Employeeee(101, "shree", 25000.00f, 2.0f, 25, "Trainer");
		e1.display(0);
	}
}