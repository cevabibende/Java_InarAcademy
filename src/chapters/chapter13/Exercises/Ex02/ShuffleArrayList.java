package chapters.chapter13.Exercises.Ex02;

import java.util.ArrayList;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = getNumbers();
        System.out.println("The list before shuffle");
        displayArrayList(list);
        System.out.println("\nThe list after shuffle");
        shuffle(list);
        displayArrayList(list);

    }

    private static ArrayList<Number> getNumbers() {
        ArrayList<Number> numbers = new ArrayList<>();
        for (int i = 0; i <= 20; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    private static void shuffle(ArrayList<Number> list) {
        for (int i = 0; i <list.size() ; i++) {
            int rIndex=(int)(Math.random()*list.size());

            Number temp = list.get(rIndex);
            list.set(rIndex,list.get(i));
            list.set(i,temp);
        }
    }
    private static void displayArrayList(ArrayList<Number> list) {
        for(Number num : list){
            System.out.print(num + " ");
        }
    }

}
