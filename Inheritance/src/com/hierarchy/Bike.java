package com.hierarchy;

public class Bike {

	private int modelno;
	private String brand;
	private float price;

	public Bike() {

	}

	public Bike(int modelno, String brand, float price) {
		this.modelno = modelno;
		this.brand = brand;
		this.price = price;
	}

	public int getModelno() {
		return modelno;
	}

	public void setModelno(int modelno) {
		this.modelno = modelno;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String toString() {
		return "modelno=" + modelno + ", brand=" + brand + ", price=" + price;
	}

}
