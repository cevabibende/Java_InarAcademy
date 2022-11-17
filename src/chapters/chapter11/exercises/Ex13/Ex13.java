package chapters.chapter11.exercises.Ex13;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser(10);
        
        removeDuplicates(list);
        displayList(list);
    }

    private static void displayList(ArrayList<Integer> list) {
        System.out.println("the distinct numbers are: ");

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }

    private static void removeDuplicates(ArrayList<Integer> list) {
        ArrayList<Integer> removed = new ArrayList<>();

        while (!list.isEmpty()){
            int n = list.remove(0);
            if (!removed.contains(n)){
                removed.add(n);
            }
        }
        list.addAll(removed);
    }

    private static ArrayList<Integer> getFromUser(int numberOfIntegers) {
        Scanner input = new Scanner(System.in);

        System.out.println("enter ten integer: ");
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < numberOfIntegers; i++) {
            list.add(input.nextInt());
        }
        return list;
    }

}
