package com.test;

import java.util.Scanner;

public class Account {
	int id;
	long accountNo;
	String name;
	String pancard;
	String debit;
	float balance;

	public Account(int id, long accountNo, String name, String pancard, String debit, float balance) {
		this.id = id;
		this.accountNo = accountNo;
		this.name = name;
		this.pancard = pancard;
		this.debit = debit;
		this.balance = balance;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

	public String getDebit() {
		return debit;
	}

	public void setDebit(String debit) {
		this.debit = debit;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "The details are:=>" + " id=>" + id + " accountNo=> " + accountNo + " name=> " + name + " pancard ="
				+ pancard + " debitcard =>" + debit + " balance= " + balance;
	}

	public void getdetails() {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Details for 1st student=>");
		System.out.println("Enter student id: ");
		this.id = sc.nextInt();
		System.out.println("Enter student name: ");
		this.accountNo = sc.nextLong();

		System.out.println("Enter student marks: ");
		this.name = sc.next();
		System.out.println("Enter student marks: ");
		this.pancard = sc.next();
		System.out.println("Enter student marks: ");
		this.debit = sc.next();
		System.out.println("Enter student marks: ");
		this.balance = sc.nextFloat();

	}

}
