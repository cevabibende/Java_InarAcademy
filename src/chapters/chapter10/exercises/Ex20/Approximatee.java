package chapters.chapter10.exercises.Ex20;

import java.math.BigDecimal;

public class Approximatee {
    public static void main(String[] args) {

        for (int i = 100; i <= 1000; i += 100) {
            BigDecimal sum = BigDecimal.ONE;
            for (int j = 1; j < i; j++) {
                BigDecimal e = BigDecimal.ONE.divide(factorial(j),25,BigDecimal.ROUND_UP);
                sum=sum.add(e);
            }
            System.out.println("for i : " + i + "  : " + sum);
        }
    }

    public static BigDecimal factorial(long n) {
        BigDecimal result = BigDecimal.ONE;
        for (int i = 1; i <= n; i++) {
            result = result.multiply(new BigDecimal(i + ""));
        }
        return result;
    }
}
