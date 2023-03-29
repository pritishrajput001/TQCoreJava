package com.test4;

////Q12. Write a program to overload and override static method
public class HFDelux extends Bike {
	public void bikeInfo(String color, int speed, float cc) {
		this.color = color;
		this.speed = speed;
		this.cc = cc;
		System.out.println("Bike details are: color is " + color + "speed is " + speed + "engine cc is" + cc);
	}

	public static void main(String args[]) {
		HFDelux hf;
		hf = new HFDelux();
		hf.bikeInfo("Red", 180);

		HFDelux hf2;
		hf2 = new HFDelux();
		hf2.bikeInfo(49, 140, "Blue");

		HFDelux hf3;
		hf3 = new HFDelux();
		hf3.bikeInfo("Black ", 150, 119.3f);

	}

}
