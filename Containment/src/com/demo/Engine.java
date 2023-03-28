package com.demo;

public class Engine {
	float price;
	float cubicCapacity;
	String fuelType;

	Engine() {

	}

	Engine(float price, float cubicCapacity) {
		this.price = price;
		this.cubicCapacity = cubicCapacity;

	}

	Engine(float price, float cubicCapacity, String fuelType) {
		this(price, cubicCapacity);
		this.fuelType = fuelType;

	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapicity(float cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public String toString() {
		return "Engine has " + cubicCapacity + " cc also it is" + fuelType + " type and price is" + price;
	}

}
