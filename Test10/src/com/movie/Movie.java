package com.movie;

import java.util.Objects;

public class Movie {
	private int movieid;
	private String moviename;
	private String actor;

	public Movie() {

	}

	public Movie(int movieid, String moviename, String actor) {
		super();
		this.movieid = movieid;
		this.moviename = moviename;
		this.actor = actor;
	}

	public int getMovieid() {
		return movieid;
	}

	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}

	public String getMoviename() {
		return moviename;
	}

	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}

	public String getActor() {
		return actor;
	}

	public void setActor(String actor) {
		this.actor = actor;
	}

	@Override
	public int hashCode() {
		return Objects.hash(actor, movieid, moviename);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Movie other = (Movie) obj;
		return Objects.equals(actor, other.actor) && movieid == other.movieid
				&& Objects.equals(moviename, other.moviename);
	}

	@Override
	public String toString() {
		return "Movie [movieid=" + movieid + ", moviename=" + moviename + ", actor=" + actor + "]";
	}

}
