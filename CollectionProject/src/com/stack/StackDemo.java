package com.stack;

import java.util.Enumeration;
import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {

		Stack<String> stk = new Stack<>();

		stk.push("Dairy Milk");
		stk.push("5star");
		stk.push("Perk");
		stk.push("Lindt");

		System.out.println(stk);

		System.out.println(stk.peek()); // retrieve element at last

		System.out.println(stk);

		System.out.println(stk.pop()); // retrieve and remove

		System.out.println(stk);

		System.out.println(stk.search("Dairy Milk"));// returns distance from top

		System.out.println(stk.search("Munch"));// if not found return -1

		Enumeration<String> en = stk.elements();

		while (en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}

	}

}
