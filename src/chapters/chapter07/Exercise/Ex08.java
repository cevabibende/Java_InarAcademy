package chapters.chapter07.Exercise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int FINALNUMBEROFNUMBERS = 10;
        System.out.println("Enter ten numbers integer or double");

        double[] values = new double[FINALNUMBEROFNUMBERS];
        System.out.println("NUMBERS");
        for (int i = 0; i < FINALNUMBEROFNUMBERS; i++) {
            values [i] = input.nextDouble();
            System.out.print(values[i] + "   ");
        }


        double sum = 0;
        for (int i = 0; i < FINALNUMBEROFNUMBERS; i++) {
            sum += values[i];
        }
        double average = sum / FINALNUMBEROFNUMBERS;
        System.out.println();
        System.out.println("average is : " + average);
    }
}
