package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise09_FindTwoHighestScores {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String highScoreName = "";
		int highScore = 0;
		String secondScoreName = "";
		int secondScore = 0;
		
		System.out.println("enter the number of students");
		int numberStudent = input.nextInt();
		System.out.println("Enter each student’s name and score");
		for(int i = 0; i < numberStudent; i++) {
			System.out.println("student: " + (i + 1) + " ----name:");
			String name = input.next();
			System.out.println("student's score: ");
			int score = input.nextInt();
			
			if(score > highScore) {
				secondScore = highScore;
				secondScoreName = highScoreName;
				highScore = score;
				highScoreName = name;
			}else if(score > secondScore) {
				secondScore = score;
				secondScoreName = name;
			}
		}
		System.out.println("highScoreName ---" +highScoreName + " --- highScore--- " + highScore);
		System.out.println("secondScoreName ---" + secondScoreName + " --- secondScore--- " + secondScore);
	}

}
