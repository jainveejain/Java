package com.code;

//Base Class:java.lang.Object
public class Book {
//Lab:find out how many objects of Book class get created

	// instance variable
	private int bookid;
	private String name;
	private double price;
	// single copy per class
	private static int idCounter;
	// static block:as soon as class get loaded:once
	static {
		System.out.println("---Book.class get loaded-----");
		System.out.println("---static-----");
		idCounter = 1000;

	}

	// constr will get invoked when object get created

	public Book(String name, double price) {

		System.out.println("---book constr get called----");
		// for new created book
		// assign bookid
		idCounter = idCounter + 1;
		this.bookid = idCounter;
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getBookid() {
		return bookid;
	}

	// this is override
	public String toString() {
		return bookid + "   " + name + "     " + price;
	}

	//

}
