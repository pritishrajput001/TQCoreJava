package com.demo;

public class Car {
	int carNo;
	String carBrand;
	String carModel;
	Engine engine;

	Car(int carNo, String carBrand) {
		this.carNo = carNo;
		this.carBrand = carBrand;
	}

	Car(int carNo, String carBrand, String carModel, Engine engine) {
		this(carNo, carBrand);
		this.carModel = carModel;

	}

	public int getCarNo() {
		return carNo;
	}

	public void setCarNo(int carNo) {
		this.carNo = carNo;
	}

	public String getCarBrand() {
		return carBrand;
	}

	public void setCarBrand(String carBrand) {
		this.carBrand = carBrand;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public Engine getEngine() {
		return engine;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String toString() {
		return "Car no is" + carNo + " Brand of car is" + carBrand + " Model is" + carModel
				+ " Engine specifications are" + engine;
	}

}
