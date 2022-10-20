package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of integers you want to enter");

        int[] values = getValues(input);
        int minValue = findMinValue(values);
        findGCD(values, minValue);
    }

    private static void findGCD(int[] values, int minValue) {
        int gcd = 1;
        int divisor = 2;
        while (divisor <= minValue) {
            boolean divide = true;
            for (int i = 0; i < values.length; i++) {
                if (values[i] % divisor != 0){
                    divide = false;
                    break;
                }
            }
            if (divide){
                gcd = divisor;
            }
            divisor++;
        }
        System.out.println("gcd is: " + gcd);
    }
    private static int findMinValue(int[] values) {
        int minValue = values[0];
        for (int i = 1; i < values.length; i++) {
            if (minValue > values[i]){
                minValue = values[i];
            }
        }
        System.out.println("min value is : " + minValue);
        return minValue;
    }
    private static int[] getValues(Scanner input) {
        int FINAL_NUMBER = input.nextInt();
        System.out.println("enter " + FINAL_NUMBER + " number");
        int[] values = new int[FINAL_NUMBER];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextInt();
        }
        System.out.println("numbers");
        System.out.println(Arrays.toString(values));
        return values;
    }
}
