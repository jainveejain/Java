package Day_1;

import java.util.Scanner;

//7. Accept a lowercase character from the user and check whether the character is a vowel or consonant. 
//(Hint: a, e, i, o, u are vowels)

public class VowelConsonent {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Character");
		char ch = sc.next().charAt(0);

		char[] arrchar = { 'a', 'e', 'i', 'o', 'u' };

		for (int i = 0; i < arrchar.length; i++) {
			if (ch == arrchar[i])

			{
				System.out.println("the character is vowel");
				break;
			} else if (i == arrchar.length - 1) {

				System.out.println("the character is consonent");

			}
		}

	}

}
