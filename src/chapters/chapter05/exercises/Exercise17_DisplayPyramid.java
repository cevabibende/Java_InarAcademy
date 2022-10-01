package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise17_DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter number of lines");
        int lines = input.nextInt();

        for(int i = 1; i <= lines; i++) {
            for(int j = 1; j <= lines - i; j++) {
                System.out.print("   ");
            }

            for(int k = i; k > 0; k--) {
                System.out.printf("%3d" , k);
            }

            for(int l = 2; l < i + 1; l++) {
                System.out.printf("%3d" , l);
            }

            System.out.println();
        }
    }
}