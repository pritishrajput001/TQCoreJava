package com.demopoly;

public class TypePromotionDemo {
	static double add(int a, double b) {
		System.out.println("In method 1");
		return (a + b);
	}

	static double add(long l, float b) {
		System.out.println("In method 2");
		return (l + b);
	}

	static double add(float a) {
		System.out.println("In method 3");
		return (a);
	}

	static double add(char a) {
		System.out.println("In method 4");
		return (a);
	}

	public static void main(String args[]) {
		/*
		 * System.out.println(TypePromotionDemo.add(5, 6667));
		 * System.out.println(TypePromotionDemo.add(351365, 5.6f));
		 * System.out.println(TypePromotionDemo.add(8.0f));
		 * System.out.println(TypePromotionDemo.add("p"));8
		 */

	}

}
