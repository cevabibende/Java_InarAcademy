package chapters.chapter03.exercise;

import java.util.Scanner;

public class Exercise09_CheckISBN10 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the first 9 number of an ISBN as integer:");
		int ısbn = input.nextInt();

		int num1 = ısbn / 100_000_000;
		int remainingNum = ısbn % 100_000_000;

		int num2 = remainingNum / 10_000_000;
		remainingNum %= 10000000;

		int num3 = remainingNum / 1_000_000;
		remainingNum %= 1_000_000;

		int num4 = remainingNum / 100_000;
		remainingNum %= 100_000;

		int num5 = remainingNum / 10_000;
		remainingNum %= 10_000;

		int num6 = remainingNum / 1_000;
		remainingNum %= 1_000;

		int num7 = remainingNum / 100;
		remainingNum %= 100;

		int num8 = remainingNum / 10;
		remainingNum %= 10;

		int num9 = remainingNum;

		int sum = ((num1 * 1 + num2 * 2 + num3 * 3 + num4 * 4 + num5 * 5 + num6 * 6 + num7 * 7
				+ num8 * 8 + num9 * 9) % 11);

		if (sum == 10) {
			System.out.println("The ISBN number is " + num1 + "" + num2 + "" + num3 + "" + num4 + "" + num5
					+ "" + num6 + "" + num7 + "" + "" + num8 + "" + num9 + "" + "X");
		}
		else {
			System.out.println("The ISBN-10 number is " + num1 + "" + num2 + "" + num3 + "" + num4 + "" + num5
					+ "" + num6 + "" + num7 + "" + "" + num8 + "" + num9 + "" + 
					sum);
		}

	}
}