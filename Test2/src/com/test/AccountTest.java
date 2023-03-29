package com.test;

public class AccountTest {
	public class StudentTest {
		public static void main(String args[]) {

			Account a1 = new Account(65, 455121, "Pritish", "Yes", "Yes", 987348f);
			a1.getdetails();
			Account a2 = new Account(56, 9876, "Suyog");
			a2.getdetails();
			Student a3 = new Account();
			a3.getdetails();

			System.out.println("====================================");
			System.out.println("Details of all the accounts...");
			System.out.println(a1.toString());
			System.out.println(a2.toString());
			System.out.println(a3.toString());

		}

	}

}
