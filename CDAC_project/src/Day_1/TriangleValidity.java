package Day_1;

import java.util.Scanner;

//8. Write a  program to input angles of a triangle and check 
//whether triangle is valid or not.
public class TriangleValidity {
public static void main(String[] args) {
	
	int a,b,c;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter angle1");
	a = sc.nextInt();
	
	System.out.println("Enter angle2");
	b = sc.nextInt();
	
	System.out.println("Enter angle3");
	c = sc.nextInt();
	
	if (a+b+c == 180)
	{
		System.out.println("Valid Triangle");
	}
	
	else
	{
		System.out.println(" Not Valid Triangle");
	}
		
}
}
