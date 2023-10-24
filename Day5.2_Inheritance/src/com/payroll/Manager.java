package com.payroll;

public class Manager  extends Employee
{

	//every manager is employee
	private int deptNo;
	private double incentives;
	 
	public Manager(int empid,String name,double salary,int deptNo,double incentives)
	{    
		
		super(empid,name,salary);//
		System.out.println("para manager");
		this.deptNo=deptNo;
		this.incentives=incentives;
		
	}
	
	public void calSalary()
	{
		System.out.println(" Manager Salary:"+(salary+incentives));
	}
	
	public void assignTask()
	{
		System.out.println("Manager Specific function");
	}
	//Hide Parent class Method
	public String showDetails()
	{
		return  super.showDetails()+  "Mgr:"+deptNo+"   "+incentives;
	}
	
	public String toString()
	{
		return  super.toString()+  "Mgr:"+deptNo+"   "+incentives;
	}
	
	
	
}
