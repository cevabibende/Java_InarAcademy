package chapters.chapter05.Study;

import java.util.Scanner;

public class St03_CaseStudyGuessingNumberss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)(Math.random() * 101);
        int count = 0;
        int guess = -1;
        System.out.println("Guess a number between 0 and 100, including 0 and 100");
        while (guess != number){

            guess = input.nextInt();
            count++;
            if(guess < number) {
                System.out.println("you must enter a larger number");
            }
            else if(number < guess) {
                System.out.println("you must enter a smaller number");
            }
            else {
                System.out.println("congrats you got it on the " + count + " rd try");
            }
        }
    }

}
