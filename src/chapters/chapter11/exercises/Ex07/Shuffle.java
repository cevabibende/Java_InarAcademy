package chapters.chapter11.exercises.Ex07;

import chapters.chapter11.exercises.Ex04.MaximumElementInArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Shuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list = MaximumElementInArrayList.getNumbersFromUser();
        System.out.println("Shuffled list:");
        shuffle1(list);
    }
    public static void shuffle1(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            int rIndex = (int) (Math.random() * list.size());
            int temp = list.get(rIndex);
            list.set(rIndex, list.get(i));
            list.set(i,temp);
        }
        System.out.println(list.toString());
    }
    public static void shuffle(ArrayList<Integer> list) {
        Collections.shuffle(list);
        for (Integer num : list) {
            System.out.print(num + " ");
        }
    }
}
