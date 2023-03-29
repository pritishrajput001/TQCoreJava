// Anonymous Object
package com.test;

class Person {

	public void call() {
		System.out.println("Hello!");
	}

	public void words() {
		System.out.println("How are you");
	}

	public void greet() {
		System.out.println("Good morning");
	}

	class TestAnonymous {
		public static void main(String args) {
			Person pritish = new Person();
			pritish.call();
			pritish.words();
			pritish.greet();
		}
	}

}
