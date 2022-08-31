package chapters.chapter03.exercise;

import java.util.Scanner;

public class Exercise02_AddThreeNumbers {
	
	public static void main(String[] args) {
		
		int number1 = (int)(Math.random() * 100);
		int number2 = (int)(Math.random() * 100);
		int number3 = (int)(Math.random() * 100);
		
		System.out.println("first number is: " + (number1));
		System.out.println("second number is: " + (number2));
		System.out.println("thirt number is: " + (number3));
		
		System.out.println("Enter the sum of the three numbers above");
		
		Scanner input = new Scanner(System.in);
		
		int sum = input.nextInt();
		
		
		
		
	
	}


}
