package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise31_FinancialApplicationComputeCDValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you deposited in the bank: ");
        double deposit = input.nextDouble();
        System.out.println("Enter the annual interest rate: ");
        double interest = input.nextDouble();
        System.out.println("Enter the maturity period: ");
        double maturity = input.nextDouble();

        double monthlyRate = (interest / 100 / 12);
        double interestAmount = 0;

        System.out.println("Month	CD Value");
        for(int i = 1; i <= maturity; i++){
            interestAmount = (deposit * monthlyRate);
            deposit += interestAmount;
            System.out.printf("%-2d	%.2f\n",i,deposit);
        }
    }
}
