package com.test;

public class Person {
	protected String firstName;
	protected String lastName;
	protected int id;

	// Constructor
	public Person(String firstName, String lastName, int id) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.id = id;
	}

	// Print person data
	public void printPerson() {
		System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + id);
	}
}