package com.code;

public class Student extends Person {
	private int rollno;
	private String qualification;
	private double percntg;

	public Student() {
		System.out.println("---Default constr---");
	}

	public Student(int rollno, String qualification, double percntg, String name, String city, int age) {
		super(name, city, age);
		this.percntg = percntg;
		this.qualification = qualification;
		this.rollno = rollno;

	}

	public void result() {
		System.out.println("---get result---");
	}

	public void endModuleExam() {
		System.out.println("---give end module exam-----");
	}

}
