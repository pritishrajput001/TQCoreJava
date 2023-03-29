package com.test4;

//Q12. Write a program to overload and override static method
public class Bike {
	float average;
	String color;
	int speed;
	float cc;

	public void bikeInfo(String color, int speed) {
		this.color = color;
		this.speed = speed;
		System.out.println("Bike details are: Color is  " + color + " and Speed is " + speed);
	}

	public void bikeInfo(float average, int speed, String color) {
		this.average = average;
		this.color = color;
		this.speed = speed;
		System.out.println("Bike details are: Color is " + color + ", Speed is " + speed + " and average is " + average);
	}

}
