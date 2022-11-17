package chapters.chapter10.exercises.Ex06;

public class PrimeNumbers {
    public static void main(String[] args) {

        StackOfIntegers prime = getPrimeNumber();
        while (!prime.empty()) {
            System.out.print(prime.pop() + " ");
        }
    }

    private static StackOfIntegers getPrimeNumber() {
        StackOfIntegers stack = new StackOfIntegers();

        for (int number = 2; number < 120; number++) {
            if (isPrime(number)) {
                stack.push(number);
            }
        }
        return stack;
    }

    private static boolean isPrime(int number) {
        for (int divisor = 2; divisor <= number / 2; divisor++) {
            if (number % divisor == 0) {
                return false;
            }
        }
        return true;
    }
}
