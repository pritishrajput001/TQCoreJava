package com.hw2;

abstract class Animal {

	abstract void makeSound();

	public void eat() {
		System.out.println("Dog is eating.");
	}
}

class Dog extends Animal {

	public void makeSound() {
		System.out.println("Barking");
	}
}

class Main {
	public static void main(String[] args) {

		Dog d1 = new Dog();

		d1.makeSound();
		d1.eat();
	}
}
