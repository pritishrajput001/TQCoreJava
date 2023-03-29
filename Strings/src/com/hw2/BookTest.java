package com.hw2;

public class BookTest {
	public static void main(String args[]) {
		Author a1 = new Author(555, "Ravi Bakshi");
		Author a2 = new Author(666, "Ravi Teja");

		Book b1 = new Book(11, "The Indian Citizen", a1);
		Book b2 = new Book(22, "Summer days", a2);
		System.out.println(b1);
		System.out.println(b2);

	}

}
