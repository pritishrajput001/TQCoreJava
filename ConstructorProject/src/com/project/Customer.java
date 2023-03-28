package com.project;

public class Customer {
	int customerId;
	String customerName;
	String itemName;
	float itemPrice;
	String status;
	String phoneNo;

	public Customer() {
		System.out.println("In default constructor");

	}

	public Customer(int customerId, String customerName, String phoneNo) {
		System.out.println("In parameterized Constructor");
		this.customerId = customerId;
		this.customerName = customerName;
		this.phoneNo = phoneNo;

	}

	public Customer(int customerId, String customerName, String itemName, float itemPrice, String status,
			String phoneNo) {
		System.out.println("In parameterized Constructor");
		this.customerId = customerId;
		this.customerName = customerName;
		this.itemName = itemName;
		this.itemPrice = itemPrice;
		this.status = status;
		this.phoneNo = phoneNo;

	}

	public int getcustomerId() {
		return customerId;
	}

	public void setcustomerId(int customerName) {
		this.customerId = customerId;
	}

	public String getcustomerName() {
		return customerName;
	}

	public void setcustomerName(String customerName) {
		this.customerName = customerName;
	}

}
