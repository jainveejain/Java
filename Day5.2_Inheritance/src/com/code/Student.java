package com.code;

public class Student extends Person  {
	//

	private int rollno;
	private String qualification;
	private double percentage;
	
	public Student()
	{
		//super();	//super :parent
		             //this:current
		
		System.out.println("---default Student----");
	}
	
	public Student(int rollno,String name,String city,int age,String qualification,double percentage) {
		
		 super(name,city,age);
		 System.out.println("----student para6---");
		this.rollno=rollno;
		this.qualification=qualification;
		this.percentage=percentage;
				
		
		
	}
	
	public void result() {
		System.out.println("---get result----");
	}
	
	public void endModuleExam()
	{
		System.out.println("---give end module exam-----");
	}
	
	
}
