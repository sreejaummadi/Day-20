package com.codegnan.oopexamples;

import java.util.Scanner;

public class StudentTester {

	public static void main(String[] args) {
		int[] student1marks= {80,70,90,40};
		Student student1=new Student("Ramu",student1marks);
		student1.displayDetails();
	}
}