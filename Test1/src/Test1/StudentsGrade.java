package Test1;

import java.util.Scanner;

public class StudentsGrade {
	public static void main(String args[]) {
		float sub1, sub2, sub3, sub4, sub5;
		char grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks of  subjects");
		sub1 = sc.nextFloat();
		sub2 = sc.nextFloat();
		sub3 = sc.nextFloat();
		sub4 = sc.nextFloat();
		sub5 = sc.nextFloat();
		float perct = ((sub1 + sub2 + sub3 + sub4 + sub5) / 500) * 100;
		if (perct < 40) {
			System.out.println("Fail");
		} else {
			if (perct > 85) {
				grade = 'A';
				System.out.println("You grade is " + grade);
			}

			if (perct > 70) {
				grade = 'B';
				System.out.println("You grade is " + grade);
			}

			if (perct > 55) {
				grade = 'C';
				System.out.println("You grade is " + grade);
			}

			if (perct > 40) {
				grade = 'D';
				System.out.println("You grade is " + grade);
			}
		}
	}

}
