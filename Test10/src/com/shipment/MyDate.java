package com.shipment;

public class MyDate {
	private String date;

	public MyDate() {
	}

	public MyDate(String date) {
		super();
		this.date = date;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "MyDate [date=" + date + "]";
	}

}