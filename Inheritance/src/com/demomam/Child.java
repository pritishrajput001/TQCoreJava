package com.demomam;

public class Child extends Parent {
	private String school;

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;

	}

	public static void main(String args[]) {
		Child c1 = new Child();
		c1.setName("Omkar");// public
		c1.setMarks(88);// protected
		c1.setAge(10);// default
		c1.setSchool("mps");

	}

	private void setMarks(int i) {
		// TODO Auto-generated method stub

	}

}
