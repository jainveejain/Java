package com.tester;

import java.util.Scanner;

import com.code.Apple;
import com.code.Fruit;
import com.code.Mango;
import com.code.Orange;

public class TestFruitApp {

	public void showFruitDetails(Fruit obj) {
		System.out.println(obj);
		obj.taste();
	}

	public static void main(String[] args) {

		System.out.println("1:Show Fruit basket 2:Add Mango 3:Add Apple 4:Add Orange 5:Total 6:Exit");

		Fruit[] fruitBasket = new Fruit[10];

		Scanner sc = new Scanner(System.in);
		int ch, index = 0;

		do {
			System.out.println("Choice:");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				
				for (Fruit fObj : fruitBasket) {
					if (fObj != null) {
						System.out.println(fObj);
						fObj.taste();
						// f will invoke Fruit class specific methods
						// runtime if Mango ref is stored
						// Mango class taste method invoked:RunTime Ploymorphism

						// can we call Child class specific method using Parent class object
						// Ans:NO

						// to call child class specific method
						// Type Cast Parent Object to Child class Object
						// DownCasting

						// use instanceof(RTTI) to avoid exception ClassCastException

						if (fObj instanceof Mango) {
							Mango obj = (Mango) fObj;// DownCast
							obj.pulp();
						} else if (fObj instanceof Orange) {// annonymous object
							((Orange) fObj).juice();// Downcasting
						} else if (fObj instanceof Apple) {
							((Apple) fObj).jam();
						}
					}

				}
				break;
			case 2:// Mango mgObj=new Mango("Mango", "Yellow", 200, 60);
				if (index < fruitBasket.length) {
					System.out.println("Enter Name Color Weight price Mango");
					// Mango mgObj=new Mango(sc.next(), sc.next(), sc.nextDouble(),
					// sc.nextDouble());
					// fruitBasket[index] = mgObj;
					// annonymous object:no name given to object
					// new Mango(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());

					// or
					fruitBasket[index] = new Mango(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
					index++;
					System.out.println("Mango Added in basket ....");

				} else {
					System.out.println("Basket Is Full");
				}

				break;
			case 3:
				if (index < fruitBasket.length) {
					System.out.println("Enter Name Color Weight price Apple");
					fruitBasket[index] = new Apple(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
					index++;
					System.out.println("Apple Added in basket ....");
				} else {
					System.out.println("Fruit Basket Is Full");
				}
				break;
			case 4:
				if (index < fruitBasket.length) {
					System.out.println("Enter Name Color Weight price Orange ");
					fruitBasket[index] = new Orange(sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble());
					index++;
					System.out.println("Orange Added in basket ....");
				} else {
					System.out.println("Fruit Basket Is Full");
				}
				break;
			case 5:
				System.out.println("-----Total Cost-----");
				double total = 0;
				for (Fruit frt : fruitBasket) {

					if (frt != null) {
						total = total + frt.getPrice();
					}

				}
				System.out.println("Total Price :" + total);

			}

		} while (ch != 6);

	}

}
