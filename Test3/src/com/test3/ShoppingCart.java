package com.test3;

import java.util.Scanner;

public class ShoppingCart {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String pName;
		float pPrice, pQuantity;

		Item i1 = new Item();
		System.out.print("Enter the item name: ");
		pName = sc.next();
		i1.setProductName(pName);
		System.out.print("Enter the item price: ");
		pPrice = sc.nextInt();
		i1.setUnitPrice(pPrice);
		System.out.print("Enter the item quantity: ");
		pQuantity = sc.nextInt();
		i1.setQuantity(pQuantity);
		;
		sc.nextLine();
		System.out.println();
		float T = pPrice * pQuantity;
		System.out.println("TOTAL COST=" + T);
	}
}
