package com.tester;

import com.payroll.*;

public class TestInheritance {

	public static void showSalary(Employee obj) {
		obj.calSalary();// Compile Time:Employee calSalary()
		System.out.println(obj.toString());
	}

	public static void showSalary(Manager obj) {
		obj.calSalary();
	}

	public static void showSalary(Trainer obj) {
		obj.calSalary();
	}

	public static void main(String[] args) {

		Employee empObj = new Employee(101, "Satish", 20000);

		empObj.calSalary();// Employee
		// System.out.println(empObj.hashCode());//child class obj call parent class
		// public method
		System.out.println(empObj);// Employee toString()

		System.out.println();
		// Manager is-a Employee
		Manager mgrObj = new Manager(123, "Nitin", 40000, "IT", 20000);
		mgrObj.calSalary();// ChildObj---->Child class Method
		 mgrObj.calSalary();//manager
		 System.out.println(mgrObj.hashCode());//Object
		mgrObj.managerSpecificFunction();// Manager

		System.out.println(mgrObj);

		System.out.println();
		// Trainer is-a Employee
		Trainer trnObj = new Trainer(404, "Nita", 50000, "Java", "dac");
		trnObj.calSalary();// trainer
		trnObj.teaching();// Trainer
		System.out.println(trnObj);//
		System.out.println("------------------------------------");

		Employee obj1 = mgrObj; // ParentObj=childObj
		showSalary(mgrObj);
		showSalary(trnObj);
		showSalary(empObj);

	}

}
