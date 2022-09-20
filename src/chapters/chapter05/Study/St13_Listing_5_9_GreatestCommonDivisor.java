package chapters.chapter05.Study;

import java.util.Scanner;

public class St13_Listing_5_9_GreatestCommonDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer: ");
        int num1 = input.nextInt();
        System.out.println("enter second integer: ");
        int num2 = input.nextInt();
        int gcd = 1;
        int tGcd = 2;
        while (tGcd <= num1 && tGcd <= num2) {
            if(num1 % tGcd == 0 && num2 % tGcd == 0) {
                gcd =tGcd;
            }
                tGcd++;
        }
                System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
    }
}