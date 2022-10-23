package chapters.chapter07.Exercise;

import java.util.Scanner;

public class Ex20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int numbers = 10;
        System.out.println("Enter ten double numbers to sort from largest to smallest");
        double[] values = new double[numbers];
        for (int i = 0; i < values.length; i++) {
            values[i] = input.nextDouble();
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < values.length; i++) {
            double maxValues = values[i];
            int maxIndex = i;
            for (int j = i + 1; j < values.length; j++) {
                if (maxValues < values[j]) {
                    maxValues = values[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i){
                values[maxIndex] = values[i];
                values[i] = maxValues;
            }
        }

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

    }
}
