package com.mathop;

public class MyMath implements MathInterface1 {

	@Override
	public void add() {
		System.out.println("---add-----");
		
	}

	@Override
	public void sub() {
		 //can we oveeride default method
		//YES
		System.out.println("Provider class overriding default methods");
	}
	
	

}
