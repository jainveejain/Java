package com.payroll;

public class Employee {

	private int empid;
	private String name;
	protected double salary;// inside sub classes

	public Employee(int empid, String name, double salary) {
		super();// Object
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	public void calSalary() {
		System.out.println(" Employee Salary:" + salary);
	}

	public String showDetails() {
		return empid + "  " + name + "  " + salary;
	}

	public String toString() {
		return empid + "  " + name + "  " + salary;
	}
}
