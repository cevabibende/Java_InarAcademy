package chapters.chapter12.Exercises.Ex02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputMismatchExceptionn {
    public static void main(String[] args) {
        boolean again = true;
        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Enter two ınteger to sum");
                int n1 = input.nextInt();
                int n2 = input.nextInt();
                System.out.print(n1 + " + " + n2 + " = " +  (n1 + n2));
                again=false;
            } catch (InputMismatchException ex) {
                System.out.println("TRY AGAIN ,Invalid input");
            }

        } while (again);
    }
}
