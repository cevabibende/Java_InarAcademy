package chapters.chapter07.Exercise;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] integersToSkip = getSkipNumbers(input);

        int randomNumber = getRandomNumber(integersToSkip);
    }

    private static int getRandomNumber(int[] integersToSkip) {
        int randomNumber = -1;
        boolean isExclude = true;
        while (isExclude) {
            isExclude = false;
            randomNumber = (int) (1 + Math.random() * 54);

            for (int i = 0; i < integersToSkip.length; i++) {
                if (randomNumber == integersToSkip[i]) {
                    isExclude = true;
                    break;
                }
            }
        }
        System.out.println("my random number " + randomNumber);
        return randomNumber;
    }

    private static int[] getSkipNumbers(Scanner input) {
        System.out.println("Enter the number Of Numbers To Skip ");
        int numberOfNumbersToSkip = input.nextInt();
        int[] integersToSkip = new int[numberOfNumbersToSkip];
        System.out.println("enter integers To Skip");
        for (int i = 0; i < integersToSkip.length; i++) {
            integersToSkip[i] = input.nextInt();
        }
        System.out.println("numbers To Skip : " + Arrays.toString(integersToSkip));
        return integersToSkip;
    }
}
