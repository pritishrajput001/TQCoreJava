package com.test3;

public class Items {
	private String name;
	private double price;
	private int productID;
	private static int total;

	Items(String productName, double itemPrice) {
		name = productName;
		price = itemPrice;
		total++;
		productID = total;
	}

	public String getName() {
		return name;
	}

	public double getPrice() {
		return price;
	}

	public void changePrice(double newPrice) {
		price = newPrice;
	}

	public int getProductID() {
		return productID;
	}

	public static int getTotal() {
		return total;
	}

}
