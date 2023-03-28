package com.stack;

class MyStack {
	int top;
	int size;
	int[] stk;

	MyStack() {

	}

	MyStack(int size) {
		top = -1;
		this.size = size;
		stk = new int[size];
	}

	void push(int data) {
		if (top < size - 1) {
			top++;
			stk[top] = data;
			System.out.println("Element inserted: " + data);
		}
	}
}

public class StackAsArray {

}
