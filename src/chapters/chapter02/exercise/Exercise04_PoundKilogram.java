package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise04_PoundKilogram {
	
	public static void main(String[] args) {
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Kilograma dönüşecek Pound değerini giriniz: ");
		
		double pound = klavye.nextDouble();
		double kilogram = pound * 0.454;
		
		System.out.println(pound + " pound " + kilogram + " kilogramdır" );
	}

}
