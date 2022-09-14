package chapters.chapter04.exercise;

import java.util.Scanner;

public class Exercise08_FindCharacterASCII {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		int ascııCode = input.nextInt();

		System.out.println("The character for ASCII code " + ascııCode + " is " + (char) ascııCode);

	}
}
