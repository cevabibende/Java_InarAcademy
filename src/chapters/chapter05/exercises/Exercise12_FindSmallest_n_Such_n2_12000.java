package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise12_FindSmallest_n_Such_n2_12000 {
	public static void main(String[] args) {

		int number = 12000;
		int i = 0;
		while (Math.pow(i, 2) < number) {
			i++;
		}
		System.out.println("The smallest perfect square expression greater than the entered number " + number + " is " + i);
	}

}
