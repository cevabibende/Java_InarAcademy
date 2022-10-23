package chapters.chapter07.Exercise;

import java.util.Scanner;

public class Ex19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("first number in the input indicatesthe number of the elements in the list");
        System.out.println("Enter list: ");
        int numberOfTheElements = input.nextInt();

        int[] elements = getElements(input, numberOfTheElements);
        displayElements(elements);
        isSorted(elements);
    }

    private static int[] getElements(Scanner input, int numberOfTheElements) {
        int[] elements = new int[numberOfTheElements];

        for (int i = 0; i < elements.length; i++) {
            elements[i] = input.nextInt();
        }
        return elements;
    }

    private static void displayElements(int[] elements) {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(elements[i] + " ");
        }
    }
    private static boolean isSorted(int[] elements) {
        for (int i = 0; i < elements.length - 1; i++) {
            if (elements[i] > elements[i +  1]){
                System.out.println();
                System.out.println("The list is not sorted");
                return false;
            }
        }
        System.out.println();
        System.out.println("The list already sorted");
        return true;
    }
}
