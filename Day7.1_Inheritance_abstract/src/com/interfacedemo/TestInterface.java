package com.interfacedemo;

import com.code.Date;
import com.mathop.MathInterface1;
import com.mathop.MyMath;

public class TestInterface {

	public static void main(String[] args) {

		MyMath obj1=new MyMath();
		
		MathInterface1 objIntr=obj1;
		//annonymous:unknown
		//annonymous Object
		
		new Date();
		//annonymous Class:a class with no name
		//class with no .java file
		
		MyInterface1 mObj2=new MyProviderClass();
		mObj2.display();
		
		MyInterface1 mobj=new MyInterface1() {
			
			@Override
			public void display() {
				System.out.println("This is Display impleneted by annonumous class");
				
			}
			
		};
		//System.out.println("***"+mobj.getClass());
		mobj.display();
		
		
		MyInterface1 mobj3=new MyInterface1() {
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}
		};
		System.out.println("***"+mobj3.getClass());
		
		
		
		

	}

}
