package StaticDemo;

public class EmployeeTest {
	public static void main(String args) {
		System.out.println("No of employee" + Employee.empCount);
		Employee e1 = new Employee(84, "Pritish", 72709f);
		System.out.println(e1);
		Employee e2 = new Employee(44, "dghjnm", 56745f);
		System.out.println(e2);
		Employee e3 = new Employee(54, "ftgyhu", 32566f);
		System.out.println(e3);
		Employee e4 = new Employee();
		System.out.println(e4);

		System.out.println("No of employee" + Employee.empCount);

	}

}
