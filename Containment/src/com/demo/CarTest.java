package com.demo;

public class CarTest {
	public static void main(String args[]) {

		Engine e1 = new Engine(180000f, 1600.0f, "Diesel");
		Engine e2 = new Engine(14646f, 1496.74f, "Petrol AND Diesel");
		Engine e3 = new Engine(684689f, 1588.56f, "LPG");

		Car c1 = new Car(67, "Mahindra", "Thar", e1);
		Car c2 = new Car(56, "Tata", "TataPunch", e2);
		Car c3 = new Car(88, "Tata", "Tiago", e3);

		c1.setEngine(e1);
		System.out.println(c1);
		System.out.println("=============================================");
		c2.setEngine(e2);
		System.out.println(c2);
		System.out.println("=============================================");
		c3.setEngine(e3);
		System.out.println(c3);
		System.out.println("=============================================");

	}
}
