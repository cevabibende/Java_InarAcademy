package chapters.chapter05.classromm;

import java.util.Scanner;

public class SayiTahminOyunu {
	public static void main(String[] args) {
		int sayi = (int)(Math.random() * 101);
		
		Scanner input = new Scanner(System.in);
		System.out.println("0 ile 100 arası bir sayı tahmin ediniz.");
		int tahmin = input.nextInt();
		
		while (sayi != tahmin) {
			if(sayi < tahmin) {
				System.out.println("Büyük bir sayı girdiniz");
			}else {
				System.out.println("Küçük bir sayı girdiniz");
			}
			System.out.println("0 ile 100 arası bir sayı giriniz");
			tahmin = input.nextInt();		
		
		}
		System.out.println("tebrikler!!!!!!!!!");
		
	}

}
