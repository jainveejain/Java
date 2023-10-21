package Day_1;

import java.util.Scanner;

//11:Check if number is a prime number or not.: 
public class PrimeNo {
	public static void main(String[] args) {

		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number to check prime: ");
		n = sc.nextInt();

		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				System.out.println("not prime");
				break;
			} else if (i == n - 1) {
				System.out.println("prime");
			}
		}

	}
}