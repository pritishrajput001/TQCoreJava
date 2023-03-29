// Q9
package com.Assignment;

import java.util.Scanner;

public class CircleTriangleRectangleSquare {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Area of a circle");
		System.out.println("Enter 2 for Area of a square ");
		System.out.println("Enter 3 for Area of a right angled triangle ");
		System.out.println("Enter 4 for Area of a rectangle ");
		System.out.println("Enter 5 for Circumference of a circle");
		System.out.println("Enter 6 for Perimeter of a square");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Enter radius");
			float rad = sc.nextFloat();
			float areaofcircle = 3.14f * rad * rad;
			System.out.println("Area of circle is " + areaofcircle);
			break;

		case 2:
			System.out.println("Enter side of square");
			int side = sc.nextInt();
			int areaofsq = side * side;
			System.out.println("Area if square is " + areaofsq);
			break;

		case 3:
			System.out.println("Enter height and base");
			float height = sc.nextFloat();
			float base = sc.nextFloat();
			float arat = 0.5f * height * base;
			System.out.println("Area if Right angle traingle is " + arat);
			break;

		case 4:
			System.out.println("Enter length and breadth");
			int length = sc.nextInt();
			int breadth = sc.nextInt();
			int arearect = length * breadth;
			System.out.println("Area of rectangle is " + arearect);
			break;

		case 5:
			System.out.println("Enter radius");
			float radius = sc.nextFloat();
			float circum = 3.14f * 2f * radius;
			System.out.println("Circumference of circle is " + circum);
			break;

		case 6:
			System.out.println("Enter side of square");
			int sid = sc.nextInt();
			int perim = 4 * sid;
			System.out.println("Perimeter of square is " + perim);
			break;

		default:
			System.out.println("Invalid Input");

		}
	}

}
