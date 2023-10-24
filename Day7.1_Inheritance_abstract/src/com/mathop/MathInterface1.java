package com.mathop;

public interface MathInterface1 {
//variable are static and final
	int no1 = 10, no2 = 20;

	// all methods are abstract
	// by default public abstract
	void add();

	// default methods are implemented methods in i/f
	default void sub() {
		System.out.println("---implemented method in i/f");
	}

	// new contract
	default double sqrt(double no) {
		System.out.println("This is new feature added with java 8");
		System.out.println("feature:interface can have implemeneted method");
		System.out.println("Method must be default");
		return 0;
	}

	// static methods:java 8
	static void multi() {
		System.out.println("---static method----");
	}

}
