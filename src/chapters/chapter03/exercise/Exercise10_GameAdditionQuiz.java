package chapters.chapter03.exercise;

import java.util.Scanner;

public class Exercise10_GameAdditionQuiz {
	public static void main(String[] args) {

		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		System.out.println("What is the result of " + number1 + " + " + number2 + "? ");

		Scanner input = new Scanner(System.in);
		int answer = input.nextInt();

		if (number1 + number2 == answer) {
			System.out.println("well done you are a marvel");
		} else {
			System.out.println("your answer is wrong, ");
			System.out.println("it should be like that " + number1 + " + " + number2 + " = " + (number1 + number2) + " let's do it again");
		}
	}

}