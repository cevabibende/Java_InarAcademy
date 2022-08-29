package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise09_Acceleration {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first speed in metres/second:");
		System.out.println("enter last speed in metres/second:");
		System.out.println("enter total time in second:");
		
		double firstSpeed = input.nextDouble();
		double lastSpeed = input.nextDouble();
		double second = input.nextDouble();
		
		double acceleration = (lastSpeed - firstSpeed) / second;
		
		System.out.println("your acceleration in total time is " + acceleration);
		
	}
	

}
