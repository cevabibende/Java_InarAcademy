package chapters.chapter03.exercise;

import java.util.Scanner;

public class Exercise06_HealthApplicationBmi {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter weight in pounds:");
		double weight = input.nextDouble();
		
		System.out.println("Enter feet:");
		double feet = input.nextDouble();
		
		System.out.println("Enter inches:");
		double inches = input.nextDouble();
		
		final double kilogramToPound = 0.45359237;
		final double metresPerInch = 0.0254;
		
		double weightInKilograms = weight * kilogramToPound;
		double heightInMeters = (feet * 12 + inches) * metresPerInch;
		double bmi = weightInKilograms / (heightInMeters * heightInMeters);

		System.out.println("BMI is: " + bmi);
		if (bmi < 18.5) {
			System.out.println("Under weight");
		} else if (bmi < 25) {
			System.out.println("Normal");
		} else if (bmi <30){
			System.out.println("Over weight");
		} else {
			System.out.println("Obese");
			
		}
	}

}
