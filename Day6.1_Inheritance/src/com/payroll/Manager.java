package com.payroll;

public class Manager  extends  Employee{

	private String deptName;
	private double incentives;
	//inherited data members:empid name salary
	//when Manager obje get created
	//mememory for empid name salary must be created+deptName,incentives
	
	public Manager() {
		super();
		this.deptName="DeptName";
		this.incentives=1000;
		
	}
	
	
	
	public Manager(int empid, String name, double salary, String deptName, double incentives) {
		super(empid, name, salary);
		this.deptName = deptName;
		this.incentives = incentives;
	}

//Manager overrides Employee calSalary()
	public void calSalary() {
		System.out.println("Manager Salary:"+(super.salary+this.incentives));
	}

	public void managerSpecificFunction() {
		System.out.println("Task Done By Manager");
	}
	//manager is  overrding Employee class toString 
	public String toString()
	{
		return  super.toString()+"   "+deptName+"   "+incentives;
	}
	
	
	
}
