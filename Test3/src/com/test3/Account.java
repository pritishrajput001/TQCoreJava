package com.test3;

public class Account {
	private int accid;
	private String name;
	private float balance;
	private String bankName;
	private long pancard;

	public Account(int accid, String name, float balance, String bankName, long pancard) {
		this.accid = accid;
		this.name = name;
		this.balance = balance;
		this.bankName = bankName;
		this.pancard = pancard;
	}

	public void Deposit(float balance) {
		if (balance >= 50000) {
			System.out.print("Enter Pan card");
		}
	}

	public void Withdraw(float balance) {
		if (balance >= 500) {
			System.out.println("You can withdraw");
		} else {
			System.out.println("Insufficient balance");
		}
	}

	public int getAccid() {
		return accid;
	}

	public void setAccid(int accid) {
		this.accid = accid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public long getPancard() {
		return pancard;
	}

	public void setPancard(long pancard) {
		this.pancard = pancard;
	}

	public String toString() {
		return "Account details are>> Account id: " + accid + " Account holder name is " + name + " account balance is"
				+ balance + " name of bank is " + bankName + " pancard status is" + pancard;

	}

}
