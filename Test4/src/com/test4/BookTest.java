package com.test4;

public class BookTest {
	public static void main(String args[]) {
		Book b1 = new Book(565, "The India Story", 899f, new Author(33, "Bimal Jalal", "Ahmedbad"));
		Book b2 = new Book(325, "A Place Called Home", 2435f, new Author(45, "Preeti Shenoy", "Trinuri"));
		Book b3 = new Book(769, "Tabahi Ka Badshah", 1399f, new Author(836, "Jivan Saxena", "Guntiran"));

		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);

	}

}
