package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise13_FindSmallest_n_Such_n3_12000 {
	public static void main(String[] args) {

		int number = 12000;
		int i = 0;
		while(Math.pow(i,3) < number) {
			i++;
		}
		System.out.println("The largest integer cubed expression less than " + number + " entered is " + i);
	}

}
