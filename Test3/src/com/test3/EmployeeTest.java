package com.test3;

public class EmployeeTest {
	public static void main(String args[]) {
		Employee e1 = new Employee();
		e1.display();
		Employee e2 = new Employee();
		e2.display("Suyog", 48000, 5);
		Employee e3 = new Employee();
		e3.display(7, "Pritish", 44000, 4, 23, "Developer");
	}

}
