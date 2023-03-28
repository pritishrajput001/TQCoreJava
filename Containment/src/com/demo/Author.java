package com.demo;

public class Author {
	private int id;
	private String name;
	private String birthDate;

	public Author(int id, String name) {
		this.id = id;
		this.name = name;
		// this.birthDate = birthDate;

	}

	public Author(int id, String name, String birthDate) {
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;

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

	public String getBithhDate() {
		return birthDate;
	}

	public void setBithhDate(String bithhDate) {
		this.birthDate = bithhDate;
	}

	public String toString() {
		return "Author: " + id + " " + name + " " + birthDate;
	}

}
