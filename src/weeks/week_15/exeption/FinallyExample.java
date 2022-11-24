package weeks.week_15.exeption;

import com.sun.org.apache.xalan.internal.xsltc.dom.AdaptiveResultTreeImpl;

import java.util.Scanner;

public class FinallyExample {
    private final static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        div();
    }

    private static void div() {
        System.out.println("please enter two number");


        try {
            int n1 = input.nextInt();
            int n2 = input.nextInt();
            System.out.printf("%d / %d = %d\n", n1, n2, n1/n2);
        } catch (ArithmeticException arithmeticException) {
            System.out.println("exception - ArithmeticException is handled with try - catch");
        } finally {
            System.out.println("this line the finally");
        }

        System.out.println("end of method");

    }
}
