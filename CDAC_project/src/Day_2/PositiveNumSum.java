package Day_2;

//1:Write a program that accepts numbers continuously as long as the number is positive and prints the 
//sum of the given numbers. 
import java.util.Scanner;

public class PositiveNumSum {

	public static void main(String[] args) {

		int num, sum = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Enter the number :");
			num = sc.nextInt();

			if (num > 0) {
				sum = sum + num;
			} else {
				break;
			}
		} while (num > 0);
		System.out.println("sum of positive numbers is:" + sum);
	}
}
