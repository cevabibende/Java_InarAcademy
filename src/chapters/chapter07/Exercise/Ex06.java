package chapters.chapter07.Exercise;
/*
(Revise Listing 5.15, PrimeNumber.java) Listing 5.15 determines whether a number
n is prime by checking whether 2, 3, 4, 5, 6, . . . , n/2 is a divisor. If a divisor
is found, n is not prime. A more efficient approach is to check whether any of the
prime numbers less than or equal to 2n can divide n evenly. If not, n is prime.
Rewrite Listing 5.15 to display the first 50 prime numbers using this approach.
You need to use an array to store the prime numbers and later use them to check
whether they are possible divisors for n.
 */

import java.util.Arrays;

public class Ex06 {
 public static void main(String[] args) {

     int FINALPRIMENUMBER = 50;
     int primeNumberCount = 0;
     int number = 2;
     int[] primes = new int[FINALPRIMENUMBER];
     isPrimeAndGetPrime(FINALPRIMENUMBER, primeNumberCount, number, primes);
     writePrimes(primes);
 }
    private static void writePrimes(int[] primes) {
        for (int i = 0; i < primes.length; i++) {
            if ((i + 1)% 10 == 0) {
                System.out.printf("%4d %n", primes[i]);
            }else{
                System.out.printf( "%4d", primes[i] );
            }
        }
    }
    private static void isPrimeAndGetPrime(int FINALPRIMENUMBER, int primeNumberCount, int number, int[] primes) {
        while (primeNumberCount < FINALPRIMENUMBER){

            boolean isPrime = true;
            for (int i = 2; i < Math.pow(number,0.5); i++){
                if(number % i == 0){
                    isPrime = false;
                }
            }

            if (isPrime == true){
                primes[primeNumberCount] = number;
                primeNumberCount++;
            }
            number++;
        }
    }
}
