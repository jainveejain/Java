package experiment_practice;

import java.util.Scanner;

public class TestProduct {
	public static void main(String[] args) {

		// Product p1 = new Product(202, "Pen", 80);
		// System.out.println(p1);//p1.toString() implicitly get invoked

		// create a shop...collection of product

		Product[] shop = new Product[1000];

		System.out.println("1:shw prds 2:add new prd 3:edit price 4:remove prd");
		Scanner sc = new Scanner(System.in);
		int ch, index = 0;
		do {
			System.out.println("Enter Choice");
			ch = sc.nextInt();
			switch (ch) {
			case 1:
				for (Product prd : shop) {

					System.out.println(prd);
				}
				break;
			case 2:
				if (index < shop.length) {
					System.out.println("Enter prdId name price ");
					Product prdObj = new Product(sc.nextInt(), sc.next(), sc.nextDouble());

					shop[index] = prdObj;
					index++;
				} else {
					System.out.println("array is full......");
				}
				break;
			case 3:
				System.out.println("Please enter PrdId");
				int prdId = sc.nextInt();
				for (Product prd : shop) {
					if (prd != null) {
						if (prd.getPrdId() == prdId) {
							System.out.println("Enter New Price");
							prd.setPrice(sc.nextDouble());
							break;
						} else {
							System.out.println("Prd not exist");
						}
					}
				}

				break;
			case 4:
				System.out.println("Please enter PrdId");
				prdId = sc.nextInt();
				for (int i = 0; i < shop.length; i++) {
					if (shop[i] != null) {
						if (shop[i].getPrdId() == prdId) {
							shop[i] = null;
							System.out.println("Removed....");
							break;
						} else {
							System.out.println("prd not exist");
						}
					}
				}
				break;
			}

		} while (ch != 5);

	}
}