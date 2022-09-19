package chapters.chapter05.Study;

import java.util.Scanner;

public class St02_LISTING_5_1_RepeatAdditionQuizz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1 = (int)(Math.random() * 10);
        int num2 = (int)(Math.random() * 10);

        int count = 1;
        int answer = -1;
        while(num1 + num2 != answer){
            System.out.println(num1 + " + " + num2 + " = ?");
            answer = input.nextInt();
            if(num1 + num2 != answer){
                System.out.println("you gave wrong answer please try again");
                count++;
            }
        }
        System.out.println("congrats you got it on the " + count + " rd try");
    }
}
