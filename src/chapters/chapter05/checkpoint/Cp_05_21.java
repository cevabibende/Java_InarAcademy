package chapters.chapter05.checkpoint;

import java.util.Scanner;

public class Cp_05_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter first integer: ");
        int num1 = input.nextInt();
        System.out.println("enter second integer: ");
        int num2 = input.nextInt();
        int gcd = 1;
        int tGcd = 2;
        while (tGcd <= num1 / 2 && tGcd <= num2 / 2) {
            /*
            Replacing num1 and num2 with num1/2 and num2/2
            in line 14 we get half of gcd but no errors
            in prime numbers between them purely math //
            */
            if(num1 % tGcd == 0 && num2 % tGcd == 0) {
                gcd =tGcd;
            }
            tGcd++;
        }
        System.out.println("The greatest common divisor for " + num1 + " and " + num2 + " is " + gcd);
    }
}
