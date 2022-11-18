package chapters.chapter11.exercises.Ex04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MaximumElementInArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> list = getNumbersFromUser();

        Integer max = max(list);
        System.out.println("The largest number is : " + max);

    }

    public static ArrayList<Integer> getNumbersFromUser() {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> result = new ArrayList<>();

        System.out.println("Enter your numbers (ending enter 0)");
        int number;
        do {
            number = input.nextInt();
            result.add(number);

        } while (number != 0);
        return result;
    }

    public static Integer max(ArrayList<Integer> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        return Collections.max(list);

    }
}
