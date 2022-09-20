package chapters.chapter05.Study;

import java.util.Scanner;

public class St05_Listing_5_5_SentinelValue {
    public static void main(String[] args) {
        System.out.println("enter a few numbers to add (when you enter zero the program will terminate)");
        Scanner input = new Scanner(System.in);
        int numbers = input.nextInt();
        String recordNumbers = "";


        int sum = 0;
        while( numbers!=0 ){
            recordNumbers += " - " + numbers;
            sum +=numbers;
             numbers = input.nextInt();

        }
        System.out.println("The sum of the " + recordNumbers + " numbers entered is: " + sum);
    }
}
