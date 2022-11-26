package chapters.chapter12.Exercises.Ex03;

import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionn {
    public static void main(String[] args) {

        try {
            int[] arr = new int[100];
            fillTheArray(arr);
            enterTheIndex(arr);

        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Out of Bounds");
        }
    }

    public static void enterTheIndex(int[] arr) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ındex that you want to get");
        int index = input.nextInt();
        System.out.println(arr[index]);
    }

    public static void fillTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);

        }
    }
}
