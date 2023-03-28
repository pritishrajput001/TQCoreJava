package com.demo;

public class Car {
	private int modelid;
	private String brand;
	private double price;
	private String name;

	public Car() {
		System.out.println("indefault constructor");
	}

	public Car(int modelid, String brand, double price, String name) {
		System.out.println("In parameterized constructor1");
		this.modelid = modelid;
		this.brand = brand;
		this.price = price;
		this.name = name;
	}

	public Car(String brand, double price, String name) {
		System.out.println("In parameterized constructor1");
		this.brand = brand;
		this.price = price;
		this.name = name;
	}

	public void display() {
		System.out.println(modelid + " " + brand + " " + price + " " + name + " ");
	}

}
