package chapters.chapter05.checkpoint;

import java.util.Scanner;

public class Cp_05_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer (the input ends if it is 0):");
        int number = input.nextInt();
        int sum = 0;

        do {
            sum += number;
            System.out.println("Enter an integer (the input ends if it is 0):");
            number = input.nextInt();
        }
        while ( number != 0 );
        System.out.println(sum);
    }
}
