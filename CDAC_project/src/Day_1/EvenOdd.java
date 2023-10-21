package Day_1;

import java.util.Scanner;

//4. Write a program to accept an integer and check if it is even or odd.
public class EvenOdd {
	public static void main(String[]args) {
		
		int n;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number");
		n = sc.nextInt();
		if(n%2==0)
			System.out.println(n+ " Number is even");
		else
			System.out.println(n+ " Number is odd");
	}
}
