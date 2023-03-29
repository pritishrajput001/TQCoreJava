package StudentCourse;

import java.util.Scanner;

import Containment.Book;

public class StudentTest {
	
	static Scanner sc=new Scanner(System.in);
	public void display(Student st) {
		
		System.out.println("Enter the student id: ");
		st.setSid(sc.nextInt());
		
		System.out.println("Enter the student name: ");
		st.setSname(sc.next());
		
		float[] b=new Book[3];
		b=new float[3];
		System.out.println("Enter the Marks: ");
		{
			System.out.println("Enter the marks of first sub: ");
			st.setCourse(st.);
		}
		
	}

	public static void main(String[] args) {

		Student[] s=new Student[5];
				
		for(int i=0;i<s.length;i++)
		{
		
			s[i]=new Student();
			System.out.println(s);
		}
	}

}
