package com.tester;

import java.util.Scanner;

import com.code.Book;

public class TestBook {
public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);
	Book b1 = new Book("asd",345);
	System.out.println(b1);
	
	Book b2 = new Book("ert",234);
	System.out.println(b2);
	
	 for(int i=1;i<5;i++) {
		 Book obj=new Book(sc.next(), sc.nextDouble());
		 System.out.println(obj);
		 System.out.println(obj.hashCode());
}
}
}