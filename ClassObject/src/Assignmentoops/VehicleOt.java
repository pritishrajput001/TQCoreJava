//Write a program for class and object : (main outside class)
package Assignmentoops;

public class VehicleOt {
	int chasisno;
	String name;

}

class Vehicle1 {
	public static void main(String args[]) {
		VehicleOt v1 = new VehicleOt();
		v1.chasisno = 4563;
		v1.name = " XUV500";
		System.out.print("Model is= " + v1.chasisno + " chasis no is " + v1.chasisno);
	}
}
