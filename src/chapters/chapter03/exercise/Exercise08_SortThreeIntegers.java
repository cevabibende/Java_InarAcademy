package chapters.chapter03.exercise;

import java.util.Scanner;

public class Exercise08_SortThreeIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter three integers for non-decreasing order: ");
		
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		int num3 = input.nextInt();
		
		
		if (num1 == num2 && num2 == num3) {
			System.out.println("you entered all numbers equal please enter different numbers");
		} else if(num1 == num2) {
			System.out.println("1st number is equal to 2nd number, please enter different numbers");
		} else if(num1 == num3) {
			System.out.println("1st number is equal to 3nd number, please enter different numbers");
		} else if(num2 == num3) {
			System.out.println("2st number is equal to 3nd number, please enter different numbers");
		} else if (num1 > num2 && num1 > num3 && num2 > num3) {
			
			System.out.println(num3 + "<" + num2 + "<" + num1);
			
		} else if(num1 > num2 && num1 > num3 && num3 > num2) {
			
			System.out.println(num2 + "<" + num3 + "<" + num1);
			
		} else if (num2 > num1 && num2 > num3 && num1 > num3) {
			
			System.out.println(num3 + "<" + num1 + "<" + num2);
		} else if (num2 > num1 && num2 > num3 && num3 > num1) {
			
			System.out.println(num1 + "<" + num3 + "<" + num2);
		} else if (num3 > num1 && num3 > num2 && num1 > num2) {
			
			System.out.println(num2 + "<" + num1 + "<" + num3);
		} else if (num3 > num1 && num3 > num2 && num2 > num1) {
			
			System.out.println(num1 + "<" + num2 + "<" + num3);
		}
	}

}
