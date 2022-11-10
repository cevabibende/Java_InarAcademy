package chapters.chapter09.exercises.Ex13;

import java.util.Scanner;

public class TestLocation {
    public static void main(String[] args) {
        double[][] array = getRowColFromUser();
        fillTheArrayRandomValues(array);
        displayArray(array);

        Location location = locateLargest(array);
        location.display();
    }

    private static Location locateLargest(double[][] array) {
        int row = -1;
        int col = -1;
        double maxValue = Double.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (maxValue < array[i][j]) {
                    maxValue = array[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        Location location = new Location(row, col, maxValue);
        return location;
    }

    private static void displayArray(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf(" [%2.0f] ", array[i][j]);
            }
            System.out.println();
        }
    }

    private static void fillTheArrayRandomValues(double[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (Math.random() * 50);
            }
        }
    }

    private static double[][] getRowColFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the array:");
        int row = input.nextInt();
        int col = input.nextInt();
        double[][] array = new double[row][col];
        return array;
    }

}
