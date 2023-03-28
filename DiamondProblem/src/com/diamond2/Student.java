package com.diamond2;

public interface Student {
	default void display() {
		System.out.println("I am Student");
	}

}
