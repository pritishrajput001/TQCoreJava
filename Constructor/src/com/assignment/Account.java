package com.assignment;

public class Account {
	public int accountno;
	public String customername;
	public long phonno;
	public int age;
	// protected

	public Account() {

		System.out.println("==========================");
		System.out.println("Im in  default");

	}

	public Account(int accountno, String customername, long phonno, int age) {
		this.accountno = accountno;
		this.customername = customername;
		this.phonno = phonno;
		this.age = age;
		System.out.println("==========================");
		System.out.println("Im in  Parameterize constructor 1");

	}

	public Account(int accountno, String customername, long phonno) {
		this.accountno = accountno;
		this.customername = customername;
		this.phonno = phonno;
		System.out.println("==========================");
		System.out.println("Im in  Parameterize constructor 2");

	}

	public Account(int accountno, String customername) {
		this.accountno = accountno;
		this.customername = customername;
		System.out.println("==========================");
		System.out.println("Im in  Parameterize constructor 3");
	}

	public Account(String customername) {
		this.accountno = accountno;
		this.customername = customername;
	}

	void display() {
		System.out.println(accountno + " " + customername + " " + phonno + " " + age);

	}

}
