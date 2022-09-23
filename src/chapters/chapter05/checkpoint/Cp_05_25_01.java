package chapters.chapter05.checkpoint;

public class Cp_05_25_01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 4; i++) {
            if (i % 3 == 0) {
                continue;
            }
            sum += i;
        }
        System.out.println("sum is: " + sum);
    }
}
