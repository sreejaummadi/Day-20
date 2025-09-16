package com.codegnan.oopexamples;

public class Employee {
	String name;
	double basicSalary;
	public void setDetail(String n,double salary) {
		name=n;
		basicSalary=salary;
	}
	public double calculateHRA() {
		return 0.20*basicSalary;
	}
	public double calculateDA() {
		return 0.10*basicSalary;
	}
	public double grosssalary() {
		return basicSalary+calculateHRA()+calculateDA();
	}
	

}
