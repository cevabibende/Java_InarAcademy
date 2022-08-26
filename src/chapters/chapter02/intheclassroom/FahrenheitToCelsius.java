package chapters.chapter02.intheclassroom;

import java.util.Scanner;

public class FahrenheitToCelsius {
	
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Enter the Fahrenheit value to be converted to Celsius Degrees: ");
		
		int fahrenheit = klavye.nextInt();
		
		double degree = (5.0 / 9) * (fahrenheit - 32);
		
		System.out.println(fahrenheit + " degrees Fahrenheit is " + degree + " degrees Celsius");
		
		
	}

}
