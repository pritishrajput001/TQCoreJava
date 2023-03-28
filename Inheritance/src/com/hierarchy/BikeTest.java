package com.hierarchy;

public class BikeTest {

	public static void main(String[] args) {

		MountainBike mbike = new MountainBike(1102, "Royal Enfield", 1200000f, 6, 10);
		RacingBike rbike = new RacingBike(7802, "Hayabusa", 250000f, 400);

		System.out.println(mbike);
		System.out.println(rbike);

	}

}
