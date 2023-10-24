package com.tester;

import com.code.Person;
import com.code.Student;
import com.code.Trainer;

public class TesterInheritance {
public static void main(String[] args) {
	
	Person per1 =new Person("nitesh","pune",29);
	System.out.println(per1);
	
	System.out.println(per1.showData());
	
	Student stud1 = new Student() ;
	System.out.println(stud1.showData());
	stud1.endModuleExam();
	
	Student stud2 = new Student(101,"Be",87.0,"vaishali","pune",28) ;
	System.out.println(stud2.showData());
	
	Trainer trn1=new Trainer(404,"IT",45000,"sonali","pune",29);
	System.out.println(trn1.showData());
	trn1.training();
	
	
}
}
