package chapters.chapter06.exercises;

import java.util.Scanner;

public class Ex05_SortThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter three number for sort");
        System.out.println("first number");
        double num1 = input.nextDouble();
        System.out.println("second number");
        double num2 = input.nextDouble();
        System.out.println("thirth number");
        double num3 = input.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    private static void displaySortedNumbers(double num1, double num2, double num3) {

        double max = 0;
        double middle = 0;
        double min = 0;
        if(num1 < num2 && num1 < num3){
            min = num1;
            if(num2 < num3){
                middle = num2;
                max = num3;
            }else{
                middle = num3;
                max = num2;
            }
        }else if(num2 < num1 && num2 < num3){
            min = num2;
            if(num1 < num3){
                middle = num1;
                max = num3;
            }else {
                middle = num3;
                max = num1;
            }
        } else if(num3 < num1 && num3 < num3) {
            min = num3;
            if (num1 < num2) {
                middle = num1;
                max = num2;
            } else {
                middle = num2;
                max = num1;
            }
        }
        System.out.println(min + " < " + middle + " < " + max);
    }
}
