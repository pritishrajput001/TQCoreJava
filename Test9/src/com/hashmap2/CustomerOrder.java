package com.hashmap2;

//Q8. Create a hashmap of Customer and Order and sort by ordrer price.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Customer {
	String cname;

	public Customer(String cname) {
		this.cname = cname;
	}

	public String getCname() {
		return cname;
	}
}

class Order {
	int price;

	public Order(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}
}

class OrderComparator implements Comparator<Map.Entry<Customer, Order>> {

	public int compare(Map.Entry<Customer, Order> o1, Map.Entry<Customer, Order> o2) {
		return Integer.compare(o1.getValue().getPrice(), o2.getValue().getPrice());
	}
}

public class CustomerOrder {
	public static void main(String[] args) {
		HashMap<Customer, Order> orders = new HashMap<>();
		orders.put(new Customer("Pritish"), new Order(250));
		orders.put(new Customer("Nikhil"), new Order(180));
		orders.put(new Customer("Sagar"), new Order(1280));
		orders.put(new Customer("Adinath"), new Order(390));

		List<Map.Entry<Customer, Order>> sorted = new ArrayList<>(orders.entrySet());
		Collections.sort(sorted, new OrderComparator());
		for (Map.Entry<Customer, Order> entry : sorted) {
			System.out.println("Name= " + entry.getKey().getCname() + " order price= " + entry.getValue().getPrice());
		}
	}

}
