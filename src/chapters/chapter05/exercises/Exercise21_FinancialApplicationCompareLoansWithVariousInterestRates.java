package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise21_FinancialApplicationCompareLoansWithVariousInterestRates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Loan Amount:");
        double loan = input.nextDouble();
        System.out.println("Number of Years");
        double years = input.nextDouble();
        System.out.println("Interest Rate       Monthly Payment     Total Payment");
        for (double i = 5; i <= 8; i += 0.125){
            double monthlyPayment = loan * (i / 1200) / (1 - 1 / Math.pow(1 + (i / 1200), years * 12)) *100;
            double totalPayment = monthlyPayment * years * 12 * 100;
            System.out.printf("%.3f$ %22.2f %22.2f\n\n",i,monthlyPayment,totalPayment);

        }
    }
}
