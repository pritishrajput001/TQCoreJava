package com.demo;

public interface Moveable {// these are abstract

	int speed = 90;// public final static

	// static and instance block not allowed
	/*
	 * static {
	 * 
	 * }
	 * 
	 * {
	 * 
	 * }
	 */

	void move(); // public abstract

}
