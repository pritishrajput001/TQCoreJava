package com.test4;

public class Manager extends Employee {

	private float exp;
	private float bonus;
	private String pos;

	public Manager() {
		super();
	}

	public Manager(int eid, String name, float salary, float exp, float bonus, String pos) {
		super(eid, name, salary);
		this.exp = exp;
		this.bonus = bonus;
		this.pos = pos;
	}

	public void incrementSalary(float salary) {

		salary = salary + 2000;
		System.out.println("Increment Salary:-" + salary);

	}

	public String toString() {
		return "Manager ID:-" + getEid() + "\nManager Name:-" + getName() + "\nManager Salary " + getSalary()
				+ "\nManager Experience:-" + exp + "\nManager Bonus:- " + bonus + "\nManager Position:-" + pos;
	}

	public static void main(String args[]) {
		System.out.println("-----Manager Details-----");
		Manager m1 = new Manager(101, "Pritish", 89000f, 8f, 9000f, "HR");
		System.out.println(m1);
		m1.incrementSalary(89000f);
		System.out.println("-----Employee Details-----");
		Employee e1 = new Employee(505, "Suyog", 58000f);
		System.out.println(e1);
		m1.incrementSalary(58000f);
	}

}