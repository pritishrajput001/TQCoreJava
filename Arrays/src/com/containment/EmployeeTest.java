package com.containment;

public class EmployeeTest {
	public static void deptWise(Employee emp1[], Department dept1[]) {
		for (Department d : dept1) {
			System.out.println("Employees in department:" + d.getDepname());
			for (Employee e : emp1) {
				if (d.getDepname().equals(e.getDept().getDepname()))
					;
				{
					System.out.println(e.getId() + " " + e.getName());
				}

			}
		}
	}

	public static void deptWiseCount(Employee emp1[], Department dept1[]) {
		int count;
		for (Department d : dept1) {
			count = 0;

			for (Employee e : emp1) {
				if (d.getDepname().equals(e.getDept().getDepname())) {
					count++;

				}
			}
			System.out.println("Employees in department " + d.getDepname() + ":" + count);
		}
	}

	public static void salarySort(Employee emp1[]) {
		System.out.println("---------------------------------------");
		for (Employee e1 : emp1) {
			System.out.println(e1.getId() + "" + e1.getName() + "" + e1.getSalary());

		}
		Employee e = new Employee(); // Taken as temporary employee
		for (int i = 0; i < emp1.length; i++) {
			for (int j = i + 1; j < emp1.length; j++) {
				if (emp1[i].getSalary() < emp1[j].getSalary()) {
					e = emp1[i];
					emp1[i] = emp1[j];
					emp1[j] = e;
				}
			}
		}
		System.out.println("----------------------------------------");
		for (Employee e1 : emp1) {
			System.out.println(e1.getId() + "" + e1.getName() + "" + e1.getSalary());

		}
	}

	public static void main(String args[]) {
		Department dept[] = new Department[3];

		dept[0] = new Department(111, "HR");
		dept[1] = new Department(222, "Sales");
		dept[2] = new Department(333, "Technical");

		Employee emp[] = new Employee[6];

		emp[0] = new Employee(1, "Gaurav", 70000f, dept[0]);
		emp[1] = new Employee(2, "Pritish", 78000f, dept[1]);
		emp[2] = new Employee(3, "Saurabh", 67000f, dept[0]);
		emp[3] = new Employee(4, "Dhanashri", 93000f, dept[1]);
		emp[4] = new Employee(5, "Yashank", 88000f, dept[1]);
		emp[5] = new Employee(6, "Gaurav", 86348f, dept[2]);

		deptWise(emp, dept);
		deptWiseCount(emp, dept);
		salarySort(emp);

	}

}
