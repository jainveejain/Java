package com.code;

public final class Mango extends Fruit{

	public Mango(String name,String color,double weight,double price) {
		
		super(name, color, weight, price);
	}
	
	
	@Override
	public void taste() {
		System.out.println("Mango Test is Sweet");
	}
	public void  pulp() {
		System.out.println("Mango Pulp specific to Mango");
	}


	@Override
	public String toString() {
		return "Mango " + super.toString() +"    " ;
	}

	
	
	
}
