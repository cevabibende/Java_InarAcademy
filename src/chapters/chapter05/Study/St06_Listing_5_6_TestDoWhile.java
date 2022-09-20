package chapters.chapter05.Study;

import java.util.Scanner;

public class St06_Listing_5_6_TestDoWhile {
    public static void main(String[] args) {
        int data;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Enter an integer (the input ends if it is 0): ");
            data = input.nextInt();
            sum += data;
        } while(data != 0);
            System.out.println("the sum is: " + sum);

    }
}
