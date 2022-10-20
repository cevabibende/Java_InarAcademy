package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten number for find min value");

        int FINAL_NUMBER_VALUE = 10;
        double[] values = new double[FINAL_NUMBER_VALUE];

        getNumbers(input, values);

        findMinValue(values);
    }

    private static void findMinValue(double[] values) {
        double minValue = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]){
                minValue = values[i];
            }
        }
        System.out.println("min value : " + minValue);
    }

    private static void getNumbers(Scanner input, double[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println("NUMBERS");
        System.out.println(Arrays.toString(values));
    }
}
