package Day_1;

import java.util.Scanner;

public class PallendromString {

	public static void main(String[] args) {

		String s;
		boolean isPallendrom = true;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the String:");
		s = sc.nextLine();
		char chrArr[] = s.toCharArray();
		for (int i = 0, j = s.length() - 1; i < s.length() / 2 && j >= s.length() / 2; i++, j--) {
			if (chrArr[i] == chrArr[j]) {
			} else {
				isPallendrom = false;

				break;
			}

		}
		if (isPallendrom) {
			System.out.println("String is Pallendrom");
		} else {
			System.out.println("String not Pallendrom");
		}
	}
}