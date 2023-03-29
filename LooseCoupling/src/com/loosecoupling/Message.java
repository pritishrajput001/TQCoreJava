package com.loosecoupling;

class Whatsapp implements MessageService {
	String msg;

	public void displayMsg(String msg) {
		System.out.println("Whatsapp msg:" + msg);
	}

}

class Facebook implements MessageService {
	String msg;

	public void displayMsg(String msg) {
		System.out.println("Facebook msg:" + msg);
	}

}

class Instagram implements MessageService {
	String msg;

	public void displayMsg(String msg) {
		System.out.println("Instagram msg:" + msg);
	}

}

public class Message {

	public void getMessage(Whatsapp m, String msg) {
		m.displayMsg(msg);
	}

	public static void main(String[] args) {

		Whatsapp w1 = new Whatsapp();

		Message m = new Message();
		m.getMessage(w1, "Hello");

	}

}
