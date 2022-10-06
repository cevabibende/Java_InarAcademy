package chapters.chapter06.exercises;

public class Ex01_pentagonalNumbers {
    public static void main(String[] args) {
        getPentagonalNumber(100);
    }

    private static void getPentagonalNumber(int i) {
        int count = 0;
        for ( i = 1; i <= 100; i++) {
            System.out.printf("%6d", i * (3 * i - 1) / 2);
            count++;
            if (count % 10 == 0) {
                System.out.println(" ");
            }
        }

    }

}
