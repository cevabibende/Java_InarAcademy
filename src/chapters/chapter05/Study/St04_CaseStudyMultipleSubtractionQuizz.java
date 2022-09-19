package chapters.chapter05.Study;

import java.util.Scanner;

public class St04_CaseStudyMultipleSubtractionQuizz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        long startTime = System.currentTimeMillis();
        String output = "";
        int countW = 0;
        int countR = 0;
        int conclusion = 0;
        int answer = -1;
        int count = 0;
        while(count < 5 ){
            int num1 = (int)(Math.random() * 10);
            int num2 = (int)(Math.random() * 10);
            conclusion = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = ?");
            answer = input.nextInt();
            if(answer == conclusion) {
                System.out.println(num1 + " - " + num2 + " congratulations you know");
                countR++;

            } else {
                System.out.println(num1 + " - " + num2 + " sorry wrong answer");
                countW++;

            }
            output += "\n" + num1 + " - " + num2 + " = " + answer + ((num1 - num2 == answer) ? " correct " : " wrong");

            count++;
        }
        long finishTime = System.currentTimeMillis();
        int time = (int)((finishTime - startTime) / 1000);
        System.out.println("You have " + countR + " right and " + countW + " wrong in " + count + " questions in " + time + " seconds");
        System.out.println(output);
    }

}
