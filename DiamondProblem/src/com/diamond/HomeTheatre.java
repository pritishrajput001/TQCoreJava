package com.diamond;

public interface HomeTheatre {
	public static String song = " Tu jaan E meri Jaan";

	public default void play() {
		System.out.println("Curent song playing in hometheatre is" + song);
	}

}
