package Day_1;

import java.util.Scanner;

//5. Write a program to accept a number and check 
//if it is divisible by 5 and 7.

public class DivisiblityCheck {

	public static void main(String[] args) {

		int n;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");

		n = sc.nextInt();
		if (n > 0) {

			if (n % 5 == 0 && n % 7 == 0)
				System.out.println("The Number is Divisible");
			else
				System.out.println("The number is not divisible");

		}

		else {
			System.out.println("Invalid number");
		}
	}
}