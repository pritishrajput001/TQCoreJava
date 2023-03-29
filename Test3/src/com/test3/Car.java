package com.test3;

import java.util.Scanner;

public class Car {
	int id;
	String brand;
	long modnum;
	float price;
	String fuel;

	public void enterDetails(int id, String brand, long modnum) {

		System.out.println("Car Details are " + id + brand + modnum);

	}

	public void enterDetails(int id, String brand, long modnum, float price) {

		System.out.println("Car Details are " + id + brand + modnum + price);
	}

	public void enterDetails(int id, String brand, long modnum, float price, String fuel) {

		System.out.print("Car details are " + id + brand + modnum + price + fuel);
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Car c1 = new Car();
		System.out.println("Enter car id");
		int id = sc.nextInt();
		System.out.println("Enter car brand");
		String brand = sc.next();
		System.out.println("Enter model number");
		long modnum = sc.nextLong();

		Car c2 = new Car();
		System.out.println("Enter car id");
		int idd = sc.nextInt();
		System.out.println("Enter car brand");
		String brandd = sc.next();
		System.out.println("Enter model number");
		long modnnum = sc.nextLong();
		System.out.println("Enter car price");
		float price = sc.nextFloat();

		Car c3 = new Car();
		System.out.println("Enter car id");
		int iid = sc.nextInt();
		System.out.println("Enter car brand");
		String brrand = sc.next();
		System.out.println("Enter model number");
		long moddnum = sc.nextLong();
		System.out.println("Enter car price");
		float pricce = sc.nextFloat();
		System.out.println("Enter fuel type of car");
		String fuel = sc.next();

		sc.close();
	}

}
