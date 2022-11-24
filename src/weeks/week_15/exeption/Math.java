package weeks.week_15.exeption;

import chapters.chapter06.classroom.Arttir;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Math {
    private final static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        /*
        try {
            divWithTryCatch();
        } catch (ArithmeticException ae){
            System.out.println("yanlış girdin aritmetik try catch yakaladı");
        }
        System.out.println("main bitti");

         */

        divWithTryOne();

    }

    public static int div() {
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        if (n2 == 0) {
            System.out.println("yanlış girdi");
            return -1;
        }

        System.out.printf("%d / %d = %d", n1, n2, div());
        return n1/n2;
    }

    public static void divWithTryCatch() {
        System.out.println("please enter two number");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        try {
            System.out.println(n1/n2);
        } catch (IndexOutOfBoundsException ae) {
            System.out.println("yanlış girdin IndexOutOfBounds try catch yakaladı");
        } catch (NullPointerException ae) {
            System.out.println("yanlış girdin null point try catch yakaladı");
        } catch (InputMismatchException ae) {
            System.out.println("InputMismatchException yakaladı ");
        }

        System.out.println("metod bitti");

    }

    public static void divWithTryOne() {
        System.out.println("please enter two number");


        try {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            System.out.printf("%d / %d = %d", n1, n2, n1/n2);
        }catch (Exception e) {
            System.out.println("Exception yakalandı");
            System.out.println(e.getMessage());
        }

    }
}
