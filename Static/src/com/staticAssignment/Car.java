package com.staticAssignment;

public class Car {
	private int totalCarSold;
	static private String model;

	static {
		model = "Tata Punch";
		// model = "Car";
	}

	public Car() {
		totalCarSold = 0;
	}

	public Car(int totalCarSold) {
		this.totalCarSold = totalCarSold;
	}

	public String toString() {
		return "No of cars sold are" + totalCarSold + " and car model is" + model + " ";
	}

	public static void main(String args[]) {
		Car c1 = new Car(155);
		Car c2 = new Car(651);
		System.out.println(c1);
		System.out.println(c2);
	}

}
