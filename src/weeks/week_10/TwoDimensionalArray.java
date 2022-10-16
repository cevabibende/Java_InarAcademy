package weeks.week_10;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the row and col numbers");
        int row = input.nextInt();
        int col = input.nextInt();
        int[][] arr = new int[row][col];


        fill2dArrwithRandomValues(arr,0, 10);
    }

    private static void fill2dArrwithRandomValues(int[][] arr, int start, int limit) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                arr[row][col] =(int)(Math.random() * (limit - start) + start);
            }
        }
    }
}
