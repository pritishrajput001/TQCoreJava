package com.diff;

public class Equalsdiff {
	int num;

	Equalsdiff(int num) {
		this.num = num;
	}

	public static void main(String args[]) {
		Equalsdiff e1 = new Equalsdiff(7);
		Equalsdiff e2 = e1;

		System.out.println(" first= " + e1);
		System.out.println(" second= " + e2);

		System.out.println("Compairing both.. " + (e1.equals(e2)));
	}

}
