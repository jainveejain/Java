package com.tester;

import com.code.Person;
import com.code.Student;
import com.code.Trainer;

public class TesterInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person per1 = new Person("Mitesh", "Nagar", 45);
		System.out.println(per1);
		System.out.println(per1.showData());

//		System.out.println();
//		
		Student stud1 = new Student();// Person--->Student
		System.out.println(stud1.showData());
		stud1.endModuleExam();

		Student stud2 = new Student(101, "Nitesh", "Nashik", 23, "BE", 80);

		System.out.println(stud2.showData());

		Trainer trn1 = new Trainer(404, "Sonali", "Pune", 34, "IT", 45000);
		System.out.println(trn1.showData());
		trn1.training();

	}

}
