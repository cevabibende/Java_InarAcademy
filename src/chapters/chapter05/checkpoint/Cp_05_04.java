package chapters.chapter05.checkpoint;
import java.util.Scanner;
public class Cp_05_04 {
    public static void main(String[] args) {
        System.out.println("enter a few numbers to choose the bigger one");
        Scanner input = new Scanner(System.in);
        int number;
        int max;
        number = input.nextInt();
        max = number;
        while (number != 0) {
            number = input.nextInt();
            if (number > max) {
                max = number;
            }
        }
        System.out.println("max is " + max);
        System.out.println("number " + number);
    }
}
