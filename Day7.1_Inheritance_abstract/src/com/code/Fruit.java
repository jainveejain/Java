package com.code;

public  abstract class Fruit {
	
	private String name,color;
	private double weight,price;
	
	public Fruit() {
		super();
		name="no name";
		color="no colour";
		price=0;
		weight=0;
		
	}

	public Fruit(String name, String color, double weight, double price) {
		super();
		this.name = name;
		this.color = color;
		this.weight = weight;
		this.price = price;
	}

	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public abstract  void taste();
	//only abstract class containes abstract method
	//instance of abstract class can not be create
	//abstract classes must be inherited
	//sub type/child class/derived class will implement abstract methods
	@Override
	public String toString() {
		return "name=" + name + ", color=" + color + ", weight=" + weight + ", price=" + price ;
	}
	

}
