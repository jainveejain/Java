package Day_1;

import java.util.Scanner;

//18:Write a program to find greatest of three numbers using 
//nested if-else.
public class GretestAmongThree {
	public static void main(String[]args) {
		
		int no1 ,no2,no3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the no1:");
		 no1 = sc.nextInt();
		 
		System.out.println("Enter the no1:");
		no2 = sc.nextInt();
		
		System.out.println("Enter the no1:");
		no3 = sc.nextInt();
		
		if(no1>=no2 &&  no1>=no3)
		{
			System.out.println("Number one is Greatest " + no1);	
		}
		else if(no2>=no1 && no2>=no3) 
		{
			System.out.println("Number two is Greatest "+no2);
		}
		else
		{	
			System.out.println("Number third is Greatest "+no3);	
		}
}
	}