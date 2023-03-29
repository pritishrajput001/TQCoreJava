package com.test4;

public class GameTest {
	public static void main(String args[]) {
		Game g1;
		g1 = new FootBall();
		g1.show();
		g1.rules();
		g1 = new BasketBall();
		g1.show();
		g1.rules();
	}

}
