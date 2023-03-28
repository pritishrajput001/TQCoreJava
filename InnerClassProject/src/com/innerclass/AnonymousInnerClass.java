package com.innerclass;

interface Doable {
	public void doIt();
}

class Car {
	public void Drive() {
		System.out.println("I am driving");
	}
}

abstract class Cake {
	void doBaking() {
		System.out.println("I am baking");
	}
}

public class AnonymousInnerClass {
	public static void main(String args[]) {
		Doable d = new Doable() {
			@override
			public void doIt() {
				System.out.println("I am doing");
			}
		};
		d.doIt();

		Car c1 = new Car() {
			public void drive() {
				System.out.println("I am driving bmw car");

			}
		};
		c1.Drive();
		Cake ck = new Cake() {

			void doBaking() {
				System.out.println("I am baking cake");
			}
		};
		ck.doBaking();
	}

}
