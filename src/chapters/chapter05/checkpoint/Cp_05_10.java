package chapters.chapter05.checkpoint;

import java.util.Scanner;

public class Cp_05_10 {
    public static void main(String[] args) {
        System.out.println("enter 5 numbers to sum");

        Scanner input = new Scanner(System.in);
        int number = 0;
        int sum = 0;
        int count;
        for (count = 0; count < 5; count ++){
            number = input.nextInt();
            sum += number;
        }
        System.out.println("The sum of the " + count + " numbers entered is: " + sum);
    }
}
