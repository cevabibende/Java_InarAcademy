package chapters.chapter05.checkpoint;

public class Cp_05_26_01 {
    public static void main(String[] args) {
        int sum = 0;
        int number = 0;
        while (number < 20) {
            number++;
            sum += number;
            if (sum >= 100) {
                //(break komutu sildik)//
            }
        }
        System.out.println("The number is " + number);
        System.out.println("The sum is " + sum);
    }
}
