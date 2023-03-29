package com.test3;

public class TestShoppingCart {

	public static void main(String[] args) {

		// Create 5 products
		Items[] products = new Items[5];

		products[0] = new Items("Milk", 2.29);
		products[1] = new Items("Apple", 6.29);
		products[2] = new Items("Bread", 1.99);
		products[3] = new Items("Beef", 9.39);
		products[4] = new Items("Coffee", 4.59);

		// Create a ShoppingCart object
		ShoppingCart cart1 = new ShoppingCart();

		// Add 4 items to the shopping cart
		for (int i = 0; i < 3; i++) {
			cart1.addItem(products[i]);
		}

		System.out.println("Customer 1: " + cart1.getTotalItems() + " items in the shopping cart.");
		System.out.println(ShoppingCart.getTotalCarts() + " customer in the shop.");

		// Create another ShoppingCart object
		ShoppingCart cart2 = new ShoppingCart();

		// Add items to the shopping cart
		for (int i = 0; i < 4; i++) {
			cart2.addItem(products[i]);
		}

		System.out.println("\nCustomer 2: " + cart2.getTotalItems() + " items in the shopping cart.");
		System.out.println(ShoppingCart.getTotalCarts() + " customers in the shop.");

		// Unload all items from a shopping cart
		System.out.println("\nCustomer 1 is checking out.");
		Items[] itemsInCart = cart1.unloadAllItems();
		if (itemsInCart != null) {
			for (Items p : itemsInCart)
				System.out.println("Unloading " + p.getName());
		}
		System.out.println("Customer 1 unloaded all items from the shopping cart.");
		System.out.println("Customer 1: " + cart1.getTotalItems() + " items in the shopping cart.");

		System.out.println(ShoppingCart.getTotalCarts() + " customer in the shop.");

		/* Uncomment the following for Ex.2 */
		// System.out.println("\nList all items in Customer 2's shopping cart:");
		// cart2.listAllItems();

	}

}
