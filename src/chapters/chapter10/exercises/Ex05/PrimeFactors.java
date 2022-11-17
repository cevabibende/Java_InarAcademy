package chapters.chapter10.exercises.Ex05;

import java.util.EnumMap;
import java.util.Enumeration;
import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        int number = getNumberFromUser();

        StackOfIntegers stack = findPrimeFactor(number);
        displayFaactorReversed(stack);
    }

    private static void displayFaactorReversed(StackOfIntegers stack) {

        while(!stack.empty()) {
            System.out.println(stack.pop() + " ");
        }
        System.out.println();
    }

    private static int getNumberFromUser() {
        Scanner input = new Scanner(System.in);
        int number = -1;
        do {
            System.out.println("enter a positive number to finf prime factor");
            number = input.nextInt();
        } while (number <= 0);
        return number;
    }

    private static StackOfIntegers findPrimeFactor(int number) {
        StackOfIntegers stack = new StackOfIntegers();
        int primeFactor = 2;

        while (number != 1) {
            if (isPrime(primeFactor)) {
                while (number % primeFactor == 0) {
                    stack.push(primeFactor);
                    number /= primeFactor;
                }
            }
            primeFactor++;
        }
        return stack;
    }

    private static boolean isPrime(int primeFactor) {
        for (int divisor = 2; divisor <= primeFactor / 2; divisor++) {
            if (primeFactor % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
