package chapters.chapter05.classromm;

import java.util.Scanner;

public class CokluCikarmaIslemi {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int sayi1 = (int)(Math.random() * 10);
		int sayi2 = (int)(Math.random() * 10);
		
		if (sayi1 < sayi2) {
			int gecicisayi = sayi1;
			sayi1 = sayi2;
			sayi2 = gecicisayi;
		}
		System.out.println(sayi1 + " - " + sayi2 + " = ?");
		int cevap = input.nextInt();
		
		if(sayi1 - sayi2 == cevap) {
			System.out.println("tebrikler");
		}else {
			System.out.println("yapma dostumm");
		}
		
	
	}

}
