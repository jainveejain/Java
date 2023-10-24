package com.tester;

import com.mathop.MathInterface1;
import com.mathop.MyAdvMath;
import com.mathop.MyMath;

public class TestMath {
	int a;
	static int b = 90;

	void test() {
		a = 90;
		TestMath.staticTest();
	}
	
	static void staticTest() {
	
	}

	public static void main(String[] args) {
		
		MathInterface1.multi();
		// a=90;
		MyMath obj1 = new MyMath();
		obj1.add();
		obj1.sqrt(16);
		obj1.sub();// MyMath
		// provider class object can call default methods

		MyAdvMath obj2 = new MyAdvMath();
		obj2.add();
		obj2.sqrt(4);
		obj2.sub();// i/f

	}
}
