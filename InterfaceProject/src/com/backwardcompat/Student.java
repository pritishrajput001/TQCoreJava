package com.backwardcompat;

public interface Student {

	void addStudent();

	default void payFees(double amount) {
		System.out.println("Fees paid");
	}

	static void scholars() {
		System.out.println("I am scholar");
	}

	private void display() {
		System.out.println("I am student");
	}

}
