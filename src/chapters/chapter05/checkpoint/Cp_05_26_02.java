package chapters.chapter05.checkpoint;

public class Cp_05_26_02 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            if (number == 10 || number == 11) {
                // continue satırını sildik //
            }
            sum += number;
        }
        System.out.println("The sum is " + sum);
    }
}



