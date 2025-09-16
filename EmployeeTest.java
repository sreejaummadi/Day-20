package com.codegnan.oopexamples;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp=new Employee();
		emp.setDetail("Ramu",50000);
		System.out.println("Employee Name : "+emp.name);
		System.out.println("Employee BasicSalary : "+emp.basicSalary);
		System.out.println("HRA allowence is : "+emp.calculateHRA());
		System.out.println("DA allowence is : "+emp.calculateDA());
		System.out.println("Gross Salary "+emp.grosssalary());
	}

}
