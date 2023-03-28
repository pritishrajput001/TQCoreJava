package com.innerclass;

class Bank {
	private static String bankName = "SBI";
	String bankLocation;
	int regNo;
	{
		bankLocation = "Delhi";
		regNo = 7890;
	}

	void displayDetails() {
		System.out.println(bankName + " " + bankLocation + " " + regNo);
	}

	class Locker {
		int lockerId;
		String custName;
		static int LockerRent = 2500;

		public void enterDetails(int id, String name) {
			lockerId = id;
			custName = name;
			System.out.println("The locker:" + lockerId + " belongs to " + custName + " int the bank " + bankName);
		}
	}
}

public class SimpleInnerClass {
	public static void main(String args[]) {
		Bank bank1 = new Bank();
		Bank.Locker locker1 = bank1.new Locker();
		locker1.enterDetails(1, "Pritish");

		Bank.Locker locker2 = new Bank().new Locker();
		locker2.enterDetails(2, "Yogesh");

		System.out.println("----------------------");

	}

}
