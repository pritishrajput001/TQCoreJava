package com.shipment;

public class Shipment {
	private int shipId;
	private String cust_Name;
	private Address address;
	private MyDate mydate;

	public Shipment() {
	}

	public Shipment(int shipId, String cust_Name, Address address, MyDate mydate) {
		super();
		this.shipId = shipId;
		this.cust_Name = cust_Name;
		this.address = address;
		this.mydate = mydate;
	}

	public int getShipId() {
		return shipId;
	}

	public void setShipId(int shipId) {
		this.shipId = shipId;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public MyDate getMydate() {
		return mydate;
	}

	public void setMydate(MyDate mydate) {
		this.mydate = mydate;
	}

	@Override
	public String toString() {
		return "Shipment [shipId=" + shipId + ", cust_Name=" + cust_Name + ", address=" + address + ", mydate=" + mydate
				+ "]";
	}

}