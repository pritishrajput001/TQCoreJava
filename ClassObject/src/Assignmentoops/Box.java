package Assignmentoops;

class Box {
	int length;
	int width;
	int height;

	void input(int l, int w, int h) {
		length = l;
		width = w;
		height = h;

	}

	void calculateVolume() {
		System.out.println(length * width * height);
	}

}

class Box1 {
	public static void main(String args[]) {
		Box b1 = new Box();
		Box b2 = new Box();
		b1.input(7, 12, 5);
		b2.input(9, 4, 9);
		b1.calculateVolume();
		b2.calculateVolume();
	}
}