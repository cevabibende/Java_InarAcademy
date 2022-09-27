package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise26_Compute_e {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for computing 'e': for example 10000, 20000, …, and 100000");
        int num = input.nextInt();

        double f = 1;
        double e = 0;
        double denominator = 0;


        for(double i = 1; i <= num; i++) {
            f *= i;
            e += (1 / f);
        }
        System.out.println("the 'e' number is: " + (1 + e));
    }
}
