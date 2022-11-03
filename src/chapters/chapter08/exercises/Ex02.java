package chapters.chapter08.exercises;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        System.out.println("Enter a 4-by-4 matrix row by row: ");
        double[][] matrix = new double[4][4];
        fillTheArray(matrix);
        double sumMajorDiagonal = sumMajorDiagonal(matrix);
        System.out.println("Sum of the elements in the major diagonal is " + sumMajorDiagonal);
    }

    private static void fillTheArray(double[][] matrix) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }
    }
    public static double sumMajorDiagonal(double[][] matrix) {
        double sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
}