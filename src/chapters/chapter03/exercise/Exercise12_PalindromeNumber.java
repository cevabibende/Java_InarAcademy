package chapters.chapter03.exercise;

import java.util.Scanner;

public class Exercise12_PalindromeNumber {
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);

		System.out.println("Enter a three-digit integer:");
		int threeDigitNumber = input.nextInt();

		if (threeDigitNumber / 100 == threeDigitNumber % 10) {
			System.out.println(threeDigitNumber + " is palindrome");
		} else {
			System.out.println(threeDigitNumber + " is not a palindrome");

		}

	}
}