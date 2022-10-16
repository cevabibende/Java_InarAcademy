package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores for your class and enter negative number to finish");
        int[] scores = new int[100];
        int numberOfScores = getScores(input, scores);
        double average = getAccountAverage(scores, numberOfScores);
        numberOfAboveBelowScores(scores, numberOfScores, average);
    }
    public static void numberOfAboveBelowScores(int[] scores, int numberOfScores, double average) {
        int aboveScore = 0;
        int belowscore = 0;
        for (int j = 0; j < numberOfScores -1; j++) {
            if (scores[j] >= average){
                aboveScore++;
            }else {
                belowscore++;
            }
        }
        System.out.println("below scores are : " + belowscore);
        System.out.println("ebove scores are : " + aboveScore);
    }
    public static double getAccountAverage(int[] scores, int numberOfScores) {
        int sum = 0;
        for (int i = 0; i < numberOfScores - 1; i++) {
            sum += scores[i];
        }
        double average = sum / (numberOfScores - 1);
        System.out.println("average is: " + average);
        return average;
    }
    public static int getScores(Scanner input, int[] scores) {
        int score = 0;
        int i = 0;
        while (score >= 0){
            score = input.nextInt();
            scores[i] = score;
            i++;
        }
        return i;
    }
}
