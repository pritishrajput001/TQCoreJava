package com.diamond;

public class Electronics implements Radio, HomeTheatre {
	public void play() {
		Radio.super.play();
		HomeTheatre.super.play();
	}

	public static void main(String args[]) {
		Electronics e1 = new Electronics();
		e1.play();
	}

}
