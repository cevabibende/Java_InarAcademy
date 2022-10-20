package chapters.chapter07.Exercise;
    /*
            (Statistics: compute deviation) Programming Exercise 5.45 computes the standard
            deviation of numbers. This exercise uses a different but equivalent formula to
            compute the standard deviation of n numbers.

            To compute the standard deviation with this formula, you have to store the individual
            numbers using an array, so that they can be used after the mean is obtained.
            Your program should contain the following methods:
            Compute the deviation of double values
            public static double deviation(double[] x)
            Compute the mean of an array of double values
            public static double mean(double[] x)
            Write a test program that prompts the user to enter ten numbers and displays the
            mean and standard deviation, as shown in the following sample run:
     */

import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int FINAL_NUMBER_OF_NUMBERS = 10;
        System.out.println("Enter " + FINAL_NUMBER_OF_NUMBERS + " number for compute deviation ");
        
        double[] numbers = getNumbers(input, FINAL_NUMBER_OF_NUMBERS);
        double means = countMeans(FINAL_NUMBER_OF_NUMBERS, numbers);
        deviation(numbers, means);
    }
    private static void deviation(double[] numbers, double means) {
        double deviation = 0;
        for (int i = 0; i < numbers.length; i++) {
            deviation += Math.pow((numbers[i] - means),2);
        }
        deviation /= (numbers.length - 1);
        deviation = (int)((Math.pow(deviation,0.5) * 100000)) / 100000.0;
        System.out.println("The mean is " + means);
        System.out.println("The standard deviation is " + deviation);
    }
    private static double countMeans(int FINAL_NUMBER_OF_NUMBERS, double[] numbers) {
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        double means = (int)((sum / FINAL_NUMBER_OF_NUMBERS) * 100) / 100.0;
        return means;
    }
    private static double[] getNumbers(Scanner input, int FINAL_NUMBER_OF_NUMBERS) {
        double[] numbers = new double[FINAL_NUMBER_OF_NUMBERS];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextDouble();
        }
        System.out.println("NUMBERS");
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}
