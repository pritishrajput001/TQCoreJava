package com.hw2;

public class Child implements Parent1, Parent2 {
	public void display() {
		Parent1.super.display();
		Parent2.super.display();
	}

	public static void main(String args[]) {
		Child c = new Child();
		c.display();
	}

}
