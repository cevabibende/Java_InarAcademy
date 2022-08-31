package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise19_AreaTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Enter three points for a triangle:");
		
		
		System.out.println("Enter first point of the triangle as 'x y':");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Enter second point of the triangle as 'x y':");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();

		System.out.println("Enter thirth point of the triangle as 'x y':");
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();

		double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
		double side3 = Math.pow(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2), 0.5);

		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		System.out.println("The area of the triangle is " + (int)(area*100)/100.0);

	}
}