package chapters.chapter06.exercises;

import java.util.Scanner;

public class Ex06_DisplayPatterns {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of lines");
        int line = input.nextInt();

        for (int i = 1; i < line; i++) {
            firstTriangel(line, i);
            secondTriangel(line, i);
        }
    }
    private static void secondTriangel(int line, int i) {
        for (int j = i; j >= 1 ; j--) {
            System.out.printf("%3d",j);
        }
        System.out.println();
    }
    private static void firstTriangel(int line, int i) {
        for (int j = line - i; j >= 1; j--) {
            System.out.print("   ");
        }
    }
}
