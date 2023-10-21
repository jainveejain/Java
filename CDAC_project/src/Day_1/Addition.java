package Day_1;
import java.util.Scanner;
// 2:Write a program to adddition of two numbers
public class Addition {

	public static void main (String [] args) {
		
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no1: ");
		a = sc.nextInt();
		System.out.println("Enter the no2 :");
		b = sc.nextInt();
		c = a+b;
		System.out.println("Addition of two numbers is :"+c);
		System.out.println("File changed");
	}
}
