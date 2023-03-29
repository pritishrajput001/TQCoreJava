package com.test3;

public class Item {
	private String productName;
	private float quantity;
	private float unitPrice;

	Item() {
		this.productName = "none";
		this.quantity = 0;
		this.unitPrice = 0;
	}

	Item(String ProductName, float quantity, float unitPrice) {
		this.productName = "none";
		this.quantity = 0;
		this.unitPrice = 0;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public float getQuantity() {
		return quantity;
	}

	public void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public float getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(float unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String toString() {
		float totalcost = +quantity * unitPrice;
		return "productName=" + productName + "quantity=" + quantity + " unitPrice=" + unitPrice;
	}

}