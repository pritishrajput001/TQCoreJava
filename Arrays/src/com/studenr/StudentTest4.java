package com.studenr;

public class StudentTest4 {

	public static void main(String[] args) {

		Student stud[] = new Student[5];

		stud[0] = new Student(1, "Rupali", 67f);
		stud[1] = new Student(2, "Vivek", 78f);
		stud[2] = new Student(3, "Shruti", 88f);
		stud[3] = new Student(4, "Suyog", 99f);
		stud[4] = new Student(5, "Vaishnavi", 68f);
		// stud[5]= new Student(5,"Vaishnavi",68f);

		for (Student s : stud) {
			if (s.getMarks() > 80)
				System.out.println(s);
		}

	}

}
