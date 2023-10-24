package com.payroll;

public class Manager extends Employee {
	private int dept;
	private double incentive;

	public Manager(int empid, String name, double salary, int dept, double incentive) {
		super(empid, name, salary);
		this.dept = dept;
		this.incentive = incentive;
	}

	public void calSalary() {
		System.out.println("Manager Saalry: " + (salary + incentive));
	}

	public String showDetails() {
		return super.showDetails() + "mgr: " + incentive + " " + dept;
	}

	public void assignTask() {
		System.out.println("---manager specific func---");
	}

	public String toString() {
		return super.toString() + " mgr : " + incentive + " " + dept;
	}
}
