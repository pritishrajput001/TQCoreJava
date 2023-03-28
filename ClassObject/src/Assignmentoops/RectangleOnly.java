//Write a program to create multiple objects of one type only.
//e.g. Rectangle r1=new Rectangle(), r2=new Rectangle();//creating two objects

package Assignmentoops;

class RectangleOnly {
	int length;
	int bredth;

	void SetData(int length, int bredth) {
		this.length = length;
		this.bredth = bredth;

	}

	int calculateArea() {
		return (length * bredth);

	}

	public static void main(String args[]) {
		RectangleOnly r1 = new RectangleOnly(), r2 = new RectangleOnly();
		r1.SetData(45, 66);
		r2.SetData(55, 20);
		System.out.println("Area of rectangle is " + r1.calculateArea());
		System.out.println("Area of rectangle is " + r2.calculateArea());
	}

}
