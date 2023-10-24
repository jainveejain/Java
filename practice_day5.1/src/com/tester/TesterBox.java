package com.tester;

import com.code.Box;

public class TesterBox {
public static void main(String[] args) {
	
	Box box1 = new Box(10,20,30);
	System.out.println(box1);
	
	Box box2 = new Box(20,30,40);
	System.out.println(box2);
	
	int side = 60;
		System.out.println();
	Box box3 = new Box(side);
	System.out.println(box3);
}
}
