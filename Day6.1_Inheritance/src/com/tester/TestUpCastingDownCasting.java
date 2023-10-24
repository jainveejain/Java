package com.tester;

import com.payroll.Employee;
import com.payroll.Manager;
import com.payroll.Trainer;

public class TestUpCastingDownCasting {

	public static void main(String[] args) {

		// create a collection of all types of employee

		// parent class obj can hold ref of child class
		Employee[] iacsd = new Employee[5];
		// Initialize to null

		Employee emp1 = new Employee(101, "Ritesh", 34000);
		Manager mgr1 = new Manager(202, "Sunita", 45000, "IT", 3000);
		Trainer trn1 = new Trainer(303, "Mitesh", 60000, "DotNet", "Modular");

		// add emp1 in iacsd
		iacsd[0] = emp1;
		// add mgr1 in iacsd
		iacsd[1] = mgr1;// UpCasting
		// add trainer in iacsd
		iacsd[2] = trn1;//UpCasting

		// show all emp details
		for (Employee e : iacsd) {
			if (e != null) {
				System.out.println("\t\t RunTime Type:" + e.getClass());
				System.out.println(e);//
				e.calSalary();
							
				
				//forcefully 
				
//to avoid runtime exception ClassCastException
//check data type of obj at the time of execution
//Run time type identification
//as per run time data type do downCasting
//if run time obj e holding ref of trainer then 
//explicitly convert obj e into Trainer
//Why?so trainer specific behavior will get invoked	
				
//how to find data type at runtme : use  RTTI using instanceof operator
	if(e instanceof Trainer) {	
		//if e obj hodling ref of Trainer
		//then convert Employee to Trainer
		//cast Parent---->Child  DownCasting
		Trainer tObj=(Trainer) e;//Explicitly:DownCasting
		tObj.teaching();
		//or
		//((Trainer)e).teaching();
		
//				((Trainer)e).teaching();
	}	
	else if (e instanceof Manager)
	{
		Manager mObj=(Manager) e;//DownCast
		mObj.managerSpecificFunction();
	}
			}
		}

	}

}
