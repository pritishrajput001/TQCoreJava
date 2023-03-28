package com.diamond;

public interface Radio {
	public static String song = " Lal Dupatta";

	public default void play() {
		System.out.println("The current song is " + song);
	}

}
