package com.code;

public class TestShape {

	public void showArea(Shape obj) {
		obj.area();
	}
	
	
	public static void main(String[] args) {
		 
		
		Shape shape;
		
		// shape=new Shape();//instance can not be create for abstract  class
		//shape.area();//no implementation of area() in Shape class
		
		Circle c=new Circle();
		c.display();
		c.area();
		
		
		Square sq=new  Square();
		sq.display();
		sq.area();
		
		Triangle tr=new Triangle();
		tr.display();
		tr.area();
		
		
		

	}

}
