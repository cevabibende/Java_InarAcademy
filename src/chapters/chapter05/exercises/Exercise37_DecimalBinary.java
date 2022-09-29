package chapters.chapter05.exercises;

import java.util.Scanner;

public class Exercise37_DecimalBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a decimal value ");
        int decimal = input.nextInt();
        String output = "";
        while (decimal > 0) {
            output += (decimal % 2);
            decimal = decimal / 2;
        }
        //terse döndür outputu
        for (int i = output.length() - 1; i >= 0; i--) {
            System.out.print(output.charAt(i));
        }
    }
}
