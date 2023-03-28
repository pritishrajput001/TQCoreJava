package com.demo;

public class Book {

	private int id;
	private String name;
	private float price;
	private String type;
	Author author;

	public Book(int id, String name, float price, String type, Author author) {
		this.id = id;
		this.name = name;
		this.price = price;
		this.type = type;
		this.author = author;

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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String toString() {
		return "Book details are: " + id + " " + name + " " + " " + price + " " + type;
	}

}
