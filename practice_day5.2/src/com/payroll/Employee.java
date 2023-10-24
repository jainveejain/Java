package com.payroll;

public class Employee {
	private int empid;
	private String name;
	protected double salary;

//try default public specifier
public	Employee(int empid, String name, double salary) {
		System.out.println("----employee para const----");
		this.empid = empid;
		this.salary = salary;
		this.name = name;

	}

	public void calSalary() {
		System.out.println("Employee salary:" + salary);
	}

	public String showDetails() {
		return empid + " " + name + " " + salary;
	}

	public String toString() {
		return empid + " " + name + " " + salary;
	}
}
