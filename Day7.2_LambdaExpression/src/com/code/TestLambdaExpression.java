package com.code;

import java.util.Random;

public class TestLambdaExpression {

	public static void main(String[] args) {

		// create anonymous function using lambda experssion
		// anonymous function:funtion with no name
		// anonymous function used with lambda expression
		// for single abstract method create anonymous function

		// MyInterface1 is functional i/f
		// contains only one signle abstract method
		// abstract method:void display();

		// so to implements SAM void display() write lambda expression

		MyInterface1 obj1 = () -> {
			System.out.println("Display Method");
		};
		
		//Annonymous Class approch for above example
//		MyInterface1 obanno = new MyInterface1() {
//			
//			@Override
//			public void display() {
//				System.out.println("Display Method");
//			}
//		};

		obj1.display();

		MyInterface1 obj2 = () -> {
			System.out.println("Testing annoymous function...display method");
		};

		obj2.display();

		// MyInterface2 SAM void show(String name);

		MyInterface2 obj3 = (String str) -> {
			System.out.println("Welcome :" + str);
		};
		
		obj3.show("Nitesh");

		MyInterface2 obj4 = (name) -> {
			System.out.println("Hello:" + name);
		};

		obj4.show("Mangesh");

		MyInterface2 obj5 = (s) -> {
			System.out.println();
			for (int i = 1; i < 10; i++) {
				System.out.print(s + " ");
			}

		};
		obj5.show("*");

		MyInterface2 obj6 = (name) -> {
			System.out.println("UpperCase:" + name.toUpperCase());
		};

		// Lambda Expression for function return and accept parameter
		// String changeCase(String value);

		MyInterface3 obj7 = (name) -> {
			return name.toLowerCase();
		};

		String str = obj7.changeCase("IACSD");

		MyInterface3 obj8;

		// lambda expression for not accepting but retun type
		// int getRandomNumber();

		MyInterface4 obj9 = () -> {
			return 1000;
		};

		System.out.println("Random Number=" + obj9.getRandomNumber());

		MyInterface4 obj10 = () -> {
			return 150;
		};

		System.out.println(obj10.getRandomNumber());

		MyInterface4 obj11 = () -> {
			return new Random().nextInt();
		};

		System.out.println(obj11.getRandomNumber());

	}

}
