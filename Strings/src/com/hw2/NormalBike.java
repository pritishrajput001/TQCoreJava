package com.hw2;

public class NormalBike extends Bike {
	private int gear;
	private int seatHeight;

	public NormalBike() {
		super();
	}

	public NormalBike(int modelNo, String brand, float price, int gear, int seatHeight) {
		super(modelNo, brand, price);
		this.gear = gear;
		this.seatHeight = seatHeight;

	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getSeatHeight() {
		return seatHeight;
	}

	public void setSeatHeight(int seatHeight) {
		this.seatHeight = seatHeight;
	}

	public String tostring() {
		return "NormalBike [" + super.toString() + " gear= " + gear + ", setaHeight= " + seatHeight + "]";
	}

}
