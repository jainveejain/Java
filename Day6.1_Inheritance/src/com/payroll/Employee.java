package com.payroll;
//Base Class:Object
public class Employee   {

	private int empid;
	private String name;
	protected double salary;//visible in sub classes
	public Employee() {
		super();//Object class default constr:byDefault
		//super:parent class obj
		//this :current class obj
		this.empid=10;
		this.name="Ram";
		this.salary=10000;
	}
	public Employee(int empid, String name, double salary) {
		super();//is parameter constr in Object:NO
		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}
	public void calSalary() {
		System.out.println("Employee Salary:"+salary);
	}
	//Employee class override Object toString()
	@Override
	public String toString()
	{
		return "empid="+empid+"   Name:"+name+"   "+salary;
	}
	
	//Cannot override the final method from Object
//public   Class<?> getClass(){
//		
//	}
	
	
	
	
	
}
