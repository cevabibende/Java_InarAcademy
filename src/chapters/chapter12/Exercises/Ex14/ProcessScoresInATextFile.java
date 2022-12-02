package chapters.chapter12.Exercises.Ex14;

import java.io.File;
import java.util.Scanner;

public class ProcessScoresInATextFile {

    //"C:\Users\Cevabı Bende\Desktop\workspace\InarAcademy\Java_InarAcademy\src\chapters\chapter12\Exercises\Ex14\scores.txt"
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your file pathname");
        String pathName = input.nextLine();
        File file = new File(pathName);

        if (!file.exists()) {
            System.out.println("There is no such file");
            System.exit(0);
        }

        input = new Scanner(file);
        int counter = 0;
        double sum = 0;
        while (input.hasNext()) {

            sum += Double.parseDouble(input.next());
            counter++;

        }
        System.out.printf("Total score is-->%.2f\nAverage of scores is-->%.2f " ,sum,(sum / counter));
    }
}
