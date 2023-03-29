package com.hw2;

public class BikeTest {
	public static void main(String args[]) {
		NormalBike nbike = new NormalBike(25, "KTM", 354351f, 5, 12);
		RacingBike rbike = new RacingBike(7802, "Hayabusa", 250000f, 400);

		System.out.println(nbike);
		System.out.println(rbike);
	}

}
