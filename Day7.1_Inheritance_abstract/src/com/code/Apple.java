package com.code;

public class Apple extends Fruit {

	@Override
	public void taste() {
	 System.out.println("Apple Test Is Sweet ");
		
	}
	public Apple(String name, String color, double weight, double price) {
		
		super(name, color, weight, price);
	}
	@Override
	public String toString() {
		return "Apple [toString()=" + super.toString() + "]";
	}

	public void jam() {
		System.out.println("apple Specific:Jam");
	}
	
	
	
}
