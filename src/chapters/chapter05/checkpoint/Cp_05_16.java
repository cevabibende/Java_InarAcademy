package chapters.chapter05.checkpoint;

public class Cp_05_16 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (sum < 10000) {
            sum = sum + i;
            i++;
        }
        System.out.println("Example while " + sum);

        int j = 0;
        int sum2 = 0;
        for (sum2 = 0; sum2 < 10000; j++ ){
            sum2 = sum2 + j;
        }
        System.out.println("Example for " + sum2);
    }
}
