package weeks.week_03;

import java.util.Random;
import java.util.Scanner;

public class FourDigitNumber {

	public static void main(String args[]){
		
		Scanner klavye = new Scanner(System.in);
		System.out.println("enter a 4 digit number from the keyboard: ");
		
		int mainNumber = klavye.nextInt();
		
		int number1 = mainNumber % 10;
		int number2 = (mainNumber/10) % 10;
		int number3 = (mainNumber/100) % 10;
		int number4 = mainNumber/1000;
		
		System.out.println(" " + number1 + " " +  number2 + " " +  number3 + " " +  number4);
		// creating an instance of Random class

		
		Random rand = new Random();
		System.out.println(rand);
		// Generating random integers in range 0 to 9

		int int1 = rand.nextInt(5);
		
		System.out.println(int1);
		// Printing random integer

		System.out.println("Random Integer:> "+int1);

	}

}