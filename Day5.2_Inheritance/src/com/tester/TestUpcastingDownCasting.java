package com.tester;

import com.code.Person;
import com.code.Student;

public class TestUpcastingDownCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Every Student is Person:True
		//will we get all behaviour  of Person in Student
		Student stud=new Student();
		System.out.println(stud.showData());//parent class method
		//stud Compile Time Type:Student
		//stud RuntimeData Type:Student
		
		
		//Every Student is Person:True
		//Parent class can hold child class
		//Base Class obj can hold ref of Derived class
		 Person per1=new Student();//upcasting
		//per1 Compile Time Data Type:Person
		//per1 RuntTime Data type:
		
		//Upcasting:automatically
		 //ParentObj=ChildObj
		 per1.showData();//Person class method
		
		
		
		
		
		
		
		
		

	}

}
