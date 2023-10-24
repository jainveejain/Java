package com.tester;

import com.payroll.Employee;
import com.payroll.Manager;

public class TestCasting {
public static void main(String[] args) {
	
	short s1=12;
	int a;
	a=s1;//small data type converted to bigger(implicitly)
	
	
	short x;
	x=(short)a;//Explicit 
	
	
	
	Employee emp1;//Parent Class
	Manager mgr=new Manager(111,"Abc",50000,"Training",5000);//Child)
	//type casting child to parent(implicitly)
	//UpCasting
	emp1=mgr;//parent=child
	//only common behaviour present in parent class will get acccess
	emp1.calSalary();////
	//as per compiler data type of emp1:Employee
	//as per compiler emp1.calSalary()   Employee method will get call
	
	//runtime emp1 holding ref of manager
	//what is type of emp1 at the time of Execution
	
	System.out.println(emp1.getClass());
	
	emp1.calSalary();
	
	 
	
	
	
	
	
}
}
