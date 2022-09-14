package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise01_CountPositiveNegativeNumbersAndComputeAverageNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter a non-zero number (enter zero to exit)");

		double avarage = 0;
		double sum = 0;
		int pozitiveCount = 0;
		int negativeCount = 0;
		int number = input.nextInt();
		while (number != 0) {
			System.out.println("enter a non-zero number (enter zero to exit)");
			number = input.nextInt();
			if (number < 0) {
				negativeCount++;
			} else {
				pozitiveCount++;

				sum += number;
				avarage = sum / (negativeCount + pozitiveCount);
			}

		}
		System.out.println("The number of numbers entered is " + (negativeCount + pozitiveCount));
		System.out.println("The number of negative entered is " + negativeCount);
		System.out.println("The number of pozitive entered is " + pozitiveCount);
		System.out.println("The sum of the entered numbers is " + sum);
		System.out.println("The average of the numbers entered is " + avarage);
	}

}