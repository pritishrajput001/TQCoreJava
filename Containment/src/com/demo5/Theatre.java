package com.demo5;

public class Theatre {

	private int id;
	private String name;
	private String location;
	Movie movie;

	public Theatre() {

	}

	public Theatre(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;

	}

	public Theatre(int id, String name, String location, Movie movie) {
		this(id, name, location);
		this.movie = movie;
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String toString() {
		return "[Thetare details are " + id + " " + name + " " + location + "]";
	}

}
