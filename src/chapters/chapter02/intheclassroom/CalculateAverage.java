package chapters.chapter02.intheclassroom;

import java.util.Scanner;

public class CalculateAverage {
	public static void main(String[] args) {
		Scanner eleni = new Scanner(System.in);
		
		System.out.println("enter three numbers to calculate the average");
		
		double number1 = eleni.nextDouble();
		double number2 = eleni.nextDouble();
		double number3 = eleni.nextDouble();
		
		double average = (number1 + number2 + number3) / 3;
		
		System.out.println("average of three numbers entered: " + average);
	}

}
