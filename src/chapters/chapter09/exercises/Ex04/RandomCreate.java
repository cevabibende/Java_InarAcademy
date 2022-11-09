package chapters.chapter09.exercises.Ex04;

import java.util.Random;

public class RandomCreate {
    public static void main(String[] args) {
        System.out.println("-----------first-------------");
        Random random01 = new Random(1_000);
        for (int i = 0; i < 50; i++) {
            int rand1 = random01.nextInt(100);
            System.out.printf("%4d",rand1);
            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }
}
