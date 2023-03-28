package com.demomam;

public class Parent {
	private int id;
	public String name;
	protected float marks;
	int age;

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	protected float getMarks() {
		return marks;
	}

	protected void setmarks(float marks) {
		this.marks = marks;
	}

	int getAge() {
		return age;
	}

	void setAge(int age) {
		this.age = age;
	}

	public static void main(String args[]) {
		Parent p1 = new Parent();
		p1.setId(9);
		p1.setName("Pritish");
		p1.setmarks(67);
		p1.setAge(23);

		System.out.println(p1.getId() + " " + p1.getName() + " " + p1.getMarks() + " " + p1.getAge());
	}

}
