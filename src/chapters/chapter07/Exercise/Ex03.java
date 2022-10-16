package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter integer numbers between 1 and 100 and End the array with 0");
        int[] numbers = new int[100];

        getNumbers(input, numbers);
        getCountNumbers(numbers);
    }
    public static void getCountNumbers(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 1 ){
                System.out.println((i + 1) + " occurs " + numbers[i] + " time");
            }
            if (numbers[i] != 1 && numbers[i] > 0){
                System.out.println((i + 1) + " occurs " + numbers[i] + " times");
            }
        }
    }
    public static void getNumbers(Scanner input, int[] numbers) {
        int arr = -1;
        while (arr != 0){
            arr = input.nextInt();
            if (arr >= 1 && arr <= 100) {
                numbers[arr - 1]++;
            }
        }
    }
}
