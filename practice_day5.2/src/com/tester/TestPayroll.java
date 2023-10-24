package com.tester;

import com.payroll.Developer;
import com.payroll.Employee;
import com.payroll.Manager;

public class TestPayroll {
	public static void main(String[] args) {

		Employee emp1 = new Employee(101, "jainvy", 15000);
		System.out.println(emp1.showDetails());
		emp1.calSalary();

		System.out.println();
		Manager mgr1 = new Manager(102, "Anchit", 50000, 1, 5000);
		System.out.println(mgr1.showDetails());
		mgr1.assignTask();
		mgr1.calSalary();

		System.out.println();
		Developer dev1 = new Developer(103, "ponik", 45000, "java", "payroll", 4);
		System.out.println(dev1.showDetails());
		dev1.projectStatusDetails();
		dev1.calSalary();

	}
}
