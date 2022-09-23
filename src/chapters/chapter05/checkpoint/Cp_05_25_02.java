package chapters.chapter05.checkpoint;

public class Cp_05_25_02 {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i < 4) {
            if (i % 3 == 0) {
                i++; //we added the i++ line//
                continue;
            }
            sum += i;
            i++;

        }
        System.out.println("sum is: " + sum);
    }
}
