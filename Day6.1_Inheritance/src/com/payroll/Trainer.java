package com.payroll;

public class Trainer extends Employee {
//Every Trainer is Employee
	// Trainer will inherits empid name salary

	private String techName;
	private String batchName;

	public Trainer(int empid, String name, double salary, String techName, String batchName) {
		super(empid, name, salary);
		this.techName = techName;
		this.batchName = batchName;
	}

	public Trainer() {
		super();
		this.techName = "Not Define";
		this.batchName = "Not Assigned";
	}

	public void teaching() {
		System.out.println("----Trainer Sepcific Behaviour----");
	}

	public String toString() {

		return super.toString() + "   " + techName + "    " + batchName;

	}
	// Rules for Overriding
	// fun name and sig and return type must be SAME
	// child hides parent methods

	@Override
	public void calSalary() {
		System.out.println("Trainer Salary=" + (super.salary + 5000));
	}

}
