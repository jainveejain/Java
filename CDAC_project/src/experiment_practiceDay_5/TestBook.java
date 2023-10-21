package experiment_practiceDay_5;

import java.util.Scanner;

public class TestBook {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	Book b1 = new Book("ssf",444);
	
	System.out.println(b1);
	
	Book b2 = new Book("dsds",555);
	System.out.println(b2);
	
	for(int i=1;i<5;i++) {
		System.out.println("message");
	Book obj = new Book(sc.next(),sc.nextDouble());	
	System.out.println(obj);
	System.out.println(obj.hashCode());
	}
}
}
