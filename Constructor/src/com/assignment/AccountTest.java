package com.assignment;

public class AccountTest {
	public static void main(String args[]) {

		Account a1 = new Account(520104650, " Pritish", 6844664);
		a1.display();
		Account a2 = new Account(68476512, "Dhsdvfan", 65486435, 21);
		a2.display();
		Account a3 = new Account(4748991, "iuerg");
		a3.display();
		Account a4 = new Account("lkjard");
		a4.display();
		Account a5 = new Account();
		a5.display();
		Account a6 = new Account(8888888, "ppppppp", 999999999, 23);
		a6.display();
		// Account a7 = new Account(a2);
		// a7.display();
		a2.customername = a3.customername;

	}

}
