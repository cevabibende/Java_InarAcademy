package chapters.chapter02.classroom;

import java.util.Scanner;

public class CalculateCircleArea {
	public static void main(String[] args) {

		Scanner entry = new Scanner(System.in);
		
		double radius;
		double area;

		// read radius
		System.out.println("Enter the radius of the circle whose area is to be calculated: ");
		radius = entry.nextDouble();
		
		// calculate area
		area = radius * radius * 3.14159;
		
		// print area
		System.out.println("area of a circle with radius " + radius + " :" + area);

	}


}