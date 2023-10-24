package com.testfinal;

public class TesterFinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ParentClass p1=new ParentClass();
		p1.display();
		p1.impMethod();
		
		ChildClass c1=new ChildClass();
		c1.display();
		c1.impMethod();
		
		//to create const in java final is used
		final int DATA=100;
		//Error // DATA=900;//The final local variable DATA cannot be assigned. 
		
		//Lab:
		
		
	}

}
