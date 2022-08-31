package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise14_BmiCalculation {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final double pound = 0.45359237;
		final double inch = 0.0254;
		
		
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		
		
		System.out.println("Enter height in inches:");
		double height = input.nextDouble();
		
		
		
		double bmi = (weight * pound) / (Math.pow(height *inch , 2)) ;
		
		System.out.println("BMI is " + (int)(bmi * 10000)/10000.0);
	}

}
