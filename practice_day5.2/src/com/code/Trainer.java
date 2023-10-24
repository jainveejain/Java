package com.code;

public class Trainer extends Person {
	private int id;
	private String dept;
	private double salary;

	public Trainer() {
		System.out.println("---default constr---");

	}

	public Trainer(int id, String dept, double salary, String name, String city, int age) {
		super(name, city, age);
		this.id = id;
		this.dept = dept;
		this.salary = salary;
	}

	public void training() {
		System.out.println("---take training-----");
	}

}
