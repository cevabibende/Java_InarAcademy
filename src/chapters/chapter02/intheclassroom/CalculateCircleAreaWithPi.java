package chapters.chapter02.intheclassroom;

import java.util.Scanner;

public class CalculateCircleAreaWithPi {

	public static void main(String[] args) {
		
		final double PI = 3.14159;
		
		Scanner entry = new Scanner(System.in);
		
		double radius;
		double area;

		// read radius
		System.out.println("Enter the radius of the circle whose area is to be calculated: ");
		radius = entry.nextDouble();
		
		// calculate area
		area = radius * radius * PI;
		
		// print area
		System.out.println("area of a circle with radius " + radius + " :" + area);

		
	}

}
