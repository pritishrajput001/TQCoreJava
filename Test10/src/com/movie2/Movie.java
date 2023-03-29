package com.movie2;

import java.util.ArrayList;
import java.util.List;

public class Movie {
	private int movieId;
	private String movieName;
	private List<String> actors;

	public Movie(int movieId, String movieName, List<String> actors) {
		this.movieId = movieId;
		this.movieName = movieName;
		this.actors = actors;
	}

	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public List<String> getActors() {
		return actors;
	}

	public void setActors(List<String> actors) {
		this.actors = actors;
	}

	public static void main(String[] args) {
		List<String> a = new ArrayList<>();
		a.add("Amitabh Bachchan");
		a.add("Dharmendra");
		a.add("Hema Malini");
		List<String> b = new ArrayList<>();
		a.add("Amitabh Bachchan");
		a.add("Shashi Kapoor");
		a.add("Nirupa Roy");
		List<String> c = new ArrayList<>();
		a.add("Amitabh Bachchan");
		a.add("Farhan Akhtar");
		a.add("Zeeshan Ayyub");
		List<Movie> m = new ArrayList<>();
		m.add(new Movie(1, "Sholay", a));
		m.add(new Movie(2, "Deewar", b));
		m.add(new Movie(3, "Don", c));

		int Count = 0;
		for (Movie movies : m) {
			if (movies.getActors().contains("Amitabh Bachchan")) {
				Count++;
			}
		}

		System.out.println("Amitabh Bachchan has acted in " + Count + " movies.");
	}
}
