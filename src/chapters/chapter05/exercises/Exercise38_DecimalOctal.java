package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise38_DecimalOctal {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value ");
        int decimal = input.nextInt();
        String octal = "";
        for (int i = decimal; i > 0; i /= 8) {
            octal = (i % 8) + octal;
        }
        System.out.println("For " + decimal + " decimal value equals " + octal + " octal value");
    }
}