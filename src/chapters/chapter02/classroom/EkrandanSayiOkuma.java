package chapters.chapter02.classroom;

import java.util.Scanner;

public class EkrandanSayiOkuma {
	public static void main(String[] args) {
		
		Scanner klavye = new Scanner(System.in);
		
		System.out.println("enter a new number: ");
		
		int sayi = klavye.nextInt();
		
		System.out.println("the number yoou added: " + sayi);
	}

}
