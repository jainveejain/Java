package com.tester;

import com.payroll.Developer;
import com.payroll.Employee;
import com.payroll.Manager;

public class TestPayroll {

	public static void main(String[] args) {
		 
		
		Employee emp1=new Employee(101, "Suresh", 20000);
		System.out.println(emp1.showDetails());
		emp1.calSalary();//Employee
		 
		System.out.println("\n ");
		Manager mgr1=new Manager(202, "Rakesh", 56000, 1, 20000);
		//Every manager is-a Employee
		//Can we get employee methods in mgr1
		System.out.println(mgr1.showDetails());
		mgr1.assignTask();//manager class
		mgr1.calSalary();// Manager 
		
		
		System.out.println("\n ");
		Developer dev1=new Developer(404, "Chetan", 60000, "Java", "Payroll", 5);
		System.out.println(dev1.showDetails());//Employee
		dev1.projectStatusDetails();//Developer
		dev1.calSalary();//Developer 

		System.out.println("\n ");
		System.out.println(emp1);
		System.out.println(mgr1);
		System.out.println(dev1);
		
		
		
	}

}
