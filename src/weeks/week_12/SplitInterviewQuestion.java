package weeks.week_12;

import java.util.Scanner;

public class SplitInterviewQuestion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("write to your CV");
        String cv = input.nextLine();
        String[] count = cv.trim().split("\\s");
        System.out.println(count.length);
    }
}
