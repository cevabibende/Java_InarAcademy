package chapters.chapter06.exercises;

import java.util.Scanner;

public class Ex02_SumTheDigitsInAnInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter one integer for sum of digits");
        int num = input.nextInt();


        sumDigits(num);
    }


    private static void sumDigits(long num) {
        int length = 0;
        long lengtFNum = num;
        while (lengtFNum != 0){
            lengtFNum = lengtFNum / 10;
            length++;
        }
        System.out.println(length);
        int sum = 0;
        for (int i = 0; i < length; i++) {
                sum += num % 10;
                num = num / 10;

        }
        System.out.println("sum of digits: " + sum);
    }

}
