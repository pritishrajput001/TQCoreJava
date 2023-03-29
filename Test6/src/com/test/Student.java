package com.test;

public class Student extends Person {
	private int[] testScores;

	public Student(String firstName, String lastName, int id, int[] testScores) {
		super(firstName, lastName, id);
		this.testScores = testScores;
	}

	char calculate() {
		int total = 0;
		for (int testScore : testScores)
			total += testScore;
		int avg = total / testScores.length;
		if (avg >= 90 && avg <= 100)
			return 'O';
		if (avg >= 80 && avg < 90)
			return 'E';
		if (avg >= 70 && avg < 80)
			return 'A';
		if (avg >= 55 && avg < 70)
			return 'P';
		if (avg >= 40 && avg < 55)
			return 'D';
		return 'T';
	}
}