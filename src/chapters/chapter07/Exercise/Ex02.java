package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the ten numbers for reverse");

        int[] numbers = getIntArray(input);
        outReverseArray(numbers);
    }

    private static void outReverseArray(int[] numbers) {
        int[] reverse = new int[10];
        for (int i = 0; i < 10; i++) {
            reverse[i] = numbers[10 - 1 -i];
        }
        System.out.println("Our reverse array is: ");
        System.out.println(Arrays.toString(reverse));
    }
    private static int[] getIntArray(Scanner input) {
        int[] numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            numbers[i] = input.nextInt();
        }
        System.out.println("our array is: ");
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}
