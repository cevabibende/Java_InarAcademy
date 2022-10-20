package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten number for find index of smallest number");
        int FINAL_NUMBER_VALUES = 10;
        double[] values = new double[FINAL_NUMBER_VALUES];

        getValues(input, values);
        double minValue = findMinvalue(values);
        findIndexOfMinValue(values, minValue);
    }
    private static void findIndexOfMinValue(double[] values, double minValue) {
        int minValueIndex = -1;
        for (int i = 0; i < values.length; i++) {
            if (values[i] != minValue){
                minValueIndex++;
            }else {
                break;
            }
        }
        System.out.println("Index of min value : " + (minValueIndex + 1));
    }
    private static double findMinvalue(double[] values) {
        double minValue = Integer.MAX_VALUE;
        for (int i = 0; i < values.length; i++) {
            if (minValue > values[i]) {
                minValue = values[i];
            }
        }
        System.out.println("Min value is : " + minValue);
        return minValue;

    }
    private static void getValues(Scanner input, double[] values) {
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }
        System.out.println("NUMBERS");
        System.out.println(Arrays.toString(values));
    }
}
