package com.payroll;

public class Developer extends Employee {

	private String tech;
	private String projName;
	private int duratuion;

	public Developer(int empid, String name, double salary, String tech, String projName, int duratuion) {

		super(empid, name, salary);
		this.tech = tech;
		this.projName = projName;
		this.duratuion = duratuion;
	}

	public void projectStatusDetails() {

		System.out.println("--Details About Project----");

	}

	public void calSalary() {
		System.out.println(" Developer  Salary:" + (salary + 2000));
	}

	@Override
	public String showDetails() {
		return super.showDetails() + "Devl:" + tech + "   " + projName + "   " + duratuion;
	}

	public String toString() {
		return super.toString() + "Devl:" + tech + "   " + projName + "   " + duratuion;
	}

//	public Developer(int empid,String name,double salary,String tech,String projName,int duration)
//	{
//		
//	}

}
