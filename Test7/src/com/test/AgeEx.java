package com.test;

import java.util.Scanner;

class User {
	private int age;

	public User(int age) throws InvalidVotingAgeException {
		if (age < 18) {
			throw new InvalidVotingAgeException("Age is less than 18, You can not vote...");
		} else {
			System.out.println("You can vote......");
		}

		this.age = age;

	}
}

public class AgeEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try {
			User us = new User(age);
		} catch (InvalidVotingAgeException ex) {
			System.out.println(ex.getMessage());
		}
		sc.close();

	}
}