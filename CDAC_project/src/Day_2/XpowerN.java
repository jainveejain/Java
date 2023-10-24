package Day_2;
//2. Write a program to accept two integers x and n and compute x raised to n.
import java.util.Scanner;

public class XpowerN {
	
	public static void main(String[] args) {
		
	
int x,n, result=1;
Scanner sc =new Scanner(System.in);
System.out.println("Enter the base");
 x = sc.nextInt();
 System.out.println("Enter the power");
 n = sc.nextInt();
 for(int i=1;i<=n;i++)
 {
	 result =x*result;
 }
 System.out.println("the value of result is:"+result);
}
}