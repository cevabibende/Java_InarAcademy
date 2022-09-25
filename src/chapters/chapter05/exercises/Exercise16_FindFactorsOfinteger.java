package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise16_FindFactorsOfinteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number to factorize");
        int number = input.nextInt();
        int factor = 1;
        String factors = "";
        while (number != factor){
            if((number / 2) % factor == 0){
                factors = factors + " " + factor;
            }
            factor++;
        }
        System.out.println(factors + " " + number);
    }
}
