package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise13_CompoundValue {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the monthly saving amount:");
		double amount = input.nextDouble();
		
		 double rate  = (1 + 0.00417);
		
		double MonthValue = amount * rate;
		MonthValue = (amount + MonthValue) * rate;
		MonthValue = (amount + MonthValue) * rate;
		MonthValue = (amount + MonthValue) * rate;
		MonthValue = (amount + MonthValue) * rate;
		MonthValue = (amount + MonthValue) * rate;
		
		System.out.println("After the sixth month, the account value is: " + (int)(MonthValue * 100) / 100.0);
				
	}

}
