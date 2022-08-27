package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise03_FeetToMetre {
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Metre Dönüşümü için Feet değeri giriniz: ");
		
		double feet = klavye.nextDouble();
		
		double feetToMetre = feet * 0.305;
		
		System.out.println(feet + " Feet " + feetToMetre + " metredir"  );
	}
	
	

}
