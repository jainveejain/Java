package Day_1;

import java.util.Scanner;

//10:Write a program to find m to the power n. m=3 and n=4 so 3*3*3*3
public class MpowerN {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int m,n,result =1;
	
	System.out.println("Enter base number : ");
	m =sc.nextInt();
	
	System.out.println("Enter power number : ");
	n = sc.nextInt();
	
	for(int i = 1;i<=n;i++) 
	{
		result = result*m;
		
	}
	System.out.println(result);
}
}
