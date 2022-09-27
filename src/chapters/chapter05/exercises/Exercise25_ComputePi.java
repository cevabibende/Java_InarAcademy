package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise25_ComputePi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for compute pi: (for example 10000, 20000, 100000) ");
        int num = input.nextInt();
        double pi = 0;

        for(double i = 1; i <= num; i++ ){
            pi += (Math.pow((-1),(i+1)) / (2 * i - 1));

        }
        System.out.println("the pi number: " + (4 * pi));
    }
}
