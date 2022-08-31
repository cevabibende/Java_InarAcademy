package chapters.chapter03.exercise;

import java.util.Scanner;

public class Exercise01_SolveQuadraticEquations {
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);

		System.out.println("enter values for a, b, and c: ");
		
		double a = input.nextDouble();
		double b = input.nextDouble();
		double c = input.nextDouble();
		
		double diskrimant = Math.pow(b , 2) - 4 * a * c;
		
		double r1 = (int)((-b + Math.pow(diskrimant , 0.5)) / (2 * a) * 1000) / 1000.0;
		double r2 = (int)((-b - Math.pow(diskrimant , 0.5)) / (2 * a) * 1000) / 1000.0;
		

		if (diskrimant < 0) {
			System.out.println("The equation has no real roots");
		} else if (diskrimant == 0) {
			System.out.println("The equation has only one root: " + r1);
		} else if (diskrimant > 0) {
			System.out.println("The equation has two roots: " + r1 + " and " + r2);
		}
	
	}
}

