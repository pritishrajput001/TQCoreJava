package com.constructordemo;

class Car {
	private int modelid;
	private String brand;
	private long price;
	private String name;

	public Car() {
		System.out.println("in default constructor");
	}

	public Car(int modelid, String brand, long price) {
		System.out.println("In parameterized constructor1");
		this.modelid = modelid;
		this.brand = brand;
		this.price = price;
		this.name = name;
	}

	public Car(int modelid, String brand, long price, String name) {
		System.out.println("In parameterized constructor2");
		this.brand = brand;
		this.price = price;
		this.name = name;
	}

	public void display() {
		System.out.println(modelid + " " + brand + " " + price + " " + name + " ");
	}

}
