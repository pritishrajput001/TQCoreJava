//Write a program to demonstrate anonymous object.
package Assignmentoops;

class Rectangle {
	int length;
	int width;

	void input(int l, int w) {
		length = l;
		width = w;
	}

	void calculateArea() {
		System.out.println(length * width);
	}

}

class Rectangle1 {
	public static void main(String args[]) {
		Rectangle r1 = new Rectangle();
		Rectangle r2 = new Rectangle();
		r1.input(7, 12);
		r2.input(9, 4);
		r1.calculateArea();
		r2.calculateArea();
	}
}