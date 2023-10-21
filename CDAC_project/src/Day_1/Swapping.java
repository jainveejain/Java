package Day_1;

import java.util.Scanner;

//3:Write a program to swap two numbers.
public class Swapping {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = 0, b = 0, temp = 0;

		System.out.println("Enter the number 1:");
		a = sc.nextInt();
		System.out.println("Enter the second number2:");
		b = sc.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("After swappint a = " + a);
		System.out.println("After Swapping b = " + b);
	}
}
