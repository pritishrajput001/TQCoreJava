package com.hw2;

public class RacingBike extends Bike {
	private float speed;

	public RacingBike() {

	}

	public RacingBike(int modelNo, String brand, float price, float speed) {
		super(modelNo, brand, price);
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
		return "RacingBike [speed=" + speed + "]";
	}

}
