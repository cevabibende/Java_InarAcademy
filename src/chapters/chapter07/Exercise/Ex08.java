package chapters.chapter07.Exercise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int FINALNUMBEROFNUMBERS = 10;
        System.out.println("Enter ten numbers integer or double");

        double[] values = getValues(input, FINALNUMBEROFNUMBERS);
        countAverage(FINALNUMBEROFNUMBERS, values);
    }

    private static void countAverage(int FINALNUMBEROFNUMBERS, double[] values) {
        double sum = 0;
        for (int i = 0; i < FINALNUMBEROFNUMBERS; i++) {
            sum += values[i];
        }
        double average = sum / FINALNUMBEROFNUMBERS;
        System.out.println();
        System.out.println("average is : " + average);
    }
    private static double[] getValues(Scanner input, int FINALNUMBEROFNUMBERS) {
        double[] values = new double[FINALNUMBEROFNUMBERS];

        for (int i = 0; i < FINALNUMBEROFNUMBERS; i++) {
            values [i] = input.nextDouble();
        }
        System.out.println("NUMBERS");
        System.out.println(Arrays.toString(values));
        return values;
    }
}
