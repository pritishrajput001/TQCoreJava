package Assignmentoops;

public class Person {
	int aadhar;
	String name;

	Person(int a, String n) {
		aadhar = a;
		name = n;

	}

	Person(Person p) {
		aadhar = p.aadhar;
		name = p.name;

	}

	void display() {
		System.out.println(aadhar + " " + name);
	}

	public static void main(String args[]) {
		Person p1 = new Person(7894, "Neh");
		Person p2 = new Person(p1);
	}

}
