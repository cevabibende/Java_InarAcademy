package chapters.chapter05.exercises;

public class Exercise20 {
    public static void main(String[] args) {
        int primeCount = 0;
        int prime = 2;
        while (prime < 1000){
            boolean isPrime = true;
            for (int i = 2; i < prime; i++){
                if(prime % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime){
                primeCount++;
                if(primeCount % 10 == 0) {
                    System.out.println(" " + prime);
                }else {
                    System.out.printf("%5d",prime);
                }
            }
            prime++;
        }
    }

}
