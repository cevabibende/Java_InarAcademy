package chapters.chapter07.Exercise;

import java.util.Scanner;

public class denem {
    public static void main(String[] args) {
        System.out.println("----------Assign grades------------");

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student");
        int numberOfStudent = input.nextInt();

        System.out.printf("Enter %d scores: ", numberOfStudent);
        int[] scoresOfStudent = new int[numberOfStudent];
        char[] grades = new char[numberOfStudent];

        getScoreFromUsers(scoresOfStudent);
        printScores(scoresOfStudent);
        System.out.println();
        bestScore(scoresOfStudent);
        getGrade(scoresOfStudent, grades);

        for (int i = 0; i < scoresOfStudent.length; i++) {
            System.out.printf("Student %d score is %d and grade is %s\n", i, scoresOfStudent[i], grades[i]);
        }
    }
    private static void getGrade(int[] scoresOfStudent, char[] grades) {
        for (int i = 0; i < scoresOfStudent.length; i++) {
            if (scoresOfStudent[i] >= bestScore(scoresOfStudent) - 10) {
                grades[i] = 'A';
            } else if (scoresOfStudent[i] >= bestScore(scoresOfStudent) - 20) {
                grades[i] = 'B';
            } else if (scoresOfStudent[i] >= bestScore(scoresOfStudent) - 30) {
                grades[i] = 'C';
            } else if (scoresOfStudent[i] >= bestScore(scoresOfStudent) - 40) {
                grades[i] = 'D';
            } else {
                grades[i] = 'F';
            }

        }

    }
    private static int bestScore(int[] studentsList) {
        int best = -1;
        for (int i = 0; i < studentsList.length - 1; i++) {
            if (studentsList[i] > best) {
                best = studentsList[i];
            }
        }
        return best;
    }
    private static void printScores(int[] studentsList) {
        for (int score : studentsList) {
            System.out.print(score + " ");
        }
    }
    private static void getScoreFromUsers(int[] arr) {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();

        }
    }
}