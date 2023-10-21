package pkg2; 
//import pkg1.ClassA;
//import pkg1.ClassB;
import pkg1.*;//all classes

public class Test1 {

	public static void main(String[] args) {

		        //to access class outside package
		         //use import packageName.className
				//create an object
				ClassA objA=new ClassA();//imp
				//objA.defaultMethod();//default is visible inside package
				//outside package default is private
				
				//objA.privateMethod();//Error:The method privateMethod() from the type ClassA is not visible
				
				//objA.protectedMethod();//protected visible outside class but in same package
				                       //outside package only in derived classes
				
				objA.publicMethod();//public
				

				ClassB objB=new ClassB();
				objB.pubNo=10;
				 
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}

}
