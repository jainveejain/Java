package tester;
import java.util.Scanner;

import pkg3.Tank;
public class TestSetterGetters {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub

		//create an object
		Tank obj1;//obj1 on stack
		obj1=new Tank();//allocate memoery on heap
		//level:0 capacity:50
		
		obj1.displayDetails();
		System.out.println("Assign Level To Tank");
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();//45
		
		obj1.setLevel(l);//
		System.out.println("Level Changed:"+obj1.getLevel());
		
		Tank obj2=new Tank();
		//level 0 capacity:50
		System.out.println("Assign Level To Tank");
		l=sc.nextInt();//75
		obj2.setLevel(l);
		System.out.println("Tank2 :"+obj2.getLevel());//754
			
		Tank obj3;
		obj3=obj1;
		System.out.println("New Tank Level:"+obj3.getLevel());//45
		
		//
		
		obj1.setLevel(100);
		
		System.out.println("New Tank Level:"+obj3.getLevel());// 
		System.out.println("New Tank Level:"+obj1.getLevel());// 
		
		System.out.println(obj3.toString());
		
		
		
		
		
		
	}

}
