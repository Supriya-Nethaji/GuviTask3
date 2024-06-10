package com.example.hr;

public class Employee {

	int id;
	String name;
	double salary;
	
	public String printName(String nme) {
		name=nme;
		System.out.println("Name of the employee: " +name);
		return name;
	}
	
	public double getSalary(double sal)
	{
		salary=sal;
		System.out.println("Salary is: " +salary);
		return salary;
	}
}
