package com.movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MovieMapTest {

	public static void CreateMovieMap(ArrayList<Movie> mo) {

		HashMap<String, ArrayList<String>> map = new HashMap<>();
		ArrayList<String> movielist;

		for (Movie m : mo) {
			String mName = m.getMoviename();
			if (!map.containsKey(m.getActor())) {
				movielist = new ArrayList<>();

			} else {
				movielist = map.get(m.getActor());

			}
			movielist.add(m.getMoviename());
			map.put(m.getActor(), movielist);
		}
		for (Map.Entry<String, ArrayList<String>> en : map.entrySet()) {
			System.out.println("Movie Name : " + en.getKey());
			System.out.println("--------------------------------------");
			for (String it : en.getValue()) {
				System.out.println(it);
			}
			System.out.println("--------------------------------------");
		}

	}

	public static void createActorNumberMovieMap(ArrayList<Movie> al) {
		HashMap<String, Integer> actmap = new HashMap<>();

		Iterator<Movie> itr = al.iterator();
		int count;
		while (itr.hasNext()) {
			count = 1;
			Movie b = itr.next();
			if (!actmap.containsKey(b.getActor())) {
				actmap.put(b.getActor(), count);
			} else {
				count = actmap.get(b.getActor());
				actmap.put(b.getActor(), count + 1);
			}

		}

		for (Map.Entry<String, Integer> en : actmap.entrySet()) {

			System.out.println(en.getKey() + " :" + en.getValue());

			System.out.println();
			System.out.println("===========================================================");
		}

	}

	public static void main(String[] args) {

		ArrayList<Movie> movie = new ArrayList<>();
		movie.add(new Movie(101, "Khalnayak", "Sanjay Dutt"));
		movie.add(new Movie(102, "Dabaang", "Salman Khan"));
		movie.add(new Movie(103, "Cooli", "Amitabh Bachchan"));
		movie.add(new Movie(103, "Ready", "Salman Khan"));
		movie.add(new Movie(101, "Paa", "Amitabh Bachchan"));
		movie.add(new Movie(101, "Vaastav", "Sanjay Dutt"));
		movie.add(new Movie(802, "Guru", "Amitabh Bachchan"));
		movie.add(new Movie(101, "Wanted", "Salman Khan"));
		movie.add(new Movie(803, "Bhoothnath", "Amitabh Bachchan"));

		CreateMovieMap(movie);
		createActorNumberMovieMap(movie);
	}
}