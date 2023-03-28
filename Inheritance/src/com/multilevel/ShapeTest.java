package com.multilevel;

class Shape {

	private String shapename;
	private String shapetype;

	public Shape() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Shape(String shapename, String shapetype) {
		super();
		this.shapename = shapename;
		this.shapetype = shapetype;
	}

	public String getShapename() {
		return shapename;
	}

	public void setShapename(String shapename) {
		this.shapename = shapename;
	}

	public String getShapetype() {
		return shapetype;
	}

	public void setShapetype(String shapetype) {
		this.shapetype = shapetype;
	}

	@Override
	public String toString() {
		return "Shape [shapename=" + shapename + ", shapetype=" + shapetype + "]";
	}
}

class Rectangle extends Shape {
	private int length;
	private int breadth;

	public Rectangle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Rectangle(String shapename, String shapetype, int length, int breadth) {
		super(shapename, shapetype);
		this.length = length;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	public void area() {
		System.out.println("Area of rectangle:" + (length * breadth));
	}

	@Override
	public String toString() {
		return super.toString() + "Rectangle [length=" + length + ", breadth=" + breadth + "]";
	}

}

class Cuboid extends Rectangle {
	int height;

	public Cuboid() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cuboid(String shapename, String shapetype, int length, int breadth, int height) {
		super(shapename, shapetype, length, breadth);
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public void area() {
		float areaCuboid = 2 * (getLength() + getBreadth() + height);
		System.out.println("Area of cuboid:" + areaCuboid);
	}

	public void volume() {
		float vol = getLength() * getBreadth() * height;
		System.out.println("Volume of cuboid:" + vol);

	}

	@Override
	public String toString() {
		return getShapename() + ":" + getShapetype() + " [Length=" + getLength() + "Breadth=" + getBreadth() + "height="
				+ height + "]";
	}

}

public class ShapeTest {
	public static void main(String ags[]) {

		Cuboid c1 = new Cuboid("Cube", "3D", 7, 6, 7);
		c1.area();
		c1.volume();

		/*
		 * Rectangle r1= new Rectangle("Rectangle","2D",6,5); System.out.println(r1);
		 */

	}

}
