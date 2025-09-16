package com.codegnan.oopexamples;

public class BoxDemo {
	double height;
	double width;
	double depth;
	
	public BoxDemo(double height, double width, double depth) {
		super();
		this.height = height;
		this.width = width;
		this.depth = depth;
	}
	//instance method without return and without parameter
	public void volume() {
		System.out.println("Box Volume is ");
		System.out.println(height*width*depth);
	}
	//without return and with parameter
	public void setDim(double h,double w, double d) {
		double volume=h*w*d;
		System.out.println("Volume is "+volume);
	}
	//with return and without parameter
	public double vol() {
		return height*width*depth;
	}
	//with return and with parameter
	public double calculatevolume(double h1,double d1, double w1) {
		return h1*d1*w1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo d1=new BoxDemo(3.0,2.0,4.0);
		d1.volume();
		d1.setDim(3.0, 4.0,9.0);
		BoxDemo d2=new BoxDemo(4.0,9.0,8.0);
		System.out.println("Box 2 volume is "+d2.vol());
		System.out.println("Box Calculate Volume is: "+d2.calculatevolume(1.0,3.0,4.0));
		

	}

}
