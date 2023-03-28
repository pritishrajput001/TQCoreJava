//create 2 objects of Student using new keyword
package Assignmentoops;

public class Student2 {
	int id;
	String name;

	public static void main(String args[]) {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.id = 90;
		s1.name = "Abc";
		s2.id = 65;
		s2.name = "Xyz";
		System.out.println("First student id= " + s1.id + " Name= " + s1.name);
		System.out.println("Second student id= " + s2.id + " Name= " + s2.name);
	}

}
