package Day_1;

import java.util.Scanner;

//14:Write a  program to find sum of all even and odd numbers between 1 to n. 
public class SumOfEvenOdd {
	public static void main(String[] args) {
		int n, sum1 = 0, sum2 = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number : ");

		n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0) {
				sum1 = sum1 + i;
			} else {
				sum2 = sum2 + i;
			}
		}
		System.out.println("Sum of even numbers:" + sum1);
		System.out.println("Sum of odd numbers:" + sum2);
	}
}
