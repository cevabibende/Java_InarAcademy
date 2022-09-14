package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise08_FindHighestScore {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String highPointsName = "";
		int highPoints = 0;
		System.out.println("Enter the number of students");
		int numberStudent = input.nextInt();
		
		
		for(int i=0; i < numberStudent; i++) {
			System.out.println("student " + (i + 1) + " ----name: ");
			String name = input.next();
			
			System.out.println("student's score: ");
			int examResult = input.nextInt();
			
			if(examResult > highPoints) {
				highPoints = examResult;
				highPointsName = name;
			}
		}	
		System.out.println("congratulations " + highPointsName + " you have the highest score " + highPoints);
	}
	

}
