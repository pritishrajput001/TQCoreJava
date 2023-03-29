package com.hw2;

public class Bike {
	private int modelNo;
	private String brand;
	private float price;

	public Bike() {

	}

	public Bike(int modelNo, String brand, float price) {
		this.modelNo = modelNo;
		this.brand = brand;
		this.price = price;
	}

	public int getModelNo() {
		return modelNo;
	}

	public void setModelNo(int modelNo) {
		this.modelNo = modelNo;
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

	@Override
	public String toString() {
		return "Bike modelNo=" + modelNo + ", brand=" + brand + ", price=" + price + "]";
	}

}
