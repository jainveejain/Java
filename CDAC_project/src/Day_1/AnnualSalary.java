package Day_1;

import java.util.Scanner;
//6. Write a program, which accepts annual basic salary of an employee
//and calculates and displays the 
//Income tax as per the following rules. 
//Basic: < 1, 50,000 Tax = 0
// 1, 50,000 to 3,00,000 Tax = 20% 
// > 3,00,000 Tax = 30% 

public class AnnualSalary {

	public static void main(String[] args) {

		double bs, tax = 0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the basic Salary:");
		bs = sc.nextDouble();

		if (bs < 150000)
			System.out.println("No Tax ");
		else if (150000 < bs && bs < 300000) {
			tax = bs * 0.20;
		} else {
			tax = bs * 0.30;
		}

		System.out.println("Tax is: " + tax);

	}
}
