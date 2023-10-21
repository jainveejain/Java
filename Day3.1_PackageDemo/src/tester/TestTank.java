package tester;
import pkg3.Tank;
public class TestTank {

	public static void main(String[] args) {
		//import pkg3.Tank

		//create refVariable of Tank
		
		Tank obj1;
		//allocate memory on heap
		//using new keyword
		obj1=new Tank();//
		obj1.displayDetails();
		//use Object class hashCode() to get ref of heap memeory
		
		System.out.println("\nObj1="+obj1.hashCode());
		System.out.println();
		Tank obj2=new Tank();		
		obj2.displayDetails();
		System.out.println("\nObj2="+obj2.hashCode());
				 
		int a=40;
		int b;
		b=a;
		
		Tank obj3;
		obj3=obj2;//obj2 ref is assigned to obj3
		obj3.displayDetails();
		System.out.println("obj3:"+obj3.hashCode());
		
		//de-reference object
		obj1=null;
		obj1.displayDetails();//
		
	}

}
