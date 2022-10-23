package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten double or integer numbers");

        final int numberOfValues = 10;
        double[] values = new double[numberOfValues];

        getValues(input, values);
        sortedBuble(values);
    }

    private static void sortedBuble(double[] values) {
        double temp;
        for (int i = 0; i < values.length; i++) {
            for (int j = i + 1; j < values.length; j++) {
                if (values[i] > values[j] ){
                    temp = values[i];
                    values[i] = values[j];
                    values[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(values));
    }

    private static void getValues(Scanner input, double[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println(Arrays.toString(values));
    }
}
