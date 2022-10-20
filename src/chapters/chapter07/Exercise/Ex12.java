package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int FINAL_NUMBER_OF_NUMBERS = 10;
        System.out.println("Enter " + FINAL_NUMBER_OF_NUMBERS + " for reverse that numbers");

        double[] numbers = getNumbers(input, FINAL_NUMBER_OF_NUMBERS);
        reverse(FINAL_NUMBER_OF_NUMBERS, numbers);
    }
    private static void reverse(int FINAL_NUMBER_OF_NUMBERS, double[] numbers) {
        double[] reverse = new double[FINAL_NUMBER_OF_NUMBERS];
        for (int i = 0, j=9;  i < reverse.length; i++, j--) {
            reverse[i] = numbers[j];
        }
        System.out.println("REVERSE");
        System.out.println(Arrays.toString(reverse));
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
