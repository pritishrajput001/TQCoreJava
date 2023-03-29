package com.my;

public class ShoppingMall implements Payment {

	int sid;
	String sname;
	double bill;

	public ShoppingMall() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ShoppingMall(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;

	}

	public void pay(double amount) {
		amount = amount - (0.1 * amount);
		System.out.println(sname);
		System.out.println("Total bill:" + amount);
	}

	public static void main(String[] args) {

		ShoppingMall s1 = new ShoppingMall(1, "Shuruti");
		s1.pay(8000);

	}

}
