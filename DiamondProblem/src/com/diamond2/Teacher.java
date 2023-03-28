package com.diamond2;

public interface Teacher {

	default void display() {
		System.out.println("I am teacher");
	}

}
