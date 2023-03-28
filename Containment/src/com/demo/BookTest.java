package com.demo;

public class BookTest {
	public static void main(String args[]) {
		Author a1 = new Author(11, "Babu Boshai", "12 Jan 1956");
		Author a2 = new Author(22, "R.R. Rohini");

		Book b1 = new Book(222, "Special Ops", 788, "Intelligence", a1);
		Book b2 = new Book(323, "The secret ceremony", 999, a2);
		Book b3 = new Book(567, "Khakee Aulad", 1499, "Novel", a1);
		Book b4 = new Book(876, "Red Carpet", 2310, "Stories", a2);
		Book b5 = new Book(457, "The unsung needy", 987, "AutoBiography", a1);

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		System.out.println(b5);

	}

}
