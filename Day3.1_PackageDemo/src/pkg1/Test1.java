package pkg1;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		 
		 
		//to access class methods
		//create an object
		ClassA objA=new ClassA();//imp
		objA.defaultMethod();//default is visible inside package
		//objA.privateMethod();//Error:The method privateMethod() from the type ClassA is not visible
		
		objA.protectedMethod();//protected visible outside class but in same package
		                       //outside package only in derived classes
		
		objA.publicMethod();//public
		
		 
		
		

	}

}
