package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise20_InterestCalculation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%):");
		
		double balance = input.nextDouble();
		double interestRate = input.nextDouble();
 
		double interestYield = balance * (interestRate / 1200);
		
		System.out.println("The interest is " + (int)(interestYield * 100)/ 100.0);
		
		
	}

}