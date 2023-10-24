package com.code;

public class Book {
	private int bookId;
	private String bookName;
	private double price;
	
	static int idcounter;
	static {
		System.out.println("---Static block1--");
		System.out.println("---nextCounter---");
		idcounter =1000;
	}
	static {
		System.out.println("static block 2");
	}
	static {
		System.out.println("static block 3");
	}

	public Book(String bookName, double price) {
		System.out.println("---parameterized Constr---");
		idcounter =idcounter+1;
		this.bookId = idcounter;
		this.bookName = bookName;
		this.price = price;

	}

	public int getBookId() {
		return bookId;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bname) {
		this.bookName = bname;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double prc) {
		this.price = prc;
	}

//Override
	public String toString() {
		return bookId + " " + bookName + " " + price;
	}
}
