package Assignmentoops;

public class RectSqCir {
	void area(int sq) {
		System.out.println("Area of square " + (sq * sq));
	}

	void area(double len, double bred) {
		System.out.println("Area of rectangle" + (len * bred));
	}

	void area(float pie, float rad) {
		System.out.println("Area of circle" + (pie * rad * rad));
	}

}

class Main {
	public static void main(String args[]) {
		RectSqCir r = new RectSqCir();
		r.area(21);
		r.area(56, 24);
		r.area(5.66, 2.1);
	}
}
