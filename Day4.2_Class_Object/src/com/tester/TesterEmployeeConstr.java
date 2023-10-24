package com.tester;
import com.code.Employee;
import java.util.Scanner;
public class TesterEmployeeConstr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id name salary");//101 Ritesh 60000
		Employee emp1=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		
		
		System.out.println("Enter Id name salary");//102 Mitesh 40000
		int id=sc.nextInt();//
		String nm=sc.next();
		double salary=sc.nextDouble();
		Employee emp2=new Employee(id, nm, salary);
		
		
		
		
		
		
		

	}

}
