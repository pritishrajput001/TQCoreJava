package com.hierarchy;

public class RacingBike extends Bike {

	private float speed;

	public RacingBike() {
		super();
	}

	public RacingBike(int modelno, String brand, float price, float speed) {
		super(modelno, brand, price);
		this.speed = speed;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return super.toString() + "RacingBike [speed=" + speed + "]";
	}

}