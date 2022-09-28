package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise30_FinancialApplicationCompoundValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your monthly savings");
        double save = input.nextDouble();
        System.out.println("Enter annual interest rate: ");
        double interest = input.nextDouble();
        System.out.println("Enter the number of months:");
        int month = input.nextInt();

        double monthlyRate = (interest / 100 / 12);
        double interestAmount = 0;

        double j = (save + save * monthlyRate);
        for(int i = 1; i <= month; i++){
                interestAmount = (save + interestAmount) * (1 + monthlyRate);
        }
        System.out.println(interestAmount);
    }
}
