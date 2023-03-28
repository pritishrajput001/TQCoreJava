package com.Assignment;

public class Student22 {
	public int rollno;
	protected int admissionno;
	int age;
	int course;

	public void doPublic() {
		System.out.println("Roll no is public....");
	}

	protected void doProtected() {
		System.out.println("Admission No is protected");
	}

	void doDefault() {
		System.out.println("Age is Default");
	}

	private void doPrivate() {
		System.out.println("Course id is protected");
	}
}
