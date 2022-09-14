package chapters.chapter05.exercises;
import java.util.Scanner;
public class Exercise02_RepeatAdditions {
	public static void main(String[] args) {		
		Scanner input = new Scanner(System.in);
		long startTime = System.currentTimeMillis();
		int cCount = 0;
		int wCount = 0;
		int sayac = 0;
		while(sayac < 5) {
			int num1 = (int)(Math.random() * 15);
			int num2 = (int)(Math.random() * 15);
			System.out.println(num1 + " + " + num2 + " = ?");
			int answer = input.nextInt();
			if(answer == num1 + num2) {
				System.out.println("congrats correct answer");
				cCount++;
			}else {
				System.out.println("don't man wrong answer");
				wCount++;
			}
			sayac++;
		}
		long endTime = System.currentTimeMillis();
		long time = (endTime - startTime) / 1000 ;
		System.out.println("your response time is: " + time);
		System.out.println("correct: " + cCount + "    wrong: " + wCount);	
	}
}
