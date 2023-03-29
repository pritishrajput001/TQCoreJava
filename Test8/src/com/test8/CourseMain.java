package com.test8;

public class CourseMain {
	public static void main(String[] args) {

		Student[] names = new Student[10];
		names[0] = new Student(1, "sagar", false, new Course("java", 40000));
		names[1] = new Student(2, "pritish", false, new Course("python", 55000));
		names[2] = new Student(3, "bhushan", false, new Course("c", 60000));
		names[3] = new Student(4, "omkar", false, new Course("c sharp", 35000));
		names[4] = new Student(5, "tejas", false, new Course("dotnet", 45000));
		names[5] = new Student(6, "vivek", false, new Course("cloud computing", 70000));
		names[6] = new Student(7, "suyog", false, new Course("networking", 80000));
		names[7] = new Student(8, "yashank", false, new Course("data science", 50000));
		names[8] = new Student(9, "gaurav", false, new Course("devops", 20000));
		names[9] = new Student(10, "raju", false, new Course("cyber security", 30000));

		for (Student s1 : names) {
			if (s1.getCourse().getFees() > 50000) {
				s1.setSpecial(true);
			}
		}

		for (Student s1 : names) {
			System.out.println(s1.getName() + ": " + s1.isSpecial());
		}
	}

}
