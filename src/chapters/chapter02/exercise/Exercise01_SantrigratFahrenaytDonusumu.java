package chapters.chapter02.exercise;

import java.util.Scanner;

public class Exercise01_SantrigratFahrenaytDonusumu {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("Santigrat değeri giriniz: ");
		
		int santigrat = klavye.nextInt();
		
		double fahrenhayt = (9.0 / 5) * santigrat + 32;
		
		System.out.println(santigrat + " Santigrat derece " + fahrenhayt + " fahrenhayttır");
	}
}