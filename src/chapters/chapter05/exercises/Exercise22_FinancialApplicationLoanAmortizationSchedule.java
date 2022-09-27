package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise22_FinancialApplicationLoanAmortizationSchedule {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Loan Amount:");
        double loan = input.nextDouble();
        System.out.println("Number of Years: ");
        double years = input.nextDouble();
        System.out.println("Annual Interest Rate: ");
        double interestRate = input.nextDouble();

        double montlyInterestRate = interestRate / 1200;
        double montlyPayment = loan * montlyInterestRate / (1 - 1 / Math.pow(1 + montlyInterestRate, years * 12));
        double totalPayment = montlyPayment * years * 12;

        System.out.printf("Monthly payment: %6.2f \n\n" , montlyPayment);
        System.out.printf("Total payment : %.2f\n " , totalPayment);
        System.out.println("\nPayment#\tInterest\tPrincipal\tBalance");

        for(int pay = 1; pay <= years * 12; pay++ ){
            double interest = montlyInterestRate * loan;
            double principal = montlyPayment - interest;
            loan = loan - principal;
            System.out.printf("%-2d\t\t%9.2f\t\t%6.2f \t\t%7.2f\n",pay,interest,principal ,loan);
        }


    }
}

