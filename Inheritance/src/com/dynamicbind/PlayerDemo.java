package com.dynamicbind;

class Player {
	void display() {
		System.out.println("I am a player");
	}

}

class HockeyPlayer extends Player {
	void display() {
		System.out.println("I am a hockey player");
	}

}

class FootballPlayer extends Player {
	void display() {
		System.out.println("I am a football player");
	}

}

public class PlayerDemo {

	public static void main(String[] args) {

		Player p;

		p = new HockeyPlayer();
		p.display();

		p = new FootballPlayer();
		p.display();

	}

}
