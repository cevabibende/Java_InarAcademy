package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise12_LandingDistance {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter speed at landing: ");
		System.out.println("Enter acceleration: ");
		
		double speedLanding = input.nextDouble();
		double acceleration = input.nextDouble();
		
		
		double length = (speedLanding * speedLanding) / (2 * acceleration);
		
		System.out.println("the minumum runway lenght for this airplane is: " + (int)(length * 1000) / 1000.0);
	}

}
