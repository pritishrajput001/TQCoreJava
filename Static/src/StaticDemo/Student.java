package StaticDemo;

public class Student {
	int id;
	String name;
	float marks;

	static String schoolName = "MPS";
	static int studentCount = 0;

	// instance
	{
		studentCount++;
	}

	public Student() {

	}

	public Student(int id, String name, float marks) {
		this.id = id;
		this.name = name;
		this.marks = marks;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getMarks() {
		return marks;
	}

	public void setMarks(float marks) {
		this.marks = marks;
	}

	public String toString() {
		return "The details are:=>" + " id=>" + id + " name= " + name + " marks=> " + marks;
	}

}
