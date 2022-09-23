package chapters.chapter05.exercises;

import java.util.Scanner;
public class dene {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter 2 digit number");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int gcd = num1 < num2 ? num1 : num2;

		while(gcd > 0) {
			if (num1 % gcd == 0 && num2 % gcd == 0) {
				System.out.println(gcd);
				break;
			}
			gcd--;
		}
	}
}
