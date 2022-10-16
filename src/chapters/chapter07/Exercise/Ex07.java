package chapters.chapter07.Exercise;

/*
(Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Ex07 {
    public static void main(String[] args) {
        int numberOfNumbers = 100;
        int numberOfBetween = 10;
        int[] number = new int[numberOfNumbers];

        generateRandomNumber(numberOfNumbers, numberOfBetween, number);
        int[] counts = countNumbers(numberOfBetween, number);
        printNumbers(number, counts);
    }
    private static void printNumbers(int[] number, int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (number[i] == 1) {
                System.out.println(i + " occurs " + counts[i] + " time");
            }else{
                System.out.println(i + " occurs " + counts[i] + " times");
            }
        }
    }
    private static int[] countNumbers(int numberOfBetween, int[] number) {
        int[] counts = new int[numberOfBetween];
        for (int i = 0; i < number.length; i++) {
            counts[number[i]]++;
        }
        return counts;
    }
    private static void generateRandomNumber(int numberOfNumbers, int numberOfBetween, int[] number) {
        for (int i = 0; i < numberOfNumbers; i++) {
            number[i] = (int) (Math.random() * numberOfBetween);
            if ((i + 1) % 10 == 0) {
                System.out.println(" " + number[i]);
            }else {
                System.out.print(" " + number[i]);
            }
        }
    }
}
