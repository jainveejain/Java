  package com.testobject;

public class TestObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d1 = new Date(10, 12, 1980);
		System.out.println(d1);

		Date d2 = new Date(11, 12, 1981);
		System.out.println(d2);

		if (d1 == d2) {
			System.out.println("d1==d2");
		} else {
			System.out.println("d1!=d2");
		}

		System.out.println();
		Date d3;
		// ref of d1 get assigned to d3
		// both d1 and d3 holds same ref of memory
		// hint:chk hashCode();
		d3 = d1;

		if (d1 == d3) {
			System.out.println("d1==d3");
		} else {
			System.out.println("d1!=d3");
		}
		System.out.println("--------------------");
		// equal(Object obj)
		// Date is child class of Object class
		//
		if (d1.equals(d3))// UpCasting
		{
			System.out.println("d1 equal d3");
		} else {
			System.out.println("d1 not equal d3");
		}

		System.out.println("---------------------------");
		if (d1.equals(d2))// UpCasting
		{
			System.out.println("d1 equal d2");
		} else {
			System.out.println("d1 not equal d2");
		}

		System.out.println("----------------------");
		Date dob1 = new Date(2, 2, 2022);
		Date dob2 = new Date(2, 2, 2022);
		
		if(dob1.equals(dob2))
		{
			System.out.println("Same");
		}
		else
		{
			System.out.println("Not Same");
		}
		
		
		Student  std1=new Student();
		
		System.out.println(dob1.equals(std1));
		
		
		
		
		
		
	

	}

}
