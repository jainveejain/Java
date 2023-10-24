package com.code;

public class Box {

	private int height, length, breadth;

	public Box(int height, int length, int breadth) {
		this.breadth = breadth;
		this.height = height;
		this.length = length;
	}

	public Box(int side) {

		this(side, side, side);
		System.out.println("---parametrised box(int)---");
	}

	public Box() {
		System.out.println("---default constr---");
		this.breadth = 12;
		this.height = 19;
		this.length = 20;

	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreadth() {
		return breadth;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

	@Override
	public String toString() {
		return "height= " + height + " length =" + length + " breadth =" + breadth;
	}

	public boolean isSame(Box boxObj) {
		System.out.println();
		if(this.height == boxObj.height && this.length == boxObj.length && this.breadth == boxObj.breadth) {
			return true;
		}
		else {
			return false;
		}
	}
}
