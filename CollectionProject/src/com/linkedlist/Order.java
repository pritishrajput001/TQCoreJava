package com.linkedlist;

public class Order {
	private int id;
	private String customername;
	private String ordername;
	private float price;

	public Order() {

	}

	public Order(int id, String customername, String ordername, float price) {
		super();
		this.id = id;
		this.customername = customername;
		this.ordername = ordername;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", customername=" + customername + ", ordername=" + ordername + ", price=" + price
				+ "]";
	}

}
