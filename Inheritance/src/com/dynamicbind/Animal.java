package com.dynamicbind;

class Animal {

	void sound() {
		System.out.println("No sound");
	}

}

class Dog extends Animal {
	void sound() {
		System.out.println("Bark");
	}

}

class Cat extends Animal {
	void sound() {
		System.out.println("Meoww");
	}

}
