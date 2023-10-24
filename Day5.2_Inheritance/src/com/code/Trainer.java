package com.code;
//Super:
public class Trainer extends Person {
	
	private int id;
	private String dept;
	private double salary;
	
	public Trainer(int id,String name,String city,int age,String dept,double salary)
	{
		super(name, city, age);
		System.out.println("----trainer para----");
		this.id=id;
		this.dept=dept;
		this.salary=salary;
	}
	
	
	
	public Trainer() {
		
		
		System.out.println("---default Trainer---");
		
		
	}




	public void training()
	{
		System.out.println("---take training-----");
	}
	
	
	
	
	

}
