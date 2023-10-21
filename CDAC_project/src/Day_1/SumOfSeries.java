package Day_1;

import java.util.Scanner;

//12:Sum of series :
//1+2+3+….+n
public class SumOfSeries {
	public static void main(String[] args) {
		int n, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		n = sc.nextInt();
		if (n > 0) {
			for (int i = 1; i <= n; i++) {
				sum = sum + i;
			}
		}
		System.out.println("Sum of n numbers is : " + sum);
	}
}
