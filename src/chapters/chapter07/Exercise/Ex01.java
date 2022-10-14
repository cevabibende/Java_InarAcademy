package chapters.chapter07.Exercise;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of student");
        int numberOfStudent = input.nextInt();


        double[] scores = getScores(input, numberOfStudent);

        double bestScore = getBestScore(numberOfStudent, scores);

        getGrades(scores, bestScore);

    }

    private static void getGrades(double[] scores, double bestScore) {
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= bestScore - 10){
                System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is A");
            }else if (scores[i] >= bestScore - 20) {
                System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is B");
            } else if (scores[i] >= bestScore - 30) {
                System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is C");
            }else if (scores[i] >= bestScore - 40) {
                System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is D");
            }else {
                System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is F");
            }
        }
    }

    private static double getBestScore(int numberOfStudent, double[] scores) {
        double bestScore = scores[0];
        for (int i = 1; i < numberOfStudent; i++) {
            if (bestScore <= scores[i]){
                bestScore = scores[i];
            }
        }
        return bestScore;
    }

    private static double[] getScores(Scanner input, int numberOfStudent) {
        System.out.println("Enter " + numberOfStudent + " scores");
        double[] scores = new double[numberOfStudent];
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextDouble();
        }
        return scores;
    }
}
