package com.codegnan.oopexamples;

public class Perimeter_Calculator {
	double length;
	double width;
	double side;
	double radius;
	double base;
	public Perimeter_Calculator(double length, double width, double side, double radius, double base) {
		super();
		this.length = length;
		this.width = width;
		this.side = side;
		this.radius = radius;
		this.base = base;
	}
	static double rectanglePerimeter(double length,double width) {
		return 2*(length+width);
	}
	static double squarePerimeter(double side) {
		return 4*side;
	}
	static double circlePerimeter(double radius) {
		return 2*3.14*radius;
	}
	static double trianglePerimeter(double a,double b,double c) {
		return a+b+c;
	}
	static double parallelogramPerimeter(double base,double side) {
		return 2*(base+side);
	}
}
