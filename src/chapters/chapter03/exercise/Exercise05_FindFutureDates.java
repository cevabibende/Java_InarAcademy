package chapters.chapter03.exercise;

import java.util.Scanner;

public class Exercise05_FindFutureDates {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter today's day and number of days elapsed since today ");
		
		int enteredDay = input.nextInt();
		int howManyDaysAfter = input.nextInt();
		
		
		System.out.print(enteredDay + ". day is: ");
		
		switch (enteredDay % 7) {
		
		case 0: System.out.println("Sunday");
		break;
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;
		
		}
		System.out.print("and " + howManyDaysAfter + " days later: ");
		
		switch ((enteredDay + howManyDaysAfter) % 7) {
		
		case 1: System.out.println("monday");
		break;
		case 2: System.out.println("Tuesday");
		break;
		case 3: System.out.println("Wednesday");
		break;
		case 4: System.out.println("Thursday");
		break;
		case 5: System.out.println("Friday");
		break;
		case 6: System.out.println("Saturday");
		break;
		case 7: System.out.println("Sunday");
		break;

		}
		
		
	}

}
