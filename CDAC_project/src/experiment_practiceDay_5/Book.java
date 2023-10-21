package experiment_practiceDay_5;

public class Book {
	private int bookId;
	private String name;
	private double price;
	
	private static int idCounter;

	static{
		System.out.println("---Book.class loaded---");
		System.out.println("---Static---");
		idCounter =1000;
	}
	
	public Book(String name,double price){
		
		System.out.println("----parameterised constr--");
		this.bookId=idCounter;
		this.name =name;
		this.price =price;
		idCounter = idCounter+1;
		
		
	}

	public int getBookId() {
		return bookId;
	}

	public String getName() {
		return name;
	}
	public void setName() {
		this.name=name;
	}

	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	//this is override
	public String toString() {
		return bookId+" "+name+" "+price;
	}
}
