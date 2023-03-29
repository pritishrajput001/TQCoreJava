package com.demo2;

public abstract class OnlineBanking {

	int id;
	String name;

	OnlineBanking() {

	}

	public OnlineBanking(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	abstract void doTranscation(float amount);

}
