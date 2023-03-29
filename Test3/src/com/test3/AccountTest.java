package com.test3;

import java.util.Scanner;

public class AccountTest {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Account a1 = new Account();
		System.out.println("Enter id");
		a1.setAccid(sc.nextInt());

	}

}
