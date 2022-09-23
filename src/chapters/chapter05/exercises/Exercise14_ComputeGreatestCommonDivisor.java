package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise14_ComputeGreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter 2 digit number");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int gcd = num1 < num2 ? num1 : num2;

        while(num1 % gcd != 0 || num2 % gcd != 0){
            gcd--;
        }
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
    }
}
