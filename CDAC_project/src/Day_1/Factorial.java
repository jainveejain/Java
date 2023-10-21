package Day_1;

import java.util.Scanner;

//9:Write a program to find factorial of a given number.
//x:no5  fact=5*4*3*2*1=120
public class Factorial {
	public static void main(String[] args) {
		int n,fact =1;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Number");
		n = sc.nextInt();
		for(int i = 2;i<=n;i++) 
		{
			fact = fact*i;
		}
		
		System.out.println("Factorial of given number is :"+fact);
	}

}
