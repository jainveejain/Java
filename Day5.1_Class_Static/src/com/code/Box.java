package com.code;

public class Box {

	private int height, width, length;

	public Box(int height, int width, int length) {
		System.out.println("---parameter  Box(int,int ,int)------");

		this.height = height;
		this.width = width;
		this.length = length;
	}

	public Box(int side) {
		// calling constructor of same class
		// is constructor chaining
		//
		// calling constr from constr is constr chaining
		// imp:it must be very first stalement
		// this();
		this(side, side, side);// Constructor call must be the first statement in a
		// constructor
		System.out.println("---parameter  Box(int)------");

//		this.height=side;
//		this.width=side;
//		this.length=side;

	}

	public Box() {
		// this(40);
		System.out.println("--default Box----");
		this.height = 10;
		this.width = 10;
		this.length = 10;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	// this is overriding Object.toString()
	// Annotations are used to increase readability
	// Annotations gives extra info to compiler as well as to JVM
	// @Override annotation is used for overrding parent class method in child class
	@Override
	public String toString() {
		return "Box height=" + height + ", width=" + width + ", length=" + length;
	}

	
	//box2.isSame(box3);
	public boolean isSame(Box boxObj)
	{//this:box2
		//boxObj:box3
		System.out.println("in isSame this-----"+this.hashCode()+"     boxObj:"+boxObj.hashCode());
		
		if(this.height==boxObj.height  && this.width==boxObj.width && this.length==boxObj.length)
		{
			return true;
		}
		else
			return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
