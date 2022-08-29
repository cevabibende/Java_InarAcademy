package weeks.week_03;

import java.util.Scanner;

public class AgeRank {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		System.out.println("Enter the ages of the three friends to determine the oldest and youngest: ");
		
		int age1 = klavye.nextInt();
		int age2 = klavye.nextInt();
		int age3 = klavye.nextInt();
		
		if (age1 > age2 && age1 > age3){
			System.out.println("Our oldest friend is: " + age1 + " years old");
		} else if (age2 > age1 && age2 > age3) {
			System.out.println("Our oldest friend is: " + age2 + " years old");
		} else {
			System.out.println("Our oldest friend is: " + age3 + " years old");
		}
		
		if (age1 < age2 && age1 < age3){
			System.out.println("Our youngest friend is: " + age1 + " years old");
		} else if (age2 < age1 && age2 < age3) {
			System.out.println("Our youngest friend is: " + age2 + " years old");
		} else {
			System.out.println("Our youngest friend is: " + age3 + " years old");
		}
		
		
		
		
	}

}
