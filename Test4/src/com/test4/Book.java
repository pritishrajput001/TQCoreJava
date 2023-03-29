package com.test4;

//Q5. Write a program to create a Book class having id, name,price. Create containment of author (id, name, address). 
//Create constructor and getter and setters. Create anonymous author object in book.
public class Book {
	private int id;
	private String name;
	private float price;
	private Author author;
	private String aid;
	private String aname;
	private String address;

	public Book() {

	}

	public Book(int id, String name, float price, Author author) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.author = author;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String toString() {
		return "[Book details are: " + id + " " + name + " " + price + " Author: " + author;
	}

}
