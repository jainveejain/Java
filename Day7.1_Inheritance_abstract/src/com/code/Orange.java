package com.code;

public class Orange extends Fruit implements Printable {

	@Override
	public void taste() {
		System.out.println("Orange Taste Sour And Sweet ");

	}

	public Orange(String name, String color, double weight, double price) {

		super(name, color, weight, price);
	}

	public void juice() {
		System.out.println("Orange Specific :Juice ");
	}

	@Override
	public String toString() {
		return "Orange [toString()=" + super.toString() + "]";
	}

	@Override
	public void saveData() {
		 System.out.println("Orange Details Saved In DataBase");
		
	}

}
