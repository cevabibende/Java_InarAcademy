package chapters.chapter07.Exercise;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

import static chapters.chapter07.Exercise.denem.printNames;

public class Ex17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of students");
        int numberOfStudent = input.nextInt();

        String[] names = new String[numberOfStudent];
        getNamesOfStudents(names,input);

        int[] scores = new int[numberOfStudent];
        getScoresOfStudents(scores,input);

        System.out.println("NAMES");
        System.out.println(Arrays.toString(names));
        System.out.println("SCORES");
        System.out.println(Arrays.toString(scores));

        sortDecrisingOrderTheNames(names,scores);
        printNames(names,scores);

    }

    public static void printNames(String[] names, int[] scores) {
        for (int i = 0; i <names.length ; i++) {
            System.out.println(names[i] + " --> " + scores[i] + " points");
        }
    }
    private static void sortDecrisingOrderTheNames(String[] names, int[] scores) {
        for (int i = 0; i < scores.length; i++) {
            int max = scores[i];
            int maxIndex = i;
            String temp = "";

            for (int j = i + 1; j < scores.length; j++) {
                if (max < scores[j]){
                    max = scores[j];
                    maxIndex = j;
                }
            }
            if (maxIndex != i){
                temp = names[i];
                names[i] = names[maxIndex];
                names[maxIndex] = temp;

                scores[maxIndex] = scores[i];
                scores[i] = max;
            }
        }
    }
    private static void getScoresOfStudents(int[] scores, Scanner input) {
        System.out.println("enter the scores of students");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
    }
    private static void getNamesOfStudents(String[] names, Scanner input) {
        System.out.println("enter the names of students");
        for (int i = 0; i < names.length; i++) {
            names[i] = input.next();
        }
    }
}
