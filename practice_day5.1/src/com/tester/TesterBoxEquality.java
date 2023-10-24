package com.tester;

import com.code.Box;

public class TesterBoxEquality {
	public static void main(String[] args) {
		Box box1 = new Box(30, 30, 30);
		System.out.println(box1);
		System.out.println();
		System.out.println(box1.hashCode());

		Box box2 = new Box(50, 40, 60);
		System.out.println(box2);
		System.out.println(box2.hashCode());

		Box box3 = new Box(50, 40, 60);
		System.out.println(box3);
//equal method also check hashcode internally
		System.out.println(box3.equals(box2));

		if (box1 == box2)
			System.out.println("box1==box2");

		if (box2 == box3) {
			System.out.println("box2==box3");
		} else {
			System.out.println("box2!=box3");
		}

		System.out.println("Box2-----" + box2.hashCode() + "     Box3:" + box3.hashCode());

	}
}
