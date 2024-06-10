package com.example.hrtest;

import java.util.Scanner;

import com.example.hr.Employee;

public class EmployeeTest {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.next();
		System.out.println("Enter salary");
		double salary =sc.nextDouble();
		Employee emp=new Employee();
		emp.printName(name);
		emp.getSalary(salary);

	}

}
