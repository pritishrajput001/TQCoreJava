package com.test4;

public abstract class Game {

	abstract void rules();

	public void show() {
		System.out.println("You are in game");

	}

	public Game() {
		System.out.println("Default Game");
	}

}
