package com.test;

import java.util.Scanner;

class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}

	public double getBalance() {
		return balance;
	}

	public void withdraw(double amount) throws NegativeBalanceException {
		if (balance - amount < 0) {
			throw new NegativeBalanceException("Insufficient funds to withdraw " + amount + " Rs.");
		} else {
			balance -= amount;
		}
	}
}

public class Account {
	public Account(String message) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter money");
		double balance = sc.nextDouble();
		BankAccount ba = new BankAccount(500);

		try {
			ba.withdraw(balance);
		} catch (NegativeBalanceException ex) {
			System.out.println(ex.getMessage());
		}

		System.out.println("Remaining balance: " + ba.getBalance());
		sc.close();
	}
}