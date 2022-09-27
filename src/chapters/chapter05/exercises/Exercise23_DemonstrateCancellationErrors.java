package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise23_DemonstrateCancellationErrors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 'n' number");
        int n = input.nextInt();
        double sumL = 0;
        double sumR = 0;

        for(double i = 1; i <= n; i++){
            sumL += (1 / i);
        }
        for(double j = n; j >= 1; j--){
            sumR += (1/j);
        }
        System.out.println("left sum " + sumL);
        System.out.println("right sum " + sumR);
        System.out.println("The differences between them : " + (sumR - sumL));
    }
}
