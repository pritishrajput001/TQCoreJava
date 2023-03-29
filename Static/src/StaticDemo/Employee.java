package StaticDemo;

public class Employee {
	int id;
	String name;
	float salary;

	static String company = "Microsoft";
	static int empCount = 0;

	public Employee() {
		empCount++;

	}

	public Employee(int id, String name, float salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
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

	public double getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Employee [eid=" + id + ", ename=" + name + ", salary=" + salary + "]";
	}

}
