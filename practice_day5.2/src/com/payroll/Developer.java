package com.payroll;

public class Developer extends Employee {
	private String tech;
	private String proName;
	private int duration;

public	Developer(int id, String name, double Salary, String tech, String proName, int duration) {
		super(id, name, Salary);
		this.proName = proName;
		this.tech = tech;
		this.duration = duration;
	}

	public void calSalary() {
		System.out.println("Devloper Salary: " + (salary + 20000));
	}

	public String showDetails() {
		return super.showDetails() + "Dev :" + tech + " " + proName + " " + duration;
	}

	public void projectStatusDetails() {
		System.out.println("-----project status------");

	}

	public String toString() {
		return super.toString() + "Dev :" + tech + " " + proName + " " + duration;
	}
}
