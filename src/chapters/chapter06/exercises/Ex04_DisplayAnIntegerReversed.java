package chapters.chapter06.exercises;

import java.util.Scanner;

public class Ex04_DisplayAnIntegerReversed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a integer number for reverse");
        int num = input.nextInt();

        reverse(num);
    }
    public static void reverse(int num){
        int reverse = 0;
        while(num != 0){
            reverse = (reverse * 10) + num % 10;
            num = num / 10;
        }
        System.out.println(reverse);
    }
}
