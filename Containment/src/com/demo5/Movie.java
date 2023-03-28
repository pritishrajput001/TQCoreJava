package com.demo5;

public class Movie {

	private int id;
	private String name;
	private String relsDate;
	static int movieCount = 0;

	public Movie() {
		movieCount++;
	}

	public Movie(int id, String name, String relsDate) {
		this.id = id;
		this.name = name;
		this.relsDate = relsDate;
	}

	public Movie(int id, String name) {
		this.id = id;
		this.name = name;

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

	public String getRelsDate() {
		return relsDate;
	}

	public void setRelsDate(String relsDate) {
		this.relsDate = relsDate;
	}

	public String toString() {
		return "[Movie details are: " + id + " " + name + " " + relsDate + "]";
	}

}
