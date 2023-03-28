package com.demo;

import java.util.Scanner;

class CITIbank {
	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		BankAccount a1 = new BankAccount();

		System.out.println("Enter the account ID: ");
		a1.setAcid(sc.nextInt());
		System.out.println("Enter the account number");
		a1.setAccountNumber(sc.nextLong());
		System.out.println("Enter the name");
		a1.setName(sc.next());
		System.out.println("Enter the starting balalce");
		a1.setBalance(sc.nextDouble());
		System.out.println("Enter the debit card number");
		a1.setDebitCard(sc.nextLong());

		System.out.println(a1);

		BankAccount a2 = new BankAccount();
		System.out.println(a2);

	}

}
