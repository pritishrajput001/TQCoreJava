package com.innerclass;

class Mall {
	private String mallName = "Pacific";
	private String location = "Pune";

	void doShopping() {
		class Cart {
			String item;
			float price;
			static float bill = 0.0f;

			public void addBill(String item, float price) {
				this.item = item;
				this.price = price;
				System.out.println(this.item + " " + this.price);
				bill += price;
			}

			public void diaplayBill() {
				System.out.println("-----------------------");
				System.out.println("ShoppingMall: " + mallName);
				System.out.println("Total bill: " + bill);
			}
		}
		Cart c1 = new Cart();
		c1.addBill("Phone", 20200.5f);
		c1.addBill("Charger", 8934.6f);
		c1.addBill("Memory card", 789.4f);
		c1.diaplayBill();
	}
}

public class LocalInnerClass {
	public static void main(String args[]) {
		Mall m1 = new Mall();
		m1.doShopping();
	}

}
