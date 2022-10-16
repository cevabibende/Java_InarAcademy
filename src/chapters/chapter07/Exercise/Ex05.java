package chapters.chapter07.Exercise;



import java.util.Scanner;

/*
    (Print distinct numbers) Write a program that reads in ten numbers and displays
    the number of distinct numbers and the distinct numbers separated by exactly one
    space (i.e., if a number appears multiple times, it is displayed only once). (Hint:
    Read a number and store it to an array if it is new. If the number is already in the
    array, ignore it.) After the input, the array contains the distinct numbers. Here is
    the sample run of the program:
     */
public class Ex05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten number for find distinct of numbers");
        int FINALNUMBEROFNUMBERS = 10;
        int num;
        int count = 0;
        int[] distincNumbers = new int[FINALNUMBEROFNUMBERS];

        getNumbers(input, count, distincNumbers);
        writeDistinctNumbers(distincNumbers);
    }
    private static void writeDistinctNumbers(int[] distincNumbers) {
        for (int i = 0; i < distincNumbers.length; i++) {
            if (distincNumbers[i] > 0){
                System.out.print(" - " + distincNumbers[i] + " - ");
            }
        }
    }
    private static void getNumbers(Scanner input, int count, int[] distincNumbers) {
        int num;
        for (int i = 0; i < distincNumbers.length; i++) {
            num = input.nextInt();
            if (isDistinct(distincNumbers,num)){
                distincNumbers[count] = num;
                count++;
            }
        }
        System.out.println("the numbers of distinct number are: " + count);
    }
    private static boolean isDistinct(int[] distincNumbers, int num) {
        for (int i = 0; i < distincNumbers.length; i++) {
            if (num == distincNumbers[i]){
                return false;
            }
        }
        return true;
    }
}
