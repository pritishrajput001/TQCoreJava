package com.demo;

public class Person {
	String name;
	String address;
	String addressLine1;
	long pincode;
	long phoneNo;
	Developer developer;

	public Person(String name, String address, String addressLine1, long pincode) {
		this.name = name;
		this.address = address;
		this.addressLine1 = addressLine1;
		this.pincode = pincode;
	}

	public Person(String name, String address, String addressLine1, long pincode, long phoneNo, Developer developer) {
		this(name, address, addressLine1, pincode);
		this.phoneNo = phoneNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public long getPincodel() {
		return pincode;
	}

	public void setPincodel(long pincodel) {
		this.pincode = pincode;
	}

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String toString() {
		return "Person:" + name + "  " + address + " " + addressLine1 + "  " + pincode + " " + phoneNo;
	}

}
