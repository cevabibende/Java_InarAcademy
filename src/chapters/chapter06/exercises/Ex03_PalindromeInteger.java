package chapters.chapter06.exercises;

import java.util.Scanner;

import static java.util.Collections.reverse;

public class Ex03_PalindromeInteger {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("enter a integer number for control that polindrom or not polindrom");
        int num = input.nextInt();

        reverse(num);
        isPalindrome(num);

    }

    public static int reverse(int num){
        int reversed = 0;
        while (num > 0) {
            reversed = (reversed * 10) + num % 10;
            num = num / 10;
        }
        return reversed;
    }
    public static boolean isPalindrome(int num){
        if(num == reverse(num)){
            System.out.println("Your number is a palindrom");
        }else {
            System.out.println("Your number is not a palindrom ");
        }
        return false;
    }
}
