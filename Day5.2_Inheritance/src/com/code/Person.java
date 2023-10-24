package com.code;
//super class:Object
public class Person {

	
	private String name;
	private String city;
	private int age;
	
	public Person()
	{
		System.out.println("--default Person---");
		name="Ram";
		city="Pune";
		age=30;
		
	}
	public Person(String name,String city,int age) {
		System.out.println("-----para Person----");
		this.name=name;
		this.city=city;
		this.age=age;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String showData() {
		return "Person:"+name+"    "+city+"    "+age;
	}
	
	
	
	
}
