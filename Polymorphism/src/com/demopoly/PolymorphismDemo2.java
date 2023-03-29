package com.demopoly;

public class PolymorphismDemo2 {
	int id;
	String name;
	float marks;

	static void enterInfo(int id, String name) {
		System.out.println("in 2 arg");
		System.out.println(id + name);
	}

	static void enterInfo(int id, String name, float marks) {
		System.out.println("in 3 arg");
		System.out.println(id + name + marks);
	}

	static void enterInfo(String name, int id, float marks) {
		System.out.println("in sequnece change");
		System.out.println(name + id + marks);
	}

	public static void main(String args[]) {
		PolymorphismDemo2.enterInfo(21, " Pritish ");
		PolymorphismDemo2.enterInfo(7, " drtu ", 58);
		PolymorphismDemo2.enterInfo(" Dhan ", 10, 88);
	}

}
