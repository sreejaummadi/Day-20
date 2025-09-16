package com.codegnan.oopexamples;
public class Student {
	String name;
	int[] marks;
	public Student(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public void setDetails(String n,int[] m) {
		name=n;
		marks=m;
	}
	public double calculateTotal() {
		int Total=0;
		for(int i=0;i<marks.length;i++) {
			Total+=marks[i];
		}
		return Total;
	}
	public double calculateAverage() {
		return calculateTotal()/marks.length;
	}
	public void displayDetails() {
		System.out.println("Student name"+name);
		System.out.println("Total Marks : "+calculateTotal());
		System.out.println("Average Marks :"+calculateAverage());
	}

}
