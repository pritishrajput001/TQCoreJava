package com.demo3;

public enum MovieSeats {
	STANDARD(300), PREMIUM(400), RECLINER(550);

	int price;

	MovieSeats(int price) {
		this.price = price;
	}

}
