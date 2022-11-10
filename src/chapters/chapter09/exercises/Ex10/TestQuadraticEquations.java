package chapters.chapter09.exercises.Ex10;

import java.util.Scanner;

public class TestQuadraticEquations {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a, b, c values");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquations equations = new QuadraticEquations(a, b, c);
        equations.display();
    }
}
