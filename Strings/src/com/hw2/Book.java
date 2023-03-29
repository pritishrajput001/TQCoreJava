package com.hw2;

public class Book {
	private int bId;
	private String bname;
	Author author;

	public Book() {

	}

	public Book(int bId, String bname) {
		this.bId = bId;
		this.bname = bname;

	}

	public Book(int bId, String bname, Author author) {
		this(bId, bname);
		this.author = author;
	}

	public int getBid() {
		return bId;
	}

	public void setBid(int bId) {
		this.bId = bId;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public String toString() {
		return "[Book details: Name= " + bname + ", Book id=" + bId + ", " + author;
	}

}
