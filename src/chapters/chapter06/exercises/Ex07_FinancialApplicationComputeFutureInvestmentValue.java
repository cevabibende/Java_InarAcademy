package chapters.chapter06.exercises;

import java.util.Scanner;

public class Ex07_FinancialApplicationComputeFutureInvestmentValue {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" enter the invest amount: ");
        double investmentAmount = input.nextDouble();
        System.out.println("enter the interest rate");
        double annualInterestRate = input.nextDouble();

        System.out.println("Years       Future Value");

        for (int years = 1; years <= 30 ; years++) {
            System.out.println(years + "           " + (int)(futureInvestmentValue(investmentAmount, annualInterestRate, years) * 100) / 100.0);
        }
    }

    private static double futureInvestmentValue(double investmentAmount, double annualInterestRate, int years) {
        double futureValue = investmentAmount * Math.pow(1 + annualInterestRate / 1200, years * 12);
        return futureValue;
    }
}
