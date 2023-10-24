package com.tester;

import com.code.Book;

public class TestBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		Book b1=new Book("Abc", 780);		 	 		
	   System.out.println(b1);//1001 Abc 780    
	 
	   
	   Book b2=new Book("Xyz", 4500);
	 System.out.println(b2);
	 
	 
	 for(int i=1;i<5;i++) {
		 Book obj=new Book("abc", 45);
		 System.out.println(obj);
		 System.out.println(obj.hashCode());
	 }
	 
	}

}
